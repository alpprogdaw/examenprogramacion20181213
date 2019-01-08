package fp.daw.examen;

import java.util.Random;

public class Ejercicio2 {

	/*
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'busquedaBinaria' que
	 * declare dos parámetros formales: un vector de números enteros sin valores
	 * repetidos y un número entero. El método deberá encontrar y retornar
	 * mediante una búsqueda binaria sobre el vector el índice de la posición en
	 * la que se encuentra almacenado el número dentro del vector, o el valor -1 si
	 * dicho dicho número no se encuentra almacenado en el vector.
	 * 
	 */

	public static int busquedaBinaria(long [] vector, int n) {
		/*
		 * Busqueda secuencial en vectar sin que se repita ningun valor
		 */
		boolean encontrado = false;
		int i=0;
		// mientras n lo encuetre y no llegue al final sigue buscando
		while (!encontrado && i<vector.length) {
			if(vector[i] == n) {
				encontrado = true;
			}
			else {
				i++;
			}
		}
		if (encontrado) {
			return i; //posicion donde esta el valor q se busca
		}
		else {
			return -1;
		}
	}
	
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'busquedaBinaria'. En primer lugar tendrá que crear un vector de números enteros
	 * de un tamaño aleatorio entre 100 y 200. A continuación almacenará números aleatorios
	 * comprendios entre Integer.MIN_VALUE e Integer.MAX_VALUE - 1, sin que se repita
	 * ningún valor. Finalmente generará números aleatorios en el mismo intervalo y 
	 * comprobará invocando al método 'busquedaBinaria' si se encuentran almacenados en
	 * el vector. Este proceso finalizará la primera vez que la búsqueda resulte positiva, es
	 * decir, la primera vez que el método retorne un valor distinto de -1, mostrando por
	 * pantalla el índice retornado.
	 * 
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		int tam;
		tam = r.nextInt(200 - 100 + 1) + 100;
		long [] vector = new long [tam];
		for (int i=0;i<vector.length;i++) {
			vector[i] = r.nextInt(Integer.MAX_VALUE - 1) + 1;
		}
		int n = 20;
		int resultado = busquedaBinaria(vector,n);
		if (resultado == -1) {
			System.out.println("El resultado no esta");
		}
		else {
			System.out.println("El numero que busca esta en la posicion: " + resultado);
		}
		
	}

}
