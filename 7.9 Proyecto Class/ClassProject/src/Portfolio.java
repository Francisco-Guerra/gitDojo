import java.util.ArrayList;

public class Portfolio {
	public ArrayList<Project> projects = new ArrayList<>();
	
	public Double getPortfolioCost() {
		Double total = 0.00;
			for(Project i: projects){
				Double costo = i.getInitialCost();
				total += costo;
				System.out.println(total);
		}
			return total;
		
	}
	public Double showPortfolio() {
		Double totalCost = getPortfolioCost();
		
		for(Project i:projects) {
			System.out.println(i.getName()+i.getInitialCost()+i.getDescription());
		}
		System.out.println("Total Portfolio: $" +totalCost);
		return totalCost;
	}	
}
