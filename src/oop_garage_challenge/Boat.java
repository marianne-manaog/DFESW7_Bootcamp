package oop_garage_challenge;

public class Boat extends Vehicle {

	// fields
	private String IDNumber;
	private boolean canFloat;

	
	// methods
	
	
	

	
	public String getName() {
		return name;
	}

	public Boat(String name, String iDNumber, String vehicleType, int numberOfWheels) {
		super(name, iDNumber, vehicleType, numberOfWheels);
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		
		return ("Boat[Name = " + name + "]");
			
	}

	
}
