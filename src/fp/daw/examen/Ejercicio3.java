package fp.daw.examen;

public class Ejercicio3 {

	/*
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray2D' que
	 * reciba como parámetro una cadena de caracteres y retorne un array de
	 * caracteres de dos dimensiones que tendrá exactamente dos filas y el
	 * contenido siguiente en cada una de ellas:
	 * 
	 * * Primera fila: caracteres de la cadena que ocupan posiciones pares (0, 2, 4,
	 * ...). * Segunda fila: caracteres de la cadena que ocupan posiciones impares
	 * (1, 3, 5, ...).
	 * 
	 * El número de columnas en cada fila no excederá del estrictamente necesario
	 * para almacenar los caracteres que se indican en cada caso.
	 * 
	 */

	public static char[][] stringToArray2D (char[] cadena) {
		int col = cadena.length/2;
		int i, j, z;
		char [][] resultado = new char [2][col];
		j=0;
		z=0;
		for (i=0;i<cadena.length;i++) {
			if (i % 2 == 0) {
				resultado[0][j] = cadena[i]; 
				j++;
			}
			else {
				resultado[1][z] = cadena[i];
				z++;
			}
		}
		return resultado;
	}
	public static char[][] stringToArray2D2v (String cadena) {
		int col = cadena.length()/2;
		int i, j, z;
		char [][] resultado = new char [2][col];
		j=0;
		z=0;
		for (i=0;i<cadena.length();i++) {
			if (i % 2 == 0) {
				resultado[0][j] = cadena.charAt(i); 
				j++;
			}
			else {
				resultado[1][z] = cadena.charAt(i);
				z++;
			}
		}
		return resultado;
	}
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray2D' mostrando por pantalla el resultado de su ejecución.
	 * Se mostrará en cada fila del array en una línea de la pantalla utilizando para
	 * ello el método definido en el ejercicio 1.
	 * 
	 */
	
	public static void main(String[] args) {
		char [] cadena = {'l', 'a', 'c', 'a','s', 'a'}; 
		String cadena2 = "lacasa";
//		char [][] resultado = stringToArray2D(cadena);
		char [][] resultado = stringToArray2D2v(cadena2);
		for (int i=0;i<2;i++) {
			System.out.print("[");
			for (int j=0;j<resultado[i].length;j++) {
				if (j<resultado[i].length -1) {
					System.out.print(resultado[i][j] + ", ");
				}
				else {
					System.out.print(resultado[i][j]);
				}
			}
			System.out.println("]");
		}
	}
}
