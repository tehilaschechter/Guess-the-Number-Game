import java.util.Scanner;

public class guessNum {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner inputStream = new Scanner(System.in);
		int randomNum;
		int playerGuess;
		int numTries = 0;
		boolean game = true;
		
		System.out.println("Welcome to **Guess the Number**");
		System.out.println("---------------------------------");
		System.out.print("Guess a number between 0 and 100: ");
		
		randomNum = (int) Math.round(Math.random() * 100);
		
		while(game) {
			playerGuess = inputStream.nextInt();
			numTries++;
			
			System.out.println("");
			System.out.print("Your guess of " + playerGuess + " was ");
			
			if(playerGuess < randomNum) {
				System.out.println("too low. Try again: ");
			}
			else if (playerGuess > randomNum) {
				System.out.println("too high. Try again: ");
			}
			else if (playerGuess == randomNum) {
				System.out.print("just right! You won in " + numTries + " tries!!");
				break;
			}
		}
	}
}
