/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Random;
import java.util.Scanner;
/**
 * Realizar un algoritmo que llene un vector de tamaño N 
 * con valores aleatorios y le pida al usuario un número
 * a buscar en el vector. El programa mostrará dónde se 
 * encuentra el numero y si se encuentra repetido
 * @author MI EQUIPO
 */
public class ejercicio2_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese tamaño del vector");
        int tam = leer.nextInt();
        int aux = 0;
        int[] vector = new int[tam];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= random.nextInt(20);
            //vector[i]=Math.floor(Math.random()*10);
            System.out.println(vector[i]);
            // aux[i]=vector[i];
            //System.out.println(aux[i]);
        }
           System.out.println("ingrese el numero que quiere buscar");     
           int resp = leer.nextInt();
           int c = 0;
           for (int i = 0; i < tam; i++) {
               if (resp==vector[i]) {
                   aux +=  vector[i];
                   c++;
               }      
            }
           if (c>=2) {
               System.out.println("el numero se encuentra en la pocision " + aux + " y se encuentra repetido " + c + " veces");
        } else
               System.out.println("el numero se encuentra en la pocision " + aux + " y no se encuentra repetido");
    }
}
