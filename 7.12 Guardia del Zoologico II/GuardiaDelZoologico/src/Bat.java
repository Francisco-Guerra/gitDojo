
public class Bat extends Mammal{
	private int EnergyLevel;
	public Bat() {
		this.EnergyLevel = 300;
	}
	
	public int getEnergyLevel() {
		return EnergyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		EnergyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		int lvl = this.getEnergyLevel();
		System.out.println(lvl);
		return lvl;		
	}

	public void fly() {
		System.out.println("<-50> Flaz,flaz,flaz...Murciélago despegando!");
		int enrgyLvl = this.getEnergyLevel();
		this.setEnergyLevel(enrgyLvl-50);		
	}
	public void eatHumans() {
		System.out.println("<+25> Bueno, no importa");
		int enrgyLvl = this.getEnergyLevel();
		this.setEnergyLevel(enrgyLvl+25);
	}
	public void attackTown() {
		System.out.println("<-100> Flegh,flegh,flegh...La ciudad está en llamas!!!");
	}
	
}
