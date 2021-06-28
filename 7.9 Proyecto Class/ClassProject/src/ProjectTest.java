
public class ProjectTest {

	public static void main(String[] args) {
		Project p1 = new Project();
		p1.setName("Hangover");
		p1.setDescription("Una fiesta epica");
		System.out.println(p1.elevatorPitch()); //Prueba constructor sin parámetros
		System.out.println(p1.getName());
		System.out.println(p1.getDescription());
		System.out.println("_______________________Challenge_______________________________");
		p1.setInitialCost(200000.00);
		System.out.println(p1.elevatorPitch());
		System.out.println(p1.getInitialCost());
		System.out.println("_______________________________________________________________");
		
		
		Project p2 = new Project("Proyecto X");
		p2.setDescription("Carrete distorsion");
		System.out.println(p2.elevatorPitch()); //Prueba constructor con 1 parámetros
		System.out.println(p2.getName());
		System.out.println(p2.getDescription());
		System.out.println("_______________________Challenge_______________________________");
		p2.setInitialCost(500000.00);
		System.out.println(p2.elevatorPitch());
		System.out.println(p2.getInitialCost());
		
		System.out.println("_______________________________________________________________");
		
		Project p3 = new Project("American Pie", "No inviten a Stifler", 1000000.00);
		System.out.println(p3.elevatorPitch()); //Prueba constructor con los 2 parámetros
		System.out.println(p3.getName());
		System.out.println(p3.getDescription());
		System.out.println("_______________________Challenge_______________________________");
		p3.setInitialCost(1200000.00);
		System.out.println(p3.elevatorPitch());
		System.out.println(p3.getInitialCost());
		
		System.out.println("_______________________Challenge_______________________________");
		Portfolio p4 = new Portfolio();
		System.out.println(p4.showPortfolio());
	}

}
