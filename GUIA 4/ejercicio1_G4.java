package guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crea una aplicación que le pida dos números al usuario 
 * y este pueda elegir entre sumar, restar, multiplicar y dividir.
 * La aplicación debe tener una función para cada operación matemática
 * y deben devolver sus resultados para imprimirlos en el main
 * @author MI EQUIPO
 */
public class ejercicio1_G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrse dos numeros");
        float num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("1-sumar \n2-restar \n3-multiplicar \n4-dividir \nelija opcion");

        int opcion = leer.nextInt();
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = (int) sumar(num1, num2);
                break;
            case 2:
                resultado = (int) restar(num1, num2);
                break;
            case 3:
                resultado = (int) mult(num1, num2);
                break;
            case 4:
                resultado = (int) dividir(num1, num2);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
        System.out.println("el resultado de la operacion es: " + resultado);
    }

    public static float sumar(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float restar(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float mult(float num1, float num2) {
        float multi = num1 * num2;
        return multi;
    }

    public static float dividir(float num1, float num2) {
        float div = num1 + num2;
        return div;
    }
}

