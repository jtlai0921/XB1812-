import java.util.*;
class IfSample_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入成績:");
		int score = sc.nextInt();
		if (score>=60){ 
			System.out.println("恭喜及格了");
			System.out.println("成績是:"+score);
		}else{
			System.out.println("抱歉沒有及格");
			System.out.println("分數還差:"+(60-score));
		}                
		System.out.println("—程式結束--");
	}
}
