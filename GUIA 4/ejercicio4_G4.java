/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4;
import java.util.Scanner;
/**
 *
 * @author MI EQUIPO
 */
public class ejercicio4_G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para saber si es primo");
        int num = leer.nextInt();

        System.out.println(primo(num));
    }

    public static boolean primo(double num) {
        int c = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                c++;
            }
            return c <= 1;

        }
        return false;
    }
}




    
