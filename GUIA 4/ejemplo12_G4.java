package guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crea un procedimiento EsMultiplo que reciba los dos números 
 * pasados por el usuario, validando que el primer número múltiplo 
 * del segundo e imprima si el primer número es múltiplo del segundo,
 * sino informe que no lo son.
 * @author MI EQUIPO
 */
public class ejemplo12_G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        esMultiplo(num1, num2);
        //System.out.println(esMultiplo(num1, num2));

    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println("los numeros ingresados no son multiplos");
        }

    }

}
