import java.util.*;
public class UseArrays{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		int[] arr = {25, 17, 95, 47, 23, 3, 65 ,13, 50, 86, 77};
 
		System.out.print("�Ƨǫe: "); 
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	 
		Arrays.sort(arr);
	 
		System.out.print("�Ƨǫ�: "); 
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	 
		int find;
		System.out.print("\n�п�J�j�M����: "); 
		int key = scanner.nextInt();
		if((find = Arrays.binarySearch(arr, key)) > -1)
			System.out.println("���j�M���Ȧ����� " + find + " ��m"); 
		else 
			System.out.println("�}�C�����s�b�j�M����"); 
	}
}
