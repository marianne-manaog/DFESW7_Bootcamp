package results;

public class Runner_results {

	public static void main(String[] args) {
		
		Results results = new Results();
		
		results.physicsScore = 150;
		results.chemistryScore = 140;
		results.biologyScore = 130;
		
		results.displayResults();
		results.displayPercentage();
		
		
	}

}
