package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Indicar si un número introducido por teclado es par o no.
 * @author Mercedes
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        //declaro variable
        int numero = 0;

        Scanner teclado = new Scanner(System.in);
        //controlo excepciones con try-catch
        try {
            System.out.println("Introduzca un número:");
            numero = teclado.nextInt();
            // Con la sentencia if-else resuelvo si es par o no
            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        } catch (InputMismatchException e) {
            System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
        }
    }
}
