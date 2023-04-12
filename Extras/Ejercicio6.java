
package Extras;

// @author Artyom

import java.util.Scanner;
import java.util.Random;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, -
 * - construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
 * Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
 * Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
 * Finalmente imprima por pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Random random = new Random();

        String[] palabras = new String[5];

        char[][] sopaL = new char[20][20];

        int cont = 0;

        do {

            System.out.println("Ingrese una Palabra de 3 a 5 carácteres: ");

            for (int i = 0; i < 5; i++) {

                System.out.print("Palabra Nº [" + (i + 1) + "]: ");

                palabras[i] = leer.next().toUpperCase();

                cont++;

            }

        } while (cont < 5);

        for (String palabra : palabras) {

            int fila, columna;

            boolean posicionValida;

            do {

                fila = random.nextInt(20);

                columna = random.nextInt(20);

                posicionValida = true;

                // Verificar si la posición generada es válida
                for (int i = 0; i < palabra.length(); i++) {

                    if (columna + i >= 20 || sopaL[fila][columna + i] != '\u0000') {

                        posicionValida = false;

                        break;
                    }
                }

            } while (!posicionValida);

            // Colocar la palabra en la sopa de letras
            for (int i = 0; i < palabra.length(); i++) {

                sopaL[fila][columna + i] = palabra.charAt(i);
            }
        }

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {

                if (sopaL[i][j] == '\u0000') { // Caracter nulo representa espacio vacío

                    sopaL[i][j] = (char) (Math.random() * 10 + '0'); // Generar número aleatorio del 0 al 9
                }
            }
        }

        System.out.println("");

        System.out.println("Sopa de Letras 20x20");

        System.out.println("");

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {

                System.out.print("[" + sopaL[i][j] + "]");

            }

            System.out.println("");
        }

    }

}
