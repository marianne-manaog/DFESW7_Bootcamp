package oop_garage_challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
//	double cost;
//	private int currentID = 0;
	
	public List<Vehicle> listOfVehicle = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		this.listOfVehicle.add(v);
//		v.IDNumber = currentID++;
	}
	
	public void printGarage() {
		System.out.println(listOfVehicle);
	}
	
	public double calculateBill(double fixAmount) {
		for (Vehicle v : listOfVehicle) {
			if (v instanceof Car) {
				fixAmount*= 50;
				System.out.println("Car bill: £ " + fixAmount);
			}
			if (v instanceof Boat) {
				fixAmount*= 100;
				System.out.println("Boat bill: £ " + fixAmount);
			}
			if (v instanceof Motorbike) {
				fixAmount*= 10;
				System.out.println("Motorbike bill: £ " + fixAmount);
			}
		}
		return fixAmount;
	}
	
	public double fix(Vehicle v, double fixAmount) {
		if (v instanceof Car) {
			fixAmount*= 50;
			System.out.println("Car bill for " + v + ": £ " + fixAmount);
		}
		if (v instanceof Boat) {
			fixAmount*= 100;
			System.out.println("Boat bill for " + v + ": £ " + fixAmount);
		}
		if (v instanceof Motorbike) {
			fixAmount*= 10;
			System.out.println("Motorbike bill for " + v + ": £ " + fixAmount);
		}
		return fixAmount;
		
	}
	
	public void removeVehicle(Vehicle v) {
		this.listOfVehicle.remove(v);
	}
	
	public void emptyGarage() {
		this.listOfVehicle.clear();
	}
	
	public List<Vehicle> modifiedListOfVehicle = new ArrayList<>();
	
	public void removeByType(String y) {
//		 make a clone of the list and iterate through the clone while modifying 
//		the original list by removing vehicle of type v
		for (Vehicle v : new ArrayList<Vehicle>(listOfVehicle)) {
			if (v.getClass().getSimpleName().equals(y)) {
				System.out.println("y is: " + y);
				System.out.println("v.getClass().getSimpleName() is: " + v.getClass().getSimpleName());
				listOfVehicle.remove(v);
			}
		}
	}

	
	
}
