import java.util.Scanner;
public class GuessGame{
  public static void main(String[] args){
    System.out.println("猜數字遊戲:");
    Game myPlay=new Game();
    myPlay.getRandom();
    Scanner scan=new Scanner(System.in);
    System.out.println("遊戲開始....");
    boolean flag=true;
    int guess;
    while (flag){
      System.out.print("請輸入一個數:");
      guess=scan.nextInt();
      myPlay.cnt++;
      if (guess>myPlay.ans)
        System.out.println("太大");
      else if (guess<myPlay.ans)
        System.out.println("太小");
      else{
        System.out.println("賓果!! 你總共猜了" +myPlay.cnt+" 次");
        flag=false;
      }
    }
  }
}	 	
class Game{
  int ans;
  int cnt;
  public void getRandom(){
    int x = (int)(Math.random()*100);
    ans=x;
  }
}
