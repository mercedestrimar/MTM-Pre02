package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcular el factorial de un número introducido por teclado.
 *
 * @author Mercedes
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        //Declaro variables
        int numero = 0;
        int factorial = 1;

        Scanner teclado = new Scanner(System.in);

        //controlo excepciones con try-catch
      
            try {
                System.out.println("Introducir número para calcular el factorial:");
                numero = teclado.nextInt();

                System.out.print(numero + "! = ");
                // repito con el bucle for la entrada del número y controlamos las veces que tiene que hacerlo con el contador
                for (int i = numero; i > 0; i--) {
                    System.out.print(i);
                    factorial *= i;
                    if (i > 1) {
                        System.out.print(" . ");
                    }
                }
                System.out.println((" = ") + factorial);
            } catch (InputMismatchException e) {
                System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
            }
    }
}
