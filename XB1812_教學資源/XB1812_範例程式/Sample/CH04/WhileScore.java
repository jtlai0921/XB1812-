import java.util.Scanner;
public class WhileScore{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int score = 0;	//���Z����
		int sum = 0;		//�`��
		int cnt = -1;		//�H��
		while(score != -1) {
			cnt++;				//�H�Ʋ֥[
			sum += score;	//�Nscore���Ʋ֥[��sum�`��
			System.out.print("��J����(-1����)�G");
			score = scanner.nextInt();
		}
		System.out.println("�ǥͤH�ơG"+cnt+", �������ơG" +
 (double)sum/cnt);
	}
}
