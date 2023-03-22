/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_g1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *Escribir un programa que pida una frase y
 * la muestre toda en mayúsculas y después toda en minúsculas. 
 * @author MI EQUIPO
 */
public class Ejercicio_3_g1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.next();
        frase = toUpperCase(frase);
        System.out.println("la frase en mayusculas: " + frase);
        frase = toLowerCase(frase);
        System.out.println("la frase en minusculas: " + frase);
       
    }
    
}
