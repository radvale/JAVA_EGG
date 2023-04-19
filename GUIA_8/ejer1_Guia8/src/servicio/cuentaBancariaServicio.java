/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.cuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class cuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public cuentaBancaria crear() {
        System.out.println("ingrese numero de cuenta");
        int numCuenta = leer.nextByte();
        System.out.println("ingrese DNI");
        long dni = leer.nextLong();
        System.out.println("ingrese saldo actual");
        double saldo = leer.nextDouble();
        return new cuentaBancaria(numCuenta, dni, saldo);
    }

    public double ingresar(cuentaBancaria p1) {
        System.out.println("ingrese la cantidad que desea depossitar");
        double saldo1 = leer.nextDouble();
        double saldoant = p1.getSaldoActual();
        p1.setSaldoActual(saldo1 + saldoant);
        return p1.getSaldoActual();
    }

    public double retirar(cuentaBancaria p1) {
        System.out.println("ingrese la cantidad que desea retirar");
        double saldo1 = leer.nextDouble();
        double saldoant = p1.getSaldoActual();
        p1.setSaldoActual(saldo1 - saldoant);
        return p1.getSaldoActual();
    }

    public void exttraccionRapida(cuentaBancaria p1) {
        double saldoant = p1.getSaldoActual();
        do {
            System.out.println("ingrese cuanto dinero desea extraer, hasta " + (saldoant * 0.2));
            double ext = leer.nextDouble();
            if (ext > (saldoant * 0.2)) {
                System.out.println("cantidad invalida");
            } else {
                p1.setSaldoActual(saldoant - ext);
                break;
            }
        } while (true);

    }

    public void consultarSaldo(cuentaBancaria p1) {
        System.out.println("Saldo:" + p1.getSaldoActual());
    }

    public void consultarDatos(cuentaBancaria p1) {
        System.out.println(p1.toString());
    }
} 
