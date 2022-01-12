package oop_garage_challenge;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
		Car car = new Car("Carl", "100", "Car", 4);
		Car car2 = new Car("Carol", "101", "Car", 4);
		Motorbike motorbike = new Motorbike ("Moss", "200", "Motorbike", 2);
		Motorbike motorbike2 = new Motorbike ("Missy", "201", "Motorbike", 2);
		Boat boat = new Boat("Billy", "300", "Boat", 0);
		Boat boat2 = new Boat("Betty", "301", "Boat", 0);
		
		Garage garage = new Garage();
		
		garage.addVehicle(car);
		garage.addVehicle(boat);
		garage.addVehicle(motorbike);
		
		// calculate bill method
		garage.calculateBill(3);
		
		System.out.println("\n---1st Garage List (three vehicles)---\n");
		garage.printGarage();

		garage.removeVehicle(car);
		
		System.out.println("\n---2nd Garage List (without car)---\n");
		garage.printGarage();
		
		garage.emptyGarage();
		
		System.out.println("\n---3rd Garage List (empty)---\n");
		garage.printGarage();
		
		garage.addVehicle(car);
		garage.addVehicle(boat);
		garage.addVehicle(motorbike);
		garage.addVehicle(car2);
		garage.addVehicle(boat2);
		garage.addVehicle(motorbike2);
		
		System.out.println("\n---4th Garage List (six vehicles)---\n");
		garage.printGarage();
		
		garage.removeByType(boat.getClass().getSimpleName());
		System.out.println("\n---5th Garage List (four vehicles)---\n");
		garage.printGarage();
		
		
		garage.fix(car, 5);
		garage.fix(car2, 3);
		
		System.out.println("\n---6th Garage List---\n");
		garage.addVehicle(boat);
		garage.addVehicle(boat2);
		garage.printGarage();
		
		garage.removeByIDNumber("101");
		garage.printGarage();
		
		System.out.println("\n---7th Garage List---\n");
		garage.addVehicle(car2);
		garage.printGarage();
		
		garage.removeByName("Carol");
		garage.printGarage();
		
		
		
	}
	
}
