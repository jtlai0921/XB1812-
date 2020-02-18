import java.util.Scanner;
public class ArrayDynamic{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入陣列大小:");
		int value = scanner.nextInt();	//將使用者輸入的值指定給value
		int[] score = new int[value]; 		//動態配置長度
		System.out.println("陣列長度: " + score.length);
		System.out.print("內容: ");
		for(int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		
		System.out.println();
	}
}
