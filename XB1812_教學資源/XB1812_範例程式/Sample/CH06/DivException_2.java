import java.util.*;
public class DivException_2{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.print("�п�J���l��:");
			int a = scanner.nextInt();
			System.out.print("�п�J������:");
			int b = scanner.nextInt();
			System.out.println(a+"���H"+b+"����:"+a/b); 
		}catch (Exception e){
		 	System.out.println("����o�ͨҥ~");
		}
	}
}
