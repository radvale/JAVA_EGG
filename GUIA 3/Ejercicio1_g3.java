/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_g3;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar
 *
 * @author MI EQUIPO
 */
public class Ejercicio1_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    }

}
