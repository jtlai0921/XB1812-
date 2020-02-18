import java.util.Scanner;
public class IfSample{
	public static void main(String[] args) {
       System.out.print("請輸入成績:");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade >= 60) {
            System.out.println("成績及格!");
        }
   }
}
