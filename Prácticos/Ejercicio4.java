
package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matA = new int[4][4];

        int[][] matB = new int[4][4];

        System.out.println("Matriz [4] x [4]");

        System.out.println("");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matA[i][j] = (int) (Math.random() * 10) + 1;

                System.out.printf("[%02d] ", matA[i][j]);
                
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("Matriz [4] x [4] Traspuesta");

        System.out.println("");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.printf("[%02d] ", matA[j][i]);

            }

            System.out.println("");
            
        }

        System.out.println("");
    }

}
