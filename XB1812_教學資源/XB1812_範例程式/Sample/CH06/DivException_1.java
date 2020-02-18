import java.util.*;
public class DivException_1{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入分子數:");
			int a = scanner.nextInt();
			System.out.print("請輸入分母數:");
			int b = scanner.nextInt();
			System.out.println(a+"除以"+b+"等於:"+a/b); 
		}catch (ArithmeticException e){
		 	System.out.println("除數不能為0"); 
		}catch (InputMismatchException e){
			System.out.println("輸入的數值必須為整數數值");
		}
	}
}
