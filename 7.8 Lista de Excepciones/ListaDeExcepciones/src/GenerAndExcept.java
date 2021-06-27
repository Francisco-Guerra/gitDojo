import java.util.ArrayList;

public class GenerAndExcept {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
	
			myList.add("13");
			myList.add("Hola Mundo");
			myList.add(48);
			myList.add("Adios Mundo");
	

		for(int i = 0; i < myList.size(); i++) {
			try {
				int castedValue = (int) myList.get(i);
				System.out.println("Solo imprimo el valor int: "+castedValue);
			} 
			catch (ClassCastException exception) {
				exception.printStackTrace();
                System.out.println("Excepciones por no ser int: " + myList.get(i));
			}
		}
	}
}
