/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_guia8;

import entidad.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author MI EQUIPO
 */
public class Ejer3_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps1 = new PersonaServicio();
        Persona p1 = ps1.crear();
        Persona p2 = ps1.crear();
        Persona p3 = ps1.crear();
        Persona p4 = ps1.crear();

        ps1.crear();
        ps1.crearPersona(p1);
        ps1.esMayorDeEdad(p1);
        ps1.calcularIMC(p1);
        ps1.toString();
        System.out.println("----------");
        ps1.crear();
        ps1.crearPersona(p2);
        ps1.esMayorDeEdad(p2);
        ps1.calcularIMC(p2);
        ps1.toString();
        System.out.println("----------");
        ps1.crear();
        ps1.crearPersona(p3);
        ps1.esMayorDeEdad(p3);
        ps1.calcularIMC(p3);
        ps1.toString();
        System.out.println("----------");
        ps1.crear();
        ps1.crearPersona(p4);
        ps1.esMayorDeEdad(p4);
        ps1.calcularIMC(p4);
        ps1.toString();
        System.out.println("----------");
        
        
        
    }

}
