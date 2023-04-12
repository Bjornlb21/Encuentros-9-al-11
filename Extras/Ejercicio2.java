
package Extras;

// @author Artyom

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 *   (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    boolean igual = true;
    
        System.out.print("Ingrese el Tamaño de los Vectores: ");
        int num = leer.nextInt();
        
        System.out.println("");
        
        int [] vec1 = new int [num];
        int [] vec2 = new int [num];
    
        for (int i = 0; i < num; i++) {
            
            System.out.print("Ingrese números para el Vector 1: ");
            vec1 [i] = leer.nextInt();
         
            System.out.print("Ingrese números para el Vector 2: ");
            vec2 [i] = leer.nextInt();
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < vec1.length; i++) {
            
            System.out.print("[" + vec1[i] + "]");
          
        }
       
        System.out.println("");
        
        for (int i = 0; i < vec2.length; i++) {
                
                System.out.print("[" + vec2[i] + "]");
                
            }
    
        System.out.println("");
     
        for (int i = 0; i < vec2.length; i++) {
            
            if (vec1[i] != vec2[i]) {
                
                igual = false;
                
                System.out.println("Los Elementos de los Vectores son diferentes");
               
                break;
            }
            
        }
        
        System.out.println("");
        
        if (igual) {
                
                System.out.println("Los Elementos de los Vectores son Iguales");
                
            }
        
    }

}
