package oop_animal_challenge;

public class Runner {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleeps();
		animal.speaks();
		animal.fly();
	
		
		// Dog extends Animal
		System.out.println("\n---Dog extends Animal---");
		
		Dog dog = new Dog();
		dog.eat();
		dog.sleeps();
		dog.speaks();
		dog.tricks();
		dog.hasLegs();
		
		
		// Cat extends Animal
		System.out.println("\n---Cat extends Animal---");
		
		Cat cat = new Cat();
		cat.eat();
		cat.canJump();
		cat.fly();
		
		// Monkey extends Animal
		System.out.println("\n---Monkey extends Animal---");
		
		Monkey monkey = new Monkey();
		monkey.sleeps();
		monkey.canSwing();
		
		// Bird extends Animal
		System.out.println("\n---Bird extends Animal---");
		
		Flyable bird = new Bird();
		Bird bird1 = new Bird();
		
		bird1.fly();
		bird.fly();
		
		
		
		
		
		
		
	}
		
}
			
		
