/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4_g1;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar
 * su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5)
 * @author MI EQUIPO
 */
public class Ejercicio_4_g1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese temperatura grados C°");
        float cel = leer.nextFloat();
        float far = 32 + (9*(cel/5));
        
                
    }
    
}
