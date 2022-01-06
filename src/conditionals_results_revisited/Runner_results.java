package results;

public class Runner_results {

	public static void main(String[] args) {
		
		Results results = new Results();
		
		results.physicsScore = 100;
		results.chemistryScore = 120;
		results.biologyScore = 130;
		
		results.displayResults();
		results.displayPercentage();

	// RESULTS REVISITED
	
	System.out.println("\n RESULTS REVISITED");
	
	results.passMark();
	}
	
}
