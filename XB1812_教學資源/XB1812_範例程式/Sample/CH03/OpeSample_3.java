public class OpeSample_3{
	public static void main(String args[]){
		int i=5, j=10, k;
		i+=10;
		System.out.println("i����="+i);
		i-=2;
		System.out.println("i����="+i);
		
		//��i>j���߮ɡA�Ni���ȫ��w��k`,�����߫h�Nj���ȫ��w��k		
		k=i>j?i:j;
		System.out.println("k����="+k);
	}
}
