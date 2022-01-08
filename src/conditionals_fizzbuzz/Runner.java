package conditionals_fizzbuzz;

public class Runner {

	public static void main(String[] args) {
	
		int num = 25;
		
		FizzBuzz fb = new FizzBuzz();
		String[] answer = fb.getMultiples(num);
		System.out.println(answer[0] + answer[1]);

	}

}
