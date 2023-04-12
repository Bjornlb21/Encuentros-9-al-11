
package Guía;

// @author Artyom

import java.util.Scanner;

/**
 * [Ejercicio 1]
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
 * define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * 
 * [Ejercicio 2]
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */

public class Ejercicio1y2 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    String [] Equipo = new String [2];
  
        for (int i = 0; i < Equipo.length; i++) {
            
            System.out.print("Ingrese el Nombre de tu Compañero Nº [" + (i + 1) + "]: ");
            Equipo[i] = leer.nextLine();
            
        }
    
        System.out.println("");
        
        for (int i = 0; i < Equipo.length; i++) {
            
            System.out.println("Compañero Nº [" + (i + 1) + "]: " + Equipo[i]);
            
        }
        
        System.out.println("");
        
    }

}
