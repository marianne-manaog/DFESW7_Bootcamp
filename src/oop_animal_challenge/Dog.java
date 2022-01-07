package oop_animal_challenge;

public class Dog extends Animal implements Legs {
	
	// fields
	String ownerName;		

	
	// method
	public void tricks() { 
		System.out.println("Dog can sit pretty!");
		
	}

	@Override
	public void hasLegs() {
		System.out.println("I have 4 legs");
	}
}
