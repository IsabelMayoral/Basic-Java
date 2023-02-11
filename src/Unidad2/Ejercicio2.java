package Unidad2;

import java.util.Scanner;

/*Ejercicio2
*Definir el programa en Java necesario para intercambiar los valores de dos variables numéricas.
*/

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num1, num2;

        System.out.println("Por Favor, Introduce el Número 1 ");
        num1=teclado.nextInt();
        System.out.println("Por Favor, Introduce el Número 2 ");
        num2=teclado.nextInt();
       
        num1=num1+num2;
        num2=num1-num2;
        num1=-(num2-num1);

        System.out.println("Éstas son tus variables intercambiadas:");
        System.out.println("Número 1: " + num1 + "Número2: " + num2);

    teclado.close();

	}

}
