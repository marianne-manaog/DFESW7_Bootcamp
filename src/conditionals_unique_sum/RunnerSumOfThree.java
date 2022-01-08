package conditionals_unique_sum;

public class RunnerSumOfThree {

	public static void main(String[] args) {
		
		UniqueSumOfThree uniquesum = new UniqueSumOfThree();
		int totalSum = uniquesum.smartSum(3, 9, 9);
		System.out.println("The total sum is: " + totalSum);
	}

}
