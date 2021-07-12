package com.petintelligence.web.models;

public class Dog extends Animal implements Pet {
	
	public Dog() {
		super();
		
	}

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);		
	}

	@Override
	public String showAffection() {
		if(this.weight < 30) {
			return this.name + " hopped into on your lap and cuddled you!";
		}
		else {
			return this.name + " curled up next to you.";
		} 
	}
}