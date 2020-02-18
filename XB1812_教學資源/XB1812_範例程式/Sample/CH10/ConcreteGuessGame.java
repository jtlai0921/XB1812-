import java.util.Scanner;
public class ConcreteGuessGame extends AbstractGuessGame{
  private Scanner scanner;
  public ConcreteGuessGame(){
    scanner = new Scanner(System.in);
  }
  void setNumber(){
  	number = (int)(Math.random()*100);
  }
  void showMessage(String msg){
  	System.out.println(msg + "!!");
  }
  int getUserInput(){
  	System.out.print("請輸入一個數字: ");
  	return scanner.nextInt();
  }
}
