import java.util.*;
public class DivException_1{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.print("�п�J���l��:");
			int a = scanner.nextInt();
			System.out.print("�п�J������:");
			int b = scanner.nextInt();
			System.out.println(a+"���H"+b+"����:"+a/b); 
		}catch (ArithmeticException e){
		 	System.out.println("���Ƥ��ର0"); 
		}catch (InputMismatchException e){
			System.out.println("��J���ƭȥ�������Ƽƭ�");
		}
	}
}
