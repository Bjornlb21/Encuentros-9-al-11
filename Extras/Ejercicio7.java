
package Extras;

 // @author Artyom

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número para la Sucesión: ");
        int num = leer.nextInt();

        int[] vec = new int[num];

        vec[0] = 0;

        vec[1] = 1;

        for (int i = 2; i < num; i++) {

            vec[i] = vec[i - 1] + vec[i - 2];

        }

        System.out.println("");

        System.out.println("La serie de Fibbonaci del Número [" + num + "] es:");

        System.out.println("");

        for (int i = 0; i < num; i++) {

            System.out.print("[" + vec[i] + "]");

        }

        System.out.println("");

    }

}
