
public class Mammal {
	private int energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		int level = this.getEnergyLevel();
		System.out.println(level);
		return level;
	}
	
	
}
