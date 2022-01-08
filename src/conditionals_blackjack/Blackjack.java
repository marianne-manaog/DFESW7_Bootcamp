package blackjack;

public class Blackjack {

	int number1;
	int cleanedNumber1;
	int number2;
	int cleanedNumber2;
	int maxNumber = 21;
	int difference1;
	int difference2;
			
	public int cleanData(int number)	{	
		if (number > 21) {
			number = 0;
		}
		return number;
	}
	
	public void decidesWinner(int number1, int number2) {
		cleanedNumber1 = cleanData(number1);
		cleanedNumber2 = cleanData(number2);
		
		difference1 = maxNumber - cleanedNumber1;
		difference2 = maxNumber - cleanedNumber2;
		if (difference1 < difference2) {
			System.out.println(cleanedNumber1);
		} else {
			System.out.println(cleanedNumber2);
		}
		
	}
			
}
