import java.util.ArrayList;

public class Project {

	private String name;
	private String description;
	private Double initialCost; //Desafío
	
	public ArrayList<Project> projects = new ArrayList<>();
		
	public Project() { //constructor sin parámetros
	}

	public Project(String name) { //constructor con 1 parámetros
		this.name = name;
	}

	public Project(String name, String description, Double initialCost) { //constructor con más parámetros
		this.name = name;
		this.description = description;
		this.initialCost = initialCost; //Challenge
	}
	/*******************************************************/

	public String elevatorPitch() { //metodo que instancia
		return this.name + "($"+initialCost+") : "+ this.description;
	}
	/********************************************************/
	
	/*Getters and Setters:*/
	public String getName() {
		return name;
	}

	public void setName(String projName) {
		this.name = projName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String projDescr) {
		this.description = projDescr;
	}
	/*Getter and Setter de initialCost*/

	public Double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(Double projAmount) {
		this.initialCost = projAmount;
	}

}
