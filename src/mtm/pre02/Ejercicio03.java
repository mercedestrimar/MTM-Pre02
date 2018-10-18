package mtm.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir un mes en formato numérico e indicar cuantos días tiene dicho mes
 *
 * @author Mercedes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaro variable
        int mes = 0;

        //controlo la excepciones con try-catch
        try {
            System.out.println("Introduce un mes en formato numérico:");

            mes = teclado.nextInt();
            //con el switch indico los días del mes introducido
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes tiene 31 días");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes tiene 30 días");
                    break;
                case 2:
                    System.out.println("El mes tiene 28 días");
                    break;
                default:
                    System.out.println("ERROR, NO HAY NINGÚN MES QUE SE REPRESENTE CON ESTE NÚMERO");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
        }
    }

}
