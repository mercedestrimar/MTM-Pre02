package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar la suma de los números introducidos por teclado hasta que esta sea mayor o igual que 77. 
 * Mostrar la suma total y la cantidad de números que se han introducido
 *
 * @author Mercedes
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        // Declaro variables
        int numero = 0;
        int suma = 0;
        int contador = 0;

        Scanner teclado = new Scanner(System.in);
        // con do-while controlo los números a introducir hasta llegar a la suma
        do {
            //controlo excepciones
            try {

                System.out.println("Introduce número:");
                numero = teclado.nextInt();
                suma += numero;
                contador++;

            } catch (InputMismatchException e) {
                System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
            }
        } while (suma <= 77);
        System.out.println("La suma total es: " + suma + " y se han introducido: " + contador + " números");
    }
}
