
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 *
 * @author MI EQUIPO
 */
public class ejercicio4_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.next();

        if ((frase.substring(0, 1)).equalsIgnoreCase("A")) {
            System.out.println("CORRECRO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
}
