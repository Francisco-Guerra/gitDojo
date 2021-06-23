import java.util.ArrayList;

public class BasicJava {
	/*1.- Imprimir 1 - 255*/
	public void print1To255() {
		for(int i = 1; i < 256; i++) {
		System.out.println(i);
		}
	}
	/*2.- Imprimir los Números Impares Entre 1 - 255*/
	public void printOdds() {
		for(int i = 1; i < 256; i=i+2) {
			System.out.println(i);			
		}
	}
	/*3.- Imprimir la Suma 0 hasta el 255. 
	 * Muestre también las suma de los números que ha mostrado en pantalla hasta ahora*/
	public void printSum1To255() {
		int suma = 0;
		for(int i = 1; i < 256; i++) {
			suma = suma + i;
			System.out.println("Nuevo Numero: " + i + " Suma: " + suma);
		}
	}
	/*4.- Recorrer un Arreglo e imprima cada valor.*/
	public void recArray() {
		int [] arr = {1,3,5,7,9,13};
		for(int elem:arr) {
			System.out.println(elem);
		}
	}
	/*5.- Encontrar el Máximo*/
	public void maxArray() {
		int[] arr1 = {-3,-5,-7};
		int max = arr1[0];
		for(int x = 0; x < arr1.length; x++) {
			if(arr1[x] > max) {
				max = arr1[x];
			}
		}
		System.out.println(max);
	}
	/*6.- Obtener el Promedio*/
	public void promArray() {
		int[] arr2 = {2,10,3};
		int suma = 0;
		for(int x = 0; x < arr2.length; x++) {
			suma = suma + arr2[x];
		}
		double prom = suma/arr2.length;
		System.out.println(prom);
	}
	/*7.- Arreglo con Números Impares*/
	public void oddsArray() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 1; i < 256; i=i+2) {
			y.add(i);
		}
		System.out.println(y);
	}
	/*8.- Mayor que Y: devuelve el número de valores mayores a un valor Y dado*/
	public void mayorY() {
		int y = 3;
		int[] arr3 = {1,3,5,7,8,0,2};
		int count = 0;
		for(int i = 0; i < arr3.length; i++) {
		if(arr3[i] > y) {
			count = count + 1;
			}
		}
		System.out.println(count);
	}
	/*9.- Valores al Cuadrado*/
	public void cuadArray() {
		ArrayList<Integer> sqr = new ArrayList<Integer>();
		int[] arr4 = {1,5,10,-2};
		for(int i = 0; i < arr4.length; i++) {
			sqr.add(arr4[i]*arr4[i]);
		}
		System.out.println(sqr);
	}
	/*10.- Eliminar Números Negativos*/
	public void elimNeg() {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int[] arr5 = {-8,-2,1,5,10,-2};
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] < 0) {
				arr5[i] = 0;
			}
				newArr.add(arr5[i]);
		}
		System.out.println(newArr);
	}
	/*11.- Mínimo, Máximo y Promedio*/
	public void arrayMinMaxProm() {
		ArrayList<Integer> arrMinMaxProm = new ArrayList<Integer>();
		int[] arr6 = {1,7,10,-2};
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i = 0; i < arr6.length; i++) {
			if(arr6[i] < min) {
				min = arr6[i];
			} else if(arr6[i] > max) {
				max = arr6[i];
			}
		sum = sum + arr6[i];
	}
		int prom = sum/arr6.length;
		
		arrMinMaxProm.add(min);
		arrMinMaxProm.add(max);
		arrMinMaxProm.add(prom);
		System.out.println(arrMinMaxProm);
	}
	/*12.- Cambiando los Valores del Arreglo*/
	public void cambArray() {
		ArrayList<Integer> newArr7 = new ArrayList<Integer>();
		int[] arr7 = {1,5,10,7,-2};
		for(int i = 0; i < arr7.length-1; i++) {
			arr7[i] = arr7[i+1];
		}
		for(int x:arr7) {
			arr7[arr7.length-1] = 0;
			newArr7.add(x);
		}
		System.out.println(newArr7);
	}	
}
