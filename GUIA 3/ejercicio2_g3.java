
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka”
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje
 * de Incorrecto. Nota: investigar la función equals() en Java.
 * @author MI EQUIPO
 */
public class ejercicio2_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese frase");
        String frase = leer.next();
        String eureka = "eureka";
        if (frase.equals(eureka)) {
            System.out.println("CORRECTO");
        }
        else  
        System.out.println("INCORRECTO");
    }
}


