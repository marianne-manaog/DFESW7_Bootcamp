package oop_person_challenge;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Person person = new Person("Marianne", 25, "nurse");
		System.out.println(person);
		person.introduce();	// this is the same as above
		
		Person person1 = new Person("Luca", 23, "engineer");
		person1.introduce();
		
		Person person2 = new Person("Jet", 3, "guard dog");
		person2.introduce();
		
		List<Person> myList = new ArrayList<>();
		myList.add(person);
		myList.add(person1);
		myList.add(person2);
		
		System.out.println("\n---My List---");
		System.out.println(myList.get(0));
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		
		PersonManager pm = new PersonManager();
		System.out.println("\n---Add Person---");
		pm.addPerson(person);
		pm.addPerson(person1);
		pm.addPerson(person2);
		
		System.out.println("\n---RESULTS---\n");
		System.out.println("\n---Search by Name Jet---\n");
		pm.searchByName("Jet");
		
		System.out.println("\n---Search by Name Marianne---\n");
		pm.searchByName("Marianne");
		
		System.out.println("\n---Search by Name Luca---\n");
		pm.searchByName("Luca");
		
		
		
	
	}

}
