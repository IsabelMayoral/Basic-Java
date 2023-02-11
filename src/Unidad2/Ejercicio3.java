package Unidad2;
import java.util.Scanner;
/*Ejercicio3
*Implementar un programa en Java que dado un número entero de 5 dígitos, lo escriba al revés.
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, introduce un número de 5 cifras");
		
        int num = teclado.nextInt();
        int unidades = num%10;
        int decenas = (num/10)%10;
        int centenas = (num/10/10)%10;
        int unidadesMillar = (num/10/10/10)%10;
        int centenasMillar = (num/10/10/10/10)%10;
        System.out.println("El número " + num + " al revés es: " + unidades + decenas + centenas + unidadesMillar + centenasMillar);
        teclado.close();
	}
}
