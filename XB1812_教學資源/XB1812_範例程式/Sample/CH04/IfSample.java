import java.util.Scanner;
public class IfSample{
	public static void main(String[] args) {
       System.out.print("�п�J���Z:");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade >= 60) {
            System.out.println("���Z�ή�!");
        }
   }
}
