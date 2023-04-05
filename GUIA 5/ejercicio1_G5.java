/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 * Realizar un algoritmo que llene un vector con los 100 primeros 
 * números enteros y los muestre por pantalla en orden descendente.

 * @author MI EQUIPO
 */
public class ejercicio1_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        String aux = "";
        int cont = 100;
        for (int i : vector) {
            i = cont;
            cont--;
            aux += " " + i;
        }
        System.out.println(aux);
        }
        
    }


