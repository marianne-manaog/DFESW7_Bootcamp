package results;

public class Runner_results {

	public static void main(String[] args) {
		
		Results results = new Results();
		
		results.physicsScore = 150;
		results.chemistryScore = 150;
		results.biologyScore = 150;
		
		results.displayResults();
		results.displayPercentage();
		
		
	}

}
