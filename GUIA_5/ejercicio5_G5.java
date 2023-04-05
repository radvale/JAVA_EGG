/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 * Realice un programa que compruebe si una matriz 
 * dada es antisimétrica. Se dice que una matriz A 
 * es antisimétrica cuando ésta es igual a su propia 
 * traspuesta, pero cambiada de signo. Es decir, A es 
 * antisimétrica si A = -AT. La matriz traspuesta de
 * una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 * @author MI EQUIPO
 */
public class ejercicio5_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int [][] matrizA = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int [][] matrizB = new int [3][3];
        Scanner leer = new Scanner(System.in);
        
        for (int [] i: matrizA) {
            for (int j : i) {
                System.out.print(j + " ");                
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]=matrizA[j][i];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        boolean antisim = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    if (matrizB[i][j]!= (matrizA[i][j])*(-1)) {
                    antisim = false;
                }
            }
         }
                    if (antisim) {
                System.out.println("La matriz es antisimétrica");
            }else{
                System.out.println("La matriz no es antisimétrica");
            }
}
}
