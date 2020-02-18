public abstract class AbstractGuessGame{
  int number;
  public void start(){
  	showMessage("歡迎進入本遊戲");
  	int guess;
  	do{
  		guess = getUserInput();
    	if(guess > number){
    		showMessage("數字太大");
    	}else if(guess < number){
    		showMessage("數字太小");
    	}else
    	  showMessage("恭喜猜中了");
     }while(guess != number);
  }
  abstract void setNumber();
  abstract void showMessage(String msg);
  abstract int getUserInput();
}
