package Unidad2;

import java.util.Scanner;

/*Ejercicio2
*Definir el programa en Java necesario para intercambiar los valores de dos variables numéricas.
*/

public class Ejercicio2 {

	public static void main(String[] args) {
        int num11 = 4;
        int num22 = 8;

        System.out.println("La primera variable tiene valor " + num11 + " y la segunda variable " + num22);
        num11 = num11 + num22;
        num22 = num11 - num22;
        num11 = num11 - num22;
        System.out.println("La primera variable tiene valor " + num11 + " y la segunda variable " + num22);

    teclado.close();
	}
}
