/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_guia8;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.cafeteraServicio;

/**
 *
 * @author MI EQUIPO
 */
public class Ejer2_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafeteraServicio c1 = new cafeteraServicio();
        Cafetera cs1 = c1.crear();
        String op = "";
        do {
            System.out.println("MENU \n1-llenar cafetera \n2-vaciar cafetera \n3-agregar cafe \n4-servir taza \n5-terminar");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    c1.llenarCafeter(cs1);

                    break;
                case 2:
                    c1.vaciarCafetera(cs1);
                    break;
                case 3:
                    c1.agregarCafe(cs1);
                    break;
                case 4:

                    c1.servirTaza(cs1);
                    break;
                case 5:
                    System.out.println("para terminar presione s ");
                    op = leer.next();
                    
                    break;

                default:
                    System.out.println("opcion incorrecta");
            }
        } while (!"s".equalsIgnoreCase(op));
    }
}
