
package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);

    int [] vec = new int [100];
    
        for (int i = 0; i < 100; i++) {
            
            vec[i] = i + 1;
            
        }
    
        for (int i = 99; i >= 0; i--) {
            
            vec[0] = 1;
            
            System.out.println("[" + vec[i] + "]");
 
        }
    
    }

}
