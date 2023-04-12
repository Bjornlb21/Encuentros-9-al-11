
package Prácticos;

// @author Artyom

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, dig;
    
        System.out.print("¿De cuánto quiere que sea el Vector?: ");
        num = leer.nextInt();
        
        System.out.println("");

    int [] vec = new int [num];
    
    int [] cont = new int [6];
    
        for (int i = 0; i < num; i++) {
            
            vec[i] = (int) (Math.random() * 11000) + 1;
            
            dig = (int) (Math.log10(vec[i]) + 1);
            
            if (dig > 5) {
                
                dig = 5;
            }
            
            cont[dig]++;
        }
    
        for (int i = 1; i < 6; i++) {
            
            System.out.println("Hay [" + cont[i] + "] números con [" + i + "] dígito(s).");
            
        }
   
    }

}
