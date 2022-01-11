package oop_person_challenge;

public class Person {

	// Variables
	
	String name;
	int age;
	String jobTitle;
	
	
	// Constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	// Method
	public void introduce() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return ("My name is " + name + " aged " + age + " working as a " + jobTitle + "." );
	}
	
	// MUST CREATE GETNAME METHOD IN ORDER TO USE IN THE SEARCHBYNAME METHOD!
	public String getName() {
		return name;
	}
	
	
	
}
