import java.util.Scanner;
public class IfSample_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�Ʀr: ");
		int input = scanner.nextInt();
		int remain = input % 2;
		if(remain == 1)
			System.out.println(input + "���_��");
		else
			System.out.println(input + "������");
	}
}
