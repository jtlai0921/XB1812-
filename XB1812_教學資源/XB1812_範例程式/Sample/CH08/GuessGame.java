import java.util.Scanner;
public class GuessGame{
  public static void main(String[] args){
    System.out.println("�q�Ʀr�C��:");
    Game myPlay=new Game();
    myPlay.getRandom();
    Scanner scan=new Scanner(System.in);
    System.out.println("�C���}�l....");
    boolean flag=true;
    int guess;
    while (flag){
      System.out.print("�п�J�@�Ӽ�:");
      guess=scan.nextInt();
      myPlay.cnt++;
      if (guess>myPlay.ans)
        System.out.println("�Ӥj");
      else if (guess<myPlay.ans)
        System.out.println("�Ӥp");
      else{
        System.out.println("���G!! �A�`�@�q�F" +myPlay.cnt+" ��");
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
