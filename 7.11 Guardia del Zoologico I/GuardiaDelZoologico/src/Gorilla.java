
public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("<-5> El Gorila ha lanzado algo");
		int EnrgyLvl = this.getEnergyLevel();
		this.setEnergyLevel(EnrgyLvl-5);
	}
	public void eatBananas() {
		System.out.println("<+10> El Gorila esta satisfecho con su plátano!");
		int EnrgyLvl = this.getEnergyLevel();
		this.setEnergyLevel(EnrgyLvl+10);
	}
	public void climb() {
		System.out.println("<-10> El gorila ha trepado a la cima de un árbol");
		int EnrgyLvl = this.getEnergyLevel();
		this.setEnergyLevel(EnrgyLvl-10);
	}

}
