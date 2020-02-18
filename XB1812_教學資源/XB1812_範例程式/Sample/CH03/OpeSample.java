public class OpeSample{
	public static void main(String args[]){
		int i,j=5; //指定j的值為5
		i=++j;	//j的值加1後，指定給i
		System.out.println("i="+i);
		i=j++;	//指定j的值給i後，j的值加1
		System.out.println("i="+i);
		i=--j;	//j的值減1後，指定給i
		System.out.println("i="+i);
		i=j--;	//指定j的值給i後，j的值減1
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
