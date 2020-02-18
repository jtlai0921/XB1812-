public class OpeSample_3{
	public static void main(String args[]){
		int i=5, j=10, k;
		i+=10;
		System.out.println("i的值="+i);
		i-=2;
		System.out.println("i的值="+i);
		
		//當i>j成立時，將i的值指定給k`,不成立則將j的值指定給k		
		k=i>j?i:j;
		System.out.println("k的值="+k);
	}
}
