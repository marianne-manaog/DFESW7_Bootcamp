package results;

public class Results {
	
	int physicsScore;
	int chemistryScore;
	int biologyScore;
	
	int totalScore;
	int percentScore;
	
	public void displayResults() {
		totalScore = physicsScore + chemistryScore + biologyScore;
		System.out.println("PHYSICS: ");
		System.out.println(physicsScore);
		System.out.println("CHEMISTRY: ");
		System.out.println(chemistryScore);
		System.out.println("BIOLOGY: ");
		System.out.println(biologyScore);
		
		System.out.println("\n Exam Score: " + totalScore + "/450");
	}
	
	public void displayPercentage() {
		
		percentScore = totalScore * 100 / 450;
		System.out.println("\n Percentage: " + percentScore + "%");
	}
}


