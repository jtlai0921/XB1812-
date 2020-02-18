import java.util.*;
class GuessGame{
	public static void main(String args[]){
		//隨機取一個0~100之間的整數
		int answer=(int)(Math.random()*100);
		 answer=96;
		//建構輸入物件0
		Scanner sc=new Scanner(System.in);
		//宣告使用的變數與常數
		final int limit=7;	//次數上限
		boolean flag=false;	//判斷旗號，true表示猜中
		int guess; 			//使用者猜的數
		int cnt=0;			//猜的累計次數
		//條件:判斷期號不是true且cnt小於上限則繼續執行迴圈
		while ( !flag && cnt<limit){
			cnt++;
			System.out.print("請輸入猜的數:");
			guess=sc.nextInt();
			if (guess==answer)
				flag=true; //猜中了
			else if (guess>answer)
				System.out.println("太大");
			else
				System.out.println("太小");
		}
		//迴圈結束，判斷是猜中還是到達上限才結束?
		if (flag)
			System.out.println("恭喜猜中，猜的次數："+cnt);
		else
			System.out.println("已到達上限次數，答案是:"+answer);	 	  
	 }
}
