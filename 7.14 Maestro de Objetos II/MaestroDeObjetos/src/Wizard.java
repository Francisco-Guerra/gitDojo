
public class Wizard extends Human{
	public Wizard() {
		health = 50;
		intelligence = 8;		
	}
	
	public void heal (Human targHuman) {
		System.out.println("Casting Heal for "+targHuman);
		targHuman.health += this.intelligence;	
	}
	
	public void fireBall(Human vsHuman) {
		System.out.println("Casting Fireball!!...");
		vsHuman.health -= this.intelligence*3;
	}
}
