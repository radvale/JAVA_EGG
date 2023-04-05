
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que , si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa caso contrario se vuelve a mostrar el menú
 *
 * @author MI EQUIPO
 */
public class ejercicio6_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        int opcion;

        do {
            System.out.println(" ");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- salir");
            System.out.println("elija una opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("la suma es de:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta es de:" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion es de:" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la division es de:" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("estas seguro que deseas salir del programa? S/N ");
                    String resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("gracias por ingresar");
                        break;
                    } else {
                        opcion = 0;
                    }

                default:
                    System.out.println("opcion incorrecta");
            }

        } while (opcion != 5);

    }
}
