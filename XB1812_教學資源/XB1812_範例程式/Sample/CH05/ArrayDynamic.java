import java.util.Scanner;
public class ArrayDynamic{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�}�C�j�p:");
		int value = scanner.nextInt();	//�N�ϥΪ̿�J���ȫ��w��value
		int[] score = new int[value]; 		//�ʺA�t�m����
		System.out.println("�}�C����: " + score.length);
		System.out.print("���e: ");
		for(int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		
		System.out.println();
	}
}
