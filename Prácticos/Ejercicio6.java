
package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
 *    sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */

public class Ejercicio6 {
    
    public static void main(String[] args) {
    
    Scanner leer = new Scanner (System.in);
    
    int num, suma = 0;
    
    int [][] matA = new int [3][3];
    
        for (int i = 0; i < matA.length; i++) {

            for (int j = 0; j < matA.length; j++) {

                while (matA[i][j] < 1 || matA[i][j] > 9) {

                    System.out.print("Ingrese un número del 1 al 9: ");
                    matA[i][j] = leer.nextInt();

                }
            }
        }

        System.out.println("");

        for (int i = 0; i < matA.length; i++) {

            for (int j = 0; j < matA.length; j++) {

                System.out.printf("[%02d", matA[i][j]);
                System.out.printf("]");
            }

            System.out.println("");
        }

        System.out.println("");
        
        int sumaEsperada = sumaFila(matA, 0);
        
        for (int i = 0; i < matA[0].length; i++) {
            
            int sumaColumna = sumaColumna(matA, i);
            
            if (sumaColumna != sumaEsperada) {
                
                System.out.println("Las sumas no son iguales");
                
                return;
            }
            
        }
        
        for (int i = 0; i < matA.length; i++) {
            
            int sumaFila = sumaFila(matA, i);
            
            if (sumaFila != sumaEsperada) {
                
                System.out.println("Las sumas no son iguales");
                
                return;
            }
            
        }
        
        int sumaDiagonalPrincipal = sumaDiagonalPrincipal(matA);
        
        if (sumaDiagonalPrincipal != sumaEsperada) {
            
            System.out.println("Las sumas no son iguales");
            return;
            
        }
        
        int sumaDiagonalSecundaria = sumaDiagonalSecundaria(matA);
        
        if (sumaDiagonalSecundaria != sumaEsperada) {
            
            System.out.println("Las sumas no son iguales");
            return;
            
        }
        
        System.out.println("Las Sumas de las Diagonales, Filas y Columnas son iguales. La suma es: [" + sumaEsperada + "]" );
    }

    public static int sumaColumna(int [][] matA, int columna) {
        
        int suma = 0;
        
        for (int i = 0; i < matA.length; i++) {
            
            suma += matA[i][columna];
            
        }
        
        return suma;
    }
    
    public static int sumaFila(int [][] matA, int fila) {
        
        int suma = 0;
        
        for (int i = 0; i < matA[fila].length; i++) {
            
            suma += matA[fila][i];
            
        }
        
        return suma;
    }
    
    public static int sumaDiagonalPrincipal(int [][] matA) {
        
        int suma = 0;
        
        for (int i = 0; i < matA.length; i++) {
            
            suma += matA[i][i];
            
        }
        
        return suma;
    }
    
    public static int sumaDiagonalSecundaria(int [][] matA) {
        
        int suma = 0;
        
        for (int i = 0; i < matA.length; i++) {
            
            suma += matA[i][matA.length - 1 - i];
            
        }
        
        return suma;
    }
}
