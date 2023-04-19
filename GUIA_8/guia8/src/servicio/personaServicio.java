/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.persona;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class personaServicio {
  private Scanner leer = new Scanner(System.in);
    public void mostrar(persona p1){
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());     
    }
    public persona crear(){
        System.out.println("ingrese nombre");
        String nobre = leer.next();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        return new persona(nobre,edad);
    }
}
