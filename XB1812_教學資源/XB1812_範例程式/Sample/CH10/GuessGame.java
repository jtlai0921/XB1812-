public class GuessGame{
public static void main(String[] args) {
	AbstractGuessGame guessGame = new ConcreteGuessGame();
	guessGame.setNumber();
	guessGame.start();
}
}
