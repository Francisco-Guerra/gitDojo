import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	/*1.- Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. 
	 * Imprimir la suma de todos los números en el arreglo. 
	 * El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 
	 * (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 
	 * 13,25,32).*/
	public ArrayList<Integer> arrPrintYMay10() {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		int suma = 0;
		for(int x:arr) {
			suma += x;
			if(x>10) {
				arrList.add(x);
			}
		}
			System.out.println(suma);
		return arrList;
	}
	/*2.- Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	 * Mezcle el arreglo e imprima el nombre de cada persona. 
	 * Haga que el método también devuelva un arreglo con los nombres que tienen más de 5 caracteres.*/
	public ArrayList<String> arrMixYPrintNameMay10Char(){
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> retorno = new ArrayList<String>();
		
		nombres.add("Nancy");
		nombres.add("Jinichi");
		nombres.add("Fujibayashi");
		nombres.add("Momochi");
		nombres.add("Ishikawa");
		System.out.println(nombres);
		
		Collections.shuffle(nombres);
		System.out.println(nombres);
		
		for(String x:nombres) {
			if(x.length()>5) {
				retorno.add(x);
			}
		}
		return retorno;
	}
	/*3.- Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). 
	Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. 
	También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, 
	haga que muestre un mensaje.*/
	public ArrayList<Character> alfabeto(){
		ArrayList<Character> letra = new ArrayList<Character>();
		for(char let = 'a'; let <= 'z'; let++) {
			letra.add(let);
		}
		System.out.println(letra);
		Collections.shuffle(letra);
		System.out.println("Tamaño del arreglo (abecedario): "+letra.size());
		System.out.println("Última letra del arreglo: "+letra.get(25));
		
		if(letra.get(0)=='a'||letra.get(0)=='e'||letra.get(0)=='i'||letra.get(0)=='o'||letra.get(0)=='u') {
			System.out.println("Vocal ["+letra.get(0)+"] en la primera posicion del arreglo");
		}
		return letra;	
	}
	/*4.- Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
	Para obtener un número entero aleatorio, puede utilizar el método nextInt de la clase Random */
	public ArrayList<Integer> arregloNumAleat(){
		Random ran = new Random();
		int[] numeros = new int[10];
		for(int i=0; i<numeros.length; i++) {
			int num = ran.nextInt(45)+55;
			numeros[i]=num;
		}
		System.out.println(Arrays.toString(numeros));
		return null;
	}
	/*5.- Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y 
	 * hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). 
	 * Imprimir todos los números del arreglo. 
	 * Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.*/
	public ArrayList<Integer> arrAleatOrden(){
		Random rand = new Random();
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			int x = rand.nextInt(45) +55;
			num[i] = x;
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		  int min = Arrays.stream(num).min().getAsInt();
		  int max = Arrays.stream(num).max().getAsInt();
		System.out.println(min);
		System.out.println(max);
		return null;
	}
	/*6.- Crear una cadena aleatoria con 5 caracteres de longitud.*/
	public ArrayList<String> chainRand(){
		Random cad = new Random();
		String chain = "";
        String alfab = "abcdefghijklmnopqrstuvwxyz";
        while(chain.length() < 5) {
            int x = cad.nextInt(alfab.length());
            char carac = alfab.charAt(x);
            chain += carac;
        }
        System.out.println(chain);
		return null;		
	}
	/*7.- Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.*/
	public ArrayList<String> chainRand10(){
		Random rand = new Random();
		String[] arr = new String[10];
	    String alf = "abcdefghijklmnopqrstuvwxyz";
	   	for(int i=0; i<10; i++) {
	   		String caract = "";
	        while(caract.length() < 5) {
	        	int x = rand.nextInt(alf.length());
	            char car = alf.charAt(x);
	                caract += car;
	            }
	            arr[i] = caract;
	        }
	        System.out.println(Arrays.toString(arr));		
		return null;
	}	
}
