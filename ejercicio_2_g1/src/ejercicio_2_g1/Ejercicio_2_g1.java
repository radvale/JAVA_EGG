/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_g1;

import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre,
 * lo guarde en una variable y lo muestre por pantalla.
 * @author MI EQUIPO
 */
public class Ejercicio_2_g1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("hola " + nombre);
               
    }
    
}
