import java.util.*;
public class UseArrays{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		int[] arr = {25, 17, 95, 47, 23, 3, 65 ,13, 50, 86, 77};
 
		System.out.print("排序前: "); 
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	 
		Arrays.sort(arr);
	 
		System.out.print("排序後: "); 
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	 
		int find;
		System.out.print("\n請輸入搜尋的值: "); 
		int key = scanner.nextInt();
		if((find = Arrays.binarySearch(arr, key)) > -1)
			System.out.println("找到搜尋的值位於索引 " + find + " 位置"); 
		else 
			System.out.println("陣列中不存在搜尋的值"); 
	}
}
