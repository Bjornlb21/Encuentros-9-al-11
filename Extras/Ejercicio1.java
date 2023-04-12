
package Extras;

// @author Artyom

import java.util.Scanner;

/**
 *  Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int suma = 0;
    
        System.out.print("Ingrese el Tamaño del Vector: ");
        int num = leer.nextInt();
    
        System.out.println("");
    
    int [] vec = new int [num];
    
        for (int i = 0; i < num; i++) {
            
            System.out.print("Ingrese un número para llenar el Vector: ");
            vec[i] = leer.nextInt();
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < num; i++) {
            
            System.out.print("[" + vec[i] + "]");
            
        }
        
        System.out.println("");
    
        for (int i = 0; i < vec.length; i++) {
            
            suma += vec[i];
           
        }
        
        System.out.println("");
    
        System.out.println("La suma de los elementos del Vector es de: [" + suma + "]");
    
    }

}
