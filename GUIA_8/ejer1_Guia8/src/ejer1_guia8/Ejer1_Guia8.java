/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejer1_guia8;
import entidad.cuentaBancaria;
import java.util.Scanner;
import servicio.cuentaBancariaServicio;
/**
 *
 * @author MI EQUIPO
 */
public class Ejer1_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int rta;
       cuentaBancariaServicio cs1 = new cuentaBancariaServicio();
       cuentaBancaria c1 = cs1.crear();

        do {
            System.out.println("MENU \n1-ingresar dinero \2-retirar dinero \n3-extraccion rapida \n4-consultar saldo \n5-consultar datos \n 6-salir");
            rta=leer.nextInt();
            switch (rta) {
                case 1:
                    cs1.ingresar(c1);
                    break;
                    case 2:
                    cs1.retirar(c1);
                    break;
                    case 3:
                    cs1.exttraccionRapida(c1);
                    break;
                    case 4:
                    cs1.consultarSaldo(c1);
                    break;
                    case 5:
                    cs1.consultarDatos(c1);
                    break;
                    case 6:                    
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
            
        } while (rta!=6);
        
       
    }

}
