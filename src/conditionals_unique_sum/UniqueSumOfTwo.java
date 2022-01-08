package conditionals_unique_sum;

public class UniqueSumOfTwo {
	
	// variables
	int number1;
	int number2;
	
	// method that returns an array of unique numbers if input numbers were different
	public int[] makeUnique(int num1, int num2) {
		if (num1 == num2) {
			num1 = 0;
			num2 = 0;
		}
		return new int[] {num1, num2};	
	}
	
	// method that adds unique numbers from an array
	public int sumUniqueNumbers(int[] arrayOfTwo) {
		int sumNumbers = arrayOfTwo[0] + arrayOfTwo[1];
		return sumNumbers;
		
	}

}
