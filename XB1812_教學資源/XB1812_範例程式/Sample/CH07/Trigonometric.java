import java.util.*;
class Trigonometric{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("請入角度值:");
		double angle= sc.nextDouble();
		//求輸入角度之弧度
		double arc=Math.toRadians(angle);
		System.out.println("弧度="+ arc);
		//計算輸入角度之sin值
		System.out.println("sin="+ Math.sin(arc) );
		//計算輸入角度之cos值
		System.out.println("cos="+ Math.cos(arc) );
		//計算輸入角度之tan值
		System.out.println("tan="+ Math.tan(arc) );
	}
}
