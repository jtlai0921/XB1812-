public class TypeConv_2{
	public static void main(String args[]){
		int i=5, k=12;
		double j=i;
		System.out.println("浮點 j 的值為："+j);
		
		j=(k/i);
		System.out.println(k+"除以"+i+"的結果為"+j);
		
		j=(double)k/(double)i;
 		System.out.println(k+"除以"+i+"的結果為"+j);

	}
}
