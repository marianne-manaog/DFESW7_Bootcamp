package oop_animal_challenge;

public class Bird extends Animal implements Flyable {

	// fields
	String ownerName;
		

	// method
	public void canFly() { 
		System.out.println("Bird can fly");
	}


	@Override
	public void fly() {
		System.out.println("Flap flap");
		
	}
	
}
