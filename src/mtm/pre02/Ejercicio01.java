package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Indicar si una persona es mayor de edad a partir de la edad introducida por teclado.
 *
 * @author Mercedes
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        //Declaro variable
        int edad = 0;

        Scanner teclado = new Scanner(System.in);

            //Controlo excepciones con try-catch
            try {
                System.out.println("Introduzca la edad:");
                edad = teclado.nextInt();
                // Con la sentencia if-else resuelvo la condición pedida
                if (edad >= 18) {
                    System.out.println("Es mayor de edad");
                } else {
                    if (edad > 0 && edad < 18) {
                        System.out.println("Es menor de edad");
                    } else {
                        System.out.println("No puede existir una persona con esa edad");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
            }
      
    }
}
