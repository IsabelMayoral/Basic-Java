package Unidad2;

import java.util.Scanner;

/*Ejercicio2
*Definir el programa en Java necesario para intercambiar los valores de dos variables numéricas.
*/

public class Ejercicio2 {

	public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;

        System.out.println("La primera variable tiene valor " + num1 + " y la segunda variable " + num2);
        
        int aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("La primera variable tiene valor " + num1 + " y la segunda variable " + num2);
	}
}
