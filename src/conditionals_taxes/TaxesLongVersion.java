package conditionals_taxes_long_version;

public class TaxesLongVersion {

	// method 1
	
	int salary;
	double taxPercent;
	double taxAmount;
	
	// method 1 takes a salary input and works out the percentage by which the salary will be taxed
	
	public double getPercentage(int salary) {
		
		if (salary >= 45000) {
			taxPercent = .25;	
		} else if(salary >= 30000 && salary <= 44999) {
			taxPercent = .20;
		} else if (salary >= 20000 && salary <= 29999) {
			taxPercent = .15;
		} else if (salary >= 15000 && salary <= 19999) {
			taxPercent = .10;
		} else if (salary >= 0 && salary <= 14999) {
			taxPercent = 0;
		}
				
		return taxPercent;
		
	}
	
	// method 2 works out exact amount that the user will be taxed
	
	public double getTax(int salary) {
				
		if (salary >= 45000) {
			taxAmount = .25 * salary;	
		} else if(salary >= 30000 && salary <= 44999) {
			taxAmount = .20 * salary;
		} else if (salary >= 20000 && salary <= 29999) {
			taxAmount = .15 * salary;
		} else if (salary >= 15000 && salary <= 19999) {
			taxAmount = .1 * salary;
		} else if (salary >= 0 && salary <= 14999) {
			taxAmount = 0;
		}
				
		return taxAmount;

	}
}
