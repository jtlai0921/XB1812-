public abstract class AbstractGuessGame{
  int number;
  public void start(){
  	showMessage("�w��i�J���C��");
  	int guess;
  	do{
  		guess = getUserInput();
    	if(guess > number){
    		showMessage("�Ʀr�Ӥj");
    	}else if(guess < number){
    		showMessage("�Ʀr�Ӥp");
    	}else
    	  showMessage("���߲q���F");
     }while(guess != number);
  }
  abstract void setNumber();
  abstract void showMessage(String msg);
  abstract int getUserInput();
}
