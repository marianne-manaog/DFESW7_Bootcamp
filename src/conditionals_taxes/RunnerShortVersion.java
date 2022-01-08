package conditionals_taxes_short_version;

public class RunnerShortVersion {

	public static void main(String[] args) {
		
		int yourSalary = 100000;
		
		TaxesShortVersion taxes = new TaxesShortVersion();
		double yourTax = taxes.getPercentage(yourSalary)*100;
		System.out.println("Your tax is: " + yourTax + "%");
		
		double taxedAmount = taxes.getTax(yourSalary);
		System.out.println("Your taxed amount is: £" + taxedAmount);
	}

}
