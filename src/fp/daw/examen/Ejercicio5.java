package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un
	 * número. Si introduce el número correcto se mostrará un mesaje por pantalla
	 * indicando que ha acertado acompañado del número de intentos realizados y
	 * del tiempo empleado. A continuación, se le dará al usuario la opción de
	 * volver a jugar o de finalizar el juego.
	 * 
	 */

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int x = r.nextInt(200 - 100 + 1) + 100;
		int numero;
		int intentos = 1;
		String respuesta;
		System.out.println(x);
		do {
			do {
				System.out.println("Introduzca un numero entre el 100 y el 200: ");
				numero=in.nextInt();
			} while (numero <= 100 || numero >= 200);

			while (numero != x) {
				intentos++;
			}
			if (numero == x) {
				System.out.println("Has acertado, el numero a adivinar era " + x + " lo has acertado en " + intentos + " intentos" );
			}
			System.out.println("¿Quieres jugar de nuevo?  (s/n)");
			respuesta = in.nextLine();
			
		} while (respuesta.toLowerCase().equals("s"));
		in.close();
	}

}


