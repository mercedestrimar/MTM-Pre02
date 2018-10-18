package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir por teclado 5 números e indique la media de todos ellos.
 *
 * @author Mercedes
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        // Declaro variables
        int num = 0;
        int suma = 0;
        double media = 0;

        Scanner teclado = new Scanner(System.in);
        //controlamos excepciones
        try {
            // con el bucle for controlamos los números introducidos
            for (int i = 1; i < 6; i++) {
                System.out.println("Introduce número:");
                num = teclado.nextInt();
                suma += num;
                media = (double) suma / i;
            }
            System.out.println("La media es:" + media);

        } catch (InputMismatchException e) {
            System.out.println("¡¡ERRROR!! Debes introducir un valor entero");
        }
    }
}
