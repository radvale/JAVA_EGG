/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_g1;

import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado
 * y calcule la suma de los dos. El programa deberá después
 * mostrar el resultado de la suma
 * @author MI EQUIPO
 */
public class Ejercicio_1_g1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
            int n1;
            int n2;
            System.out.println("ingrese primer numero");
            n1 = asd.nextInt();
            System.out.println("ingrese segundo numero");
            n2 = asd.nextInt();
            System.out.println("el resultado de los dos numeros ingresados es: " +(n1 + n2));
            
                    
                
    }

    private static int leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
