/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrcicio_5_g1;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado
 * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * @author MI EQUIPO
 */
public class Ejrcicio_5_g1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        Float num = nextFloat();
        Float doble= num * 2;
        Float triple = num * 3;
        double raiz=Math.sqrt(num);
        System.out.println("el doble del numero es:" + doble);
        System.out.println("el triple de tu numero es:" + triple);
        System.out.println("la raiz cuadrada del numero es" + raiz);        
    }

    private static Float nextFloat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
       
    }
    

