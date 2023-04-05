/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 * Realizar un algoritmo que calcule la suma de todos 
 * los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.
 * @author MI EQUIPO
 */
public class extra1_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[3];
        int suma = 0;
        System.out.println("ingrese 3 numeros a sumar");
        for (int i = 0; i < 3 ; i++) {
            vector[i]= leer.nextInt();
            suma += vector[i];
        }
        System.out.println("la suma de los numeros ingrsados es de: " + suma);
    }

}
