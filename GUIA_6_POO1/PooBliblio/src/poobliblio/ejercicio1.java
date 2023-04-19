/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poobliblio;
import biblio.entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author MI EQUIPO
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Crear un método para cargar un libro pidiendo los datos
          al usuario y luego informar mediante otro método el número
          de ISBN, el título, el autor del libro y el número de páginas.
        */
        Libro lib1 = new Libro();        
        lib1.LibroCarga();
        System.out.println(lib1);         
    }
}
