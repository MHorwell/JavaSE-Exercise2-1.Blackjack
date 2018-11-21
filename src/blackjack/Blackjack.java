package blackjack;

public class Blackjack {
	
	public static void main(String[] args) {
		
		System.out.println(closestToTwentyOne(20, 20));
	}
	
	public static int closestToTwentyOne(int numberOne, int numberTwo) {
		if (21 - numberOne < 21 - numberTwo && numberOne <= 21) {
			return numberOne;
		}
		else if (21 - numberOne < 21 - numberTwo && numberTwo <= 21) {
			return numberTwo;
		}
		else if (numberOne == numberTwo && numberOne <= 21) {
			return numberOne;
		} else {
			return 0;
		}
	}
	
	
}