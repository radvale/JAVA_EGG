/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejer2;
import java.util.Scanner;
import objeto.Circunferencia;
/**
 *
 * @author MI EQUIPO
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        
        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();       
    }
}
