package com.petintelligence.web.models;

public class Cat extends Animal implements Pet {

	public Cat() {
		super();
		
	}

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
		
	}

	@Override
	public String showAffection() {
		return "Your " + this.breed + " cat, " + this.name + ", looked at you with some affection. You think.";
		
	}
	
	

}