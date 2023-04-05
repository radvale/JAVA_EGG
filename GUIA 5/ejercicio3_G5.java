/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Random;
import java.util.Scanner;
/**
 * Recorrer un vector de N enteros contabilizando 
 * cuántos números son de 1 dígito, cuántos de 2 dígitos,
 * etcétera (hasta 5 dígitos).
 * @author MI EQUIPO
 */
public class ejercicio3_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int[] vector1 = new int[10];
        for (int i = 0; i < vector1.length; i++) {

            vector1[i] = random.nextInt(20000);

            System.out.print(vector1[i] + "  ");

        }
        System.out.println(" ");

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int b : vector1) {
            if (b >= 0 && b < 10) {
                cont1++;
            }
            if (b >= 10 && b < 100) {
                cont2++;
            }
            if (b >= 100 && b < 1000) {
                cont3++;
            }
            if (b >= 1000 && b < 10000) {
                cont4++;
            }
            if (b > 10000) {
                cont5++;
            }

        }

        System.out.println(
                "numeros de 1 digito: " + cont1);
        System.out.println(
                "numeros de 2 digito: " + cont2);
        System.out.println(
                "numeros de 3 digito: " + cont3);
        System.out.println(
                "numeros de 4 digito: " + cont4);
        System.out.println(
                "numeros de 5 digito: " + cont5);
    }
}


