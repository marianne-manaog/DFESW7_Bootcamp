package oop_garage_challenge;

public class Car extends Vehicle {

	// fields
	private String IDNumber;
	private boolean haveAirbags;
	
	// constructor
	public Car(String name, String IDNumber, String vehicleType, int numberOfWheels) {
		super(name, IDNumber, vehicleType, numberOfWheels);
	}	
		
	// methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		
		return ("Car[Name = " + name + "]");
	}
	

}
