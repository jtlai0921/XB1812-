import java.util.*;
public class Division{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J���l��:");
		int a = scanner.nextInt();
		System.out.print("�п�J������:");
		int b = scanner.nextInt();
		//�D a��b 
		if(b != 0)
		 	System.out.println(a+"���H"+b+"����:"+(a/b)); 
		else 
    		System.out.println("���Ƥ��ର0"); 
	}
}
