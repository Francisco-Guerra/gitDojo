
public class HumanTest {

	public static void main(String[] args) {
		Human larry = new Human();
		Human jimmy = new Human();
		
		larry.displayHealth();
		jimmy.displayHealth();
		System.out.println("-----------------------------------");
		larry.attack(jimmy);
		jimmy.displayHealth();
		System.out.println("-----------------------------------");
		Wizard wiz = new Wizard();
		Ninja ninj = new Ninja();
		Samurai sam = new Samurai();
		Samurai samu = new Samurai();
		System.out.println("-----------------------------------");
		wiz.displayHealth();
		ninj.displayHealth();
		sam.displayHealth();
		System.out.println("-----------------------------------");
		wiz.fireBall(sam);
		sam.displayHealth();
		wiz.fireBall(sam);
		sam.displayHealth();
		System.out.println("-----------------------------------");
		jimmy.attack(ninj);
		ninj.displayHealth();
		wiz.heal(ninj);
		ninj.displayHealth();
		System.out.println("-----------------------------------");
		ninj.steal(sam);
		sam.displayHealth();
		ninj.displayHealth();
		larry.attack(sam);
		ninj.runAway();
		ninj.displayHealth();
		System.out.println("-----------------------------------");
		System.out.println(sam.howMany());
		System.out.println(samu.howMany());
		samu.displayHealth();
		sam.deathBlow(samu);
		samu.displayHealth();
		sam.displayHealth();
		sam.meditate();
		sam.displayHealth();
		System.out.println("-----------------------------------");
		System.out.println(sam.howMany());
		System.out.println(samu.howMany());
		
	}

}
