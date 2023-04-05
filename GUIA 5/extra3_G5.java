/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Random;
import java.util.Scanner;
/**
 * Crear una función rellene un vector con números aleatorios,
 * pasándole un arreglo por parámetro. Después haremos otra
 * función o procedimiento que imprima el vector.
 * @author MI EQUIPO
 */
public class extra3_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[4];
        relleno(vector);
        muestra(vector);
    }
    public static void relleno(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            vector[i] = random.nextInt(10);
        }
    }
    public static void muestra(int[] vector) {
        for (int i = 0; i < 4; i++) {
            System.out.print( "[" + vector[i] + "]");
        }
        System.out.println(" ");
    }
}
