/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8;
import entidades.persona;
import servicio.personaServicio;
/**
 *
 * @author MI EQUIPO
 */
public class Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaServicio p1 = new personaServicio();
        personaServicio p2 = new personaServicio();
        persona pe1 = p1.crear(); 
        p1.mostrar(pe1);
        persona pe2 = p2.crear();
        p2.mostrar(pe2);
    }

}
