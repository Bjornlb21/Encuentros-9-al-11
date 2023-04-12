
package Extras;

// @author Artyom

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos - 
 * - para luego obtener una cantidad de aprobados y desaprobados. 
 * Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
 * Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * 
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, -
 * - teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int aprobado = 0, desaprobado = 0;
    
    double [] alumnos = new double [10];
    
    
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("Alumno [" + (i + 1) + "]");
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print("Ingrese la Nota Número [" + (j + 1) + "]: ");
                alumnos[i] += leer.nextDouble();
               
            }
            
            System.out.println("");
            
            alumnos[i] /= 4;
            
            System.out.println("El Promedio del Alumno [" + (i + 1) + "] es de: [" + alumnos[i] + "]" );
            
            System.out.println("");
            
            if (alumnos[i] >= 7) {
                
                aprobado++;
                
            } else {
                
                desaprobado++;
            }
            
        }
        
        System.out.println("");
        
        System.out.println("El Total de Aprobados es de [" + aprobado + "]");
        
        System.out.println("El Total de Desaprobados es de: [" + desaprobado + "]");
        
    
    }

}
