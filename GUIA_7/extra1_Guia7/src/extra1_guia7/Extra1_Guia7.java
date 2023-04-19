/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra1_guia7;

import java.util.Scanner;
import objeto.Cancion;

/**
 *Desarrollar una clase Cancion con los siguientes atributos:
 * título y autor. Se deberá definir además dos constructores:
 * uno vacío que inicializa el título y el autor a cadenas
 * vacías y otro que reciba como parámetros el título y el
 * autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.

 * @author MI EQUIPO
 */
public class Extra1_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion();
        System.out.println("ingrese titulo de la cancion");
        c1.titulo = leer.next();
        System.out.println("ingrese el autor");
        c1.autor = leer.next();
        System.out.println("el titulo es: " + c1.titulo + " el autor es: " + c1.autor);
    }

}
