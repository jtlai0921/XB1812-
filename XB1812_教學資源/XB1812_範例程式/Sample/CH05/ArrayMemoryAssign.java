public class ArrayMemoryAssign{
	public static void main(String[] args){
    int[] A= {1,2,3};
    int[] B= new int[3];
    for (int i=0; i<A.length; i++)		//��ܰ}�CA�����e
       System.out.println("A["+i+"]="+A[i]);
       
    B=A;	//�N�}�CA���O�����}���w���}�CB
    for (int i=0; i<B.length; i++)		//��ܰ}�CB�����e
       System.out.println("B["+i+"]="+B[i]);

    A[2]=100; //���ܰ}�CA[2]�����e
    System.out.println("B[2]="+B[2]); //���G�}�CB[2]�����e�]�O100
	}
}    
