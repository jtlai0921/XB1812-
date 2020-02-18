import java.util.*;
public class Division{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分子數:");
		int a = scanner.nextInt();
		System.out.print("請輸入分母數:");
		int b = scanner.nextInt();
		//求 a÷b 
		if(b != 0)
		 	System.out.println(a+"除以"+b+"等於:"+(a/b)); 
		else 
    		System.out.println("除數不能為0"); 
	}
}
