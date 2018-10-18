package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir un número entero positivo por teclado y realizar la división entre 3 mediante restas. 
 * Al finalizar ha de indicar el cociente y el resto resultante. 
 * HAY COMENTARIOS CON LOS QUE INTENTO ACLARARTE MI MARAVILLOSO RAZONAMIENTO. (NO EVALUABLES)
 *
 * @author Mercedes
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        // declaro variables
        int dividendo = 0;
        int contador = 0;
        int resto = 0;
        final int DIVISOR = 3;

        Scanner teclado = new Scanner(System.in);
        //controlo excepciones, que es lo que más me ha costado!
        try {
            
            System.out.println("Introduce número entero positivo:");
            dividendo = teclado.nextInt();
            //aquí excluyo los negativos porque el divisor es 3 y constante. Si es negativo, no entra en el bucle
            while (dividendo >= DIVISOR) {
                dividendo = dividendo - DIVISOR;
                contador++;
                //con este if calculo el resto y ¡punto y pelota! porque ya está definido que no puede ser negativo
                if (dividendo < DIVISOR) {
                    resto = dividendo;
                }
            }
            System.out.println("El cociente es: " + contador + " y el resto: " + resto);
            
        } catch (InputMismatchException e) {
            System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
        }
    }
}
