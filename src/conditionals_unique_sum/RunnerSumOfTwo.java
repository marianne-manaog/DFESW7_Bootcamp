package conditionals_unique_sum;

public class RunnerSumOfTwo {

	public static void main(String[] args) {

		UniqueSumOfTwo uniquesum = new UniqueSumOfTwo();
		int[] result = uniquesum.makeUnique(5, 5);
		int mySum = uniquesum.sumUniqueNumbers(result);
		System.out.println("The first cleaned number is: " + result[0]);
		System.out.println("The second cleaned number is: " + result[1]);
		System.out.println("Their sum is: " + mySum);
	}
}
