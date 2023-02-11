package Unidad2;
import java.util.Scanner;

/*Ejercicio1
 * Escribir un programa en Java que, dados 2 números con decimales por el usuario, 
 * muestre por pantalla la suma, resta, multiplicación, división y módulo de los mismos. 
 */
public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA MÚLTIPLE ");
        System.out.printf("Introduce 2 números con 2 decimales, por favor ");
        double num1=entrada.nextDouble();

        System.out.println("Introduce otro número seguido de una coma y 2 decimales, por favor. ");
        double num2= entrada.nextDouble();
       

        System.out.println("Aquí tienes las operaciones: ");
        System.out.print("SUMA = ");
        System.out.printf("%.2f ", num1+num2);
        System.out.println();
        System.out.print("RESTA ");
        System.out.printf("%.2f ", num1-num2);
        System.out.println();
        System.out.print("MULTIPLICACIÓN ");
        System.out.printf("%.2f ", num1*num2);
        System.out.println();
        System.out.print("DIVISIÓN ");
        System.out.printf("%.2f ", num1/num2);
        System.out.println();
        System.out.print("RESTO ");
        System.out.printf("%.2f ", num1%num2);

    entrada.close();
	}
}
