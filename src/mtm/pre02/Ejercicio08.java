package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Generar un número entero aleatorio mediante función random de la clase Math  y el usuario tendrá que adivinarlo. 
 * Cada vez que se introduzca un número el programa a de indicar si es mayor o menor que el número que hay que
 * descubrir. 
 * El programa solo finalizará una vez que el usuario escriba el número correcto.
 *
 * @author Mercedes
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        // Declaro variables
        int numero = 0;
        int numAleatorio = 0;
        Scanner teclado = new Scanner(System.in);

        numAleatorio = (int) (Math.random() * 100);

        //con do-while consigo adivinar el número
        do {
            //controlo excepciones con try-catch
            try {
                // con este bucle do-while pido el número positivo
                do {
                    System.out.println("Introduzca número entero entre 1 y 100 ");
                    numero = teclado.nextInt();

                } while (numero < 0);
                //con el if-else selecciono el número que introduzco
                if (numero > numAleatorio) {
                    System.out.println("introduzca un número menor");

                } else if (numero < numAleatorio) {
                    System.out.println("introduzca un número mayor");
                } else {
                    System.out.println("Encontrado");
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡ERRROR!! Debe introducir un valor entero");

            }

        } while (numero != numAleatorio);
        //Ta ta ta chan......... y lo consigo.....
        System.out.println("El número correcto es el :" + numAleatorio);
    }
}
