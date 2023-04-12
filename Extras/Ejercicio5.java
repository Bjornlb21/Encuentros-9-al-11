
package Extras;

// @author Artyom

import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */

public class Ejercicio5 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num1, num2, suma = 0;
    
        System.out.println("Ingrese el Tamaño de la Matriz: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int [][] mat = new int [num1][num2];
        
        for (int i = 0; i < num1; i++) {
            
            for (int j = 0; j < num2; j++) {
                
               mat [i][j] = (int) (Math.random() * 20) + 1;
               
               suma += mat[i][j];
                
            }
            
        }
        
        System.out.println("");
    
        for (int i = 0; i < num1; i++) {
            
            for (int j = 0; j < num2; j++) {
                
                System.out.printf("[%02d] ", mat[i][j]);
                
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("La Suma de los Elementos de la Matriz es de: [" + suma + "]");

    }

}
