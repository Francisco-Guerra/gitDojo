
public class StringManipulatorTesting {

	public static void main(String[] args) {
		
		StringManipulator manipulator = new StringManipulator();
		
		System.out.println("________________________1________________________________");
		
		//1
		String str = manipulator.trimAndConcat("        Hola        ", "           Mundo         ");
		System.out.println(str); // HolaMundo 

		System.out.println("________________________2________________________________");
		
		//2
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		System.out.println("________________________3________________________________");
		
		//3
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int d = manipulator.getIndexOrNull(word, subString);
		int e = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(d); // 2
		System.out.println(e); // -1

		System.out.println("________________________4________________________________");
		
		//4
		String word1 = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word1); // olmundo
	}
}
