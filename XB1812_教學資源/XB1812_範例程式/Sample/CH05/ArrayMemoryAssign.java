public class ArrayMemoryAssign{
	public static void main(String[] args){
    int[] A= {1,2,3};
    int[] B= new int[3];
    for (int i=0; i<A.length; i++)		//顯示陣列A的內容
       System.out.println("A["+i+"]="+A[i]);
       
    B=A;	//將陣列A的記憶體位址指定給陣列B
    for (int i=0; i<B.length; i++)		//顯示陣列B的內容
       System.out.println("B["+i+"]="+B[i]);

    A[2]=100; //改變陣列A[2]的內容
    System.out.println("B[2]="+B[2]); //結果陣列B[2]的內容也是100
	}
}    
