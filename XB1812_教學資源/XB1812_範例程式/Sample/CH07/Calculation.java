import java.util.*;
class Calculation{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("請入a的值:");
		int a= sc.nextInt();
		System.out.print("請入b的值:");
		int b= sc.nextInt();
		
		//比較a, b的大小
		System.out.println("大的數是:"+Math.max(a,b)+", 小的數是:"+Math.min(a,b) );
		//計算a的b次方
		System.out.println(a+"的"+b+"次方="+Math.pow(a,b) );
		//計算a,b的根號
		System.out.println(a+"開根號="+Math.sqrt(a) );
		System.out.println(b+"開根號="+Math.sqrt(b) );
	}
}
