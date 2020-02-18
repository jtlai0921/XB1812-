import java.util.*;
public class DivException_2{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入分子數:");
			int a = scanner.nextInt();
			System.out.print("請輸入分母數:");
			int b = scanner.nextInt();
			System.out.println(a+"除以"+b+"等於:"+a/b); 
		}catch (Exception e){
		 	System.out.println("執行發生例外");
		}
	}
}
