
public class Ninja extends Human{
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human vsHuman) {
		System.out.println("Suffer!! and give me your life!! "+vsHuman);
		vsHuman.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		System.out.println("Good Bye!!");
		this.health -= 10;
	}

}
