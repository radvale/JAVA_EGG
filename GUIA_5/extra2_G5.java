/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna 
 * diferencia entre los elementos).
 * @author MI EQUIPO
 */
public class extra2_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vec1 = new int[4];
        int[] vec2 = new int[4];
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese valor a vector 1 posicion: " + i);
            vec1[i] = leer.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese valor a vector 2 posicion: " + i);
            vec2[i] = leer.nextInt();
            if (vec1[i] != vec2[i]) {
                System.out.println("los vectores no son iguales");
                break;
            } else {
                cont++;
            }
            if (cont == 4) {
                System.out.println("los vectores son iguales");
            }
        }
    }
}
