import java.util.Scanner;
public class IfSample_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��J���ơG");
		int score = scanner.nextInt();
		if(score >= 90)
			System.out.println("�oA");
		else if(score >= 80 && score < 90)
			System.out.println("�oB");
		else if(score >= 70 && score < 80)
			System.out.println("�oC");
		else if(score >= 60 && score < 70)
			System.out.println("�oD");
		else
			System.out.println("�oE(���ή�)");
	}
}
