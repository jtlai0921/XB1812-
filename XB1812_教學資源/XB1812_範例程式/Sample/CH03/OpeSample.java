public class OpeSample{
	public static void main(String args[]){
		int i,j=5; //���wj���Ȭ�5
		i=++j;	//j���ȥ[1��A���w��i
		System.out.println("i="+i);
		i=j++;	//���wj���ȵ�i��Aj���ȥ[1
		System.out.println("i="+i);
		i=--j;	//j���ȴ�1��A���w��i
		System.out.println("i="+i);
		i=j--;	//���wj���ȵ�i��Aj���ȴ�1
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
