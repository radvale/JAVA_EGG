/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4;
import java.util.Scanner;
/**
 *Diseñe una función que pida el nombre y la edad de N personas 
 * e imprima los datos de las personas ingresadas por teclado e 
 * indique si son mayores o menores de edad. Después de cada persona,
 * el programa debe preguntarle al usuario si quiere seguir mostrando personas
 * y frenar cuando el usuario ingrese la palabra “No”.
 * @author MI EQUIPO
 */
public class ejercicio2_G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre = "", resp="";
        int edad = 0; 
        
        datos(nombre, resp, edad);
       
        

    }
    public static void datos(String nombre, String resp, int edad) {
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("ingrese nombre y edad");
            nombre = leer.next();
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }

            System.out.println("desea ingresar otra persona?");
            resp = leer.next();

        } while (!"no".equalsIgnoreCase(resp));

    }
}
 
