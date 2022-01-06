package calculator;

public class runner {

	public static void main(String[] args) {
		Calc calculator = new Calc();

		
		System.out.println("Add");
		System.out.println(calculator.add(10, 10));
	
		System.out.println("Subtract");
		System.out.println(calculator.subtract(10, 10));
		
		System.out.println("Multiply");
		System.out.println(calculator.multiply(10, 10));
		
		System.out.println("Divide");
		System.out.println(calculator.divide(10, 4));
	
	}	
}
