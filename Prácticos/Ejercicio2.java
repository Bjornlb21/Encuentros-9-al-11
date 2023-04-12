
package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, busqueda;
    
    boolean encontrado = false;
    
        System.out.print("¿De qué tamaño quiere que sea el Vector?: ");
        num = leer.nextInt();
        
        System.out.println("");
        
        int [] vec = new int [num];
        
        for (int i = 0; i < num; i++) {
            
            vec [i] = (int) (Math.random() * 20) + 1;
            
            System.out.print("[" + vec[i] + "]");
            
        }
        
        System.out.println("");
    
        System.out.print("¿Qué número quiere buscar en el Vector?: ");
        busqueda = leer.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < num; i++) {
            
            if (busqueda == vec[i]) {
                
                System.out.println("El número [" + busqueda + "] ingresado se encontró en la posición [" + (i + 1) + "] del Vector");
                
                encontrado = true;
                
            }
               
        }
       
        if (encontrado == false) {
            
            System.out.println("No se encontró el número [" + busqueda + "] en el Vector");
            
        }
             
    }

}
