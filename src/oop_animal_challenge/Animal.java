package oop_animal_challenge;

public class Animal implements Flyable {

	// fields
	String name;
	int age;
	String colour = "black";

		
	// methods
	public void eat() { 
		System.out.println("nom nom");
	}

	public void sleeps() {
		System.out.println("zzz");
	}
		
	public void speaks() {
		System.out.println("growl");
	}
	

	@Override
	public void fly() {
		System.out.println("Animal can fly");
		
	}
}
