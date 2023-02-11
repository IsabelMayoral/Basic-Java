package Unidad2;
import java.util.Scanner;
/*Ejercicio3
*Implementar un programa en Java que dado un número entero de 5 dígitos, lo escriba al revés.
*/
public class Ejercicio3 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de 5 cifras: ");
        int num = teclado.nextInt();
        int resto;
        int numInvertido = 0;
        while ((Integer.toString(num).length() != 5) || (num<0)) {
            System.out.println("El número introducido debe de tener 5 dígitos y ser mayor que cero");
            teclado.nextInt();
        }
        while (num > 0) {
                resto = num % 10;

                num = num/10; // num/=10;
                numInvertido = numInvertido * 10 + resto;
        }
            System.out.println("El número invertido es: " + numInvertido);
        teclado.close();
	}
}
