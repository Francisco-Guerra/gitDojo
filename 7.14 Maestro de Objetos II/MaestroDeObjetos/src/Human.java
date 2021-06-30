
public class Human {
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;	
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human vsHuman) {
		System.out.println("Feel the power from "+this);
		int hlt = vsHuman.getHealth();
		int dmg = vsHuman.getStrength();
		vsHuman.setHealth(hlt-dmg);
	}
	
	public int displayHealth() {
		int nwHlt = this.getHealth();
		System.out.println("La Salud de >"+ this.toString() +"< es de "+nwHlt);
		return nwHlt;
	}	
}
