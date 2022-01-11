package oop_garage_challenge;

public class Car extends Vehicle {

	
	
	// fields
		private String IDNumber;
		private boolean haveAirbags;
	
	
	

	public Car(String name, String iDNumber, String vehicleType, int numberOfWheels) {
			super(name, iDNumber, vehicleType, numberOfWheels);
		
		}

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
