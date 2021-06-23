
public class StringManipulator {
	
	//METODOS:
	/* 1.- Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. 
	 * Devolver la nueva cadena. Puede utilizar el m�todo trim de la clase String.*/
	public String trimAndConcat(String strA, String strB) {
		strA = strA.trim();
		strB = strB.trim();
		return strA + strB;
	}
	
	/* 2.- Obtener el �ndice del caracter dado y devolverlo o devolver -1. 
	 * Si el caracter aparece varias veces, retornar el primer �ndice. 
	 * Puede utilizar el m�todo indexOf de la clase String. */
	public int getIndexOrNull(String strA, char caracter) {
		int indice = strA.indexOf(caracter);
		return indice;	
	}
	
	/* 3.- Obtener el �ndice donde empieza la subcadena dada y devolverlo o devolver -1. 
	 * Puede utilizar el m�todo indexOf de la clase String. */
	public int getIndexOrNull(String strA, String strB) {
		int indice = strA.indexOf(strB);
		return indice;
	}
	
	/* 4.- Obtener una subcadena utilizando un �ndice de inicio y un �ndice de finalizaci�n y 
	 * concatenarlo con la segunda cadena de entrada en nuestro m�todo. 
	 * Puede utilizar el m�todo substring de la clase String. */
	public String concatSubstring(String strA, int inicio, int fin, String strB) {
		String subStr = strA.substring(inicio, fin);
		return subStr.concat(strB);
	}
}

