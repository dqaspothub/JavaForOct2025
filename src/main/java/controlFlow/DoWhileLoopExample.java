package controlFlow;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		int tries = 1;

		boolean wantToPlayAgain = true;

		do {
		    System.out.println("Playing the game. Try #" + tries);
		    tries++;
		} while (tries<=5);


	}
}

/*

int chocolates = 5;

while (chocolates > 0) {
		System.out.println("Rahul eats a chocolate 🍫");
chocolates--;
		}
*/
