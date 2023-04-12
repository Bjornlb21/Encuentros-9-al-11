
package Extras;

// @author Artyom

import java.util.Scanner;

/**
 * Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int [] vec = new int [5];
    
    llenarVector(vec);
    mostrarVector(vec);
    
    }

    public static void llenarVector(int[] vec){
     
        for (int i = 0; i < vec.length; i++) {
            
            vec [i] = (int) (Math.random() * 20) + 1; 
            
        }
        
    }
    
    public static void mostrarVector(int[] vec) {
        
        for (int i = 0; i < vec.length; i++) {
            
            System.out.print("[" + vec[i] + "]");
            
        }
        
        System.out.println("");
        
    }
    
}
