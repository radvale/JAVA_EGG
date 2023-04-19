/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 *
 * @author MI EQUIPO
 */
public class Cuenta {

    public int saldo;
    public String titular;
    public int contraseña;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular, int contraseña) {
        this.saldo = saldo;
        this.titular = titular;
        this.contraseña = contraseña;
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        int opc;
        int retiro;
        int pin;

        System.out.println("ingrese nombre del titular");
        String nombre = leer.next();
        System.out.println("ingrese contraseña");
        pin = leer.nextInt();

        if (pin != contraseña) {
            do {
                System.out.println("contraseña incorrecta \n intente otra vez \n  ");
                pin = leer.nextInt();
            } while (pin != contraseña);
        }
        String resp = " " ;
        do {
            while (nombre.equalsIgnoreCase(titular) && pin == contraseña) {
                System.out.println(" ");
                System.out.println("¿Qué desea hacer? \n 1- Consultar saldo \n 2- Retirar dinero \n 3- Salir");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Su saldo actual es de: " + saldo);
                        break;
                    case 2:
                        System.out.println("¿Cuánto desea retirar?");
                        retiro = leer.nextInt();
                        if (retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Transacción exitosa");
                        } else {
                            System.out.println("Dinero no disponible");
                        }
                        break;
                    case 3:
                        System.out.println("¿Quieres salir? \n s/n");
                        resp = leer.next();
                        
                        if ("s".equalsIgnoreCase(resp)) {
                            System.out.println("Ha salido exitosamente");
                            titular = "";
                            contraseña = 0;
                            break; 
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            }
        } while (!"s".equalsIgnoreCase(resp));

    }

}
