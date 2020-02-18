import java.util.Scanner;
public class WhileScore{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int score = 0;	//Θ罿だ计
		int sum = 0;		//羆だ
		int cnt = -1;		//计
		while(score != -1) {
			cnt++;				//计仓
			sum += score;	//盢scoreだ计仓sum羆だ
			System.out.print("块だ计(-1挡)");
			score = scanner.nextInt();
		}
		System.out.println("厩ネ计"+cnt+", キАだ计" +
 (double)sum/cnt);
	}
}
