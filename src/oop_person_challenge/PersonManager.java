package oop_person_challenge;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	public List<Person> myNameList = new ArrayList<>();
	
	
	// method
	public void addPerson(Person p) {
		this.myNameList.add(p);
		System.out.println("\n---Add Person method---");
		System.out.println(p);
		System.out.println(myNameList);
	}
	
	public void searchByName(String name) {
		
		for (Person p : myNameList) {
			if (p.getName().equals(name)) { 
				System.out.println(p);
			}	
		}
			
			
			
	}

	
		

	
	
}
