package oop_garage_challenge;

public class Motorbike extends Vehicle{

	// fields
	private String IDNumber;
	private boolean canLeanOver;

	public Motorbike(String name, String IDNumber, String vehicleType, int numberOfWheels) {
		super(name, IDNumber, vehicleType, numberOfWheels);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return ("Motorbike[Name = " + name + "]");
	}
	
	
}
