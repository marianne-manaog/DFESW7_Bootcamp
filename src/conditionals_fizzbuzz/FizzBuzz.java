package conditionals_fizzbuzz;

public class FizzBuzz {

	int number;
	String myTextString = "";
	String myNumString = "";
	
	public String[] getMultiples(int number) {
		if (number % 3 == 0) {
			myTextString += "Fizz";
		} 
		if (number % 5 == 0) {
			myTextString += "Buzz";
		}
		if (number % 3 != 0 && number % 5 != 0) {
			myNumString = Integer.toString(number);
		}
		return new String[] {myTextString, myNumString};
	}
}
