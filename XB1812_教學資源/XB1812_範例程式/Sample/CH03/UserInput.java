import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�ǥͤ��ơG");
		int scoreOfStudent = scanner.nextInt();
		System.out.println("�ӥͬO�_�ή�? " +
             (scoreOfStudent >= 60 ? '�O' : '�_'));
	}
}
