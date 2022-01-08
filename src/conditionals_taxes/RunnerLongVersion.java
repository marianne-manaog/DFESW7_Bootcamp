package conditionals_taxes_long_version;

public class RunnerLongVersion {

	public static void main(String[] args) {
		
		int yourSalary = 31000;
		
		TaxesLongVersion taxes = new TaxesLongVersion();
		double yourTax = taxes.getPercentage(yourSalary)*100;
		System.out.println("Your tax is: " + yourTax + "%");
		
		double taxedAmount = taxes.getTax(yourSalary);
		System.out.println("Your taxed amount is: £" + taxedAmount);
	}

}
