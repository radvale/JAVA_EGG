/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;
import java.util.Scanner;
/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la 
 * cantidad de compañeros de equipo y define su tipo de 
 * dato de tal manera que te permita alojar sus nombres
 * más adelante.
 * Utilizando un Bucle for, aloja en el vector Equipo, 
 * los nombres de tus compañeros de equipo
 * @author MI EQUIPO
 */
public class ejemplo13y14_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[7];
        String aux = " ";
        for (String equipo1 : equipo) {
            System.out.println("ingrese nombre");
            String nombre = leer.next();
            aux = aux + " " + nombre;

        }
        System.out.println(aux);
    }

}


