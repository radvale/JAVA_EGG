/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada 
 * por números del 1 al 9 donde la suma de sus filas, sus
 * columnas y sus diagonales son idénticas. Crear un programa
 * que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no. El programa deberá comprobar
 * que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 * @author MI EQUIPO
 */
public class ejercicio6_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese valor a: " + i + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);  
            }
            System.out.println(" ");
        }
    }
}
// 276 951 438