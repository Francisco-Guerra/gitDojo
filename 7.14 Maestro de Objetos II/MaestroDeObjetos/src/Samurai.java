
public class Samurai extends Human{
	protected static int sam_count=0;
	public Samurai() {
		health = 200;
		sam_count++;
	}
	
	public void deathBlow(Human vsHuman) {
		System.out.println("You must Die now "+vsHuman);
		vsHuman.health = 0;
		this.health = this.health/2;
	}
	
	public void meditate() {
		System.out.println("ooooooooooohhhhhhmmmmmmmmmmm...");
		this.health += this.health/2;
	}
	
	public int howMany() {
		return sam_count;
	}

}
