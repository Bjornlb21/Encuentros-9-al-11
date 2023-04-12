package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
 * Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

public class Ejercicio5 {

    public static void main(String[] args) throws InterruptedException {

        Scanner leer = new Scanner(System.in);

        int [][] matA = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                matA[i][j] = (int) (Math.random() * 19 + (- 9));
                
            }
            
        }
        
        System.out.println("Matriz Original");
        
        System.out.println("");
         
         
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.printf("[%02d", matA [i][j]);
                System.out.printf("]");
                
            }
            
            System.out.println("");
            
        }
        
        int [][] matB = new int [3][3];
        
        for (int i = 0; i < matA.length; i++) {
            
            for (int j = 0; j < matA.length; j++) {
                
                matB [j][i] = - matA [i][j]; 
                
            }
            
        }
        
        System.out.println("");
        
        System.out.println("Matriz Antisimétrica");
        
        System.out.println("");
        
        for (int[] matB1 : matB) {
            
            for (int j = 0; j < matB.length; j++) {
                
                System.out.printf("[%02d", matB1[j]);
                System.out.printf("]");
            }
            
            System.out.println("");
        }
    }
}