import java.util.Scanner;
public class IfSample_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int input = scanner.nextInt();
		int remain = input % 2;
		if(remain == 1)
			System.out.println(input + "為奇數");
		else
			System.out.println(input + "為偶數");
	}
}
