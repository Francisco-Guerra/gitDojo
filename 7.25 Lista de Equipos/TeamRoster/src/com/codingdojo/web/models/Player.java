package com.codingdojo.web.models;

	//Atributos de los Jugadores
public class Player {
	private String firstName;
	private String lastName;
	private Integer age;
	private Integer id;
	private static int newid = 0;
	
	//Constructores para Jugadores asignando Id a cada Jugador creado
	public Player() {
		this.setFirstName("undefined");
		this.setLastName("undefined");
		this.setAge(null);
		this.setId(newid);
		newid++;
	}
	public Player(String firstName, String lastName, Integer age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setId(newid);
		newid++;
	}
	
	//Getters and Setters de los atributos de los Jugadores
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}