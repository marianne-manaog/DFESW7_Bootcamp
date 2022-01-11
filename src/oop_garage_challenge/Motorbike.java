package oop_garage_challenge;

public class Motorbike extends Vehicle{

	
	


	// fields
	private String IDNumber;
	private boolean canLeanOver;

	
	
	
	
	
	public Motorbike(String name, String iDNumber, String vehicleType, int numberOfWheels) {
		super(name, iDNumber, vehicleType, numberOfWheels);
		// TODO Auto-generated constructor stub
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
