/*
 * Crear una clase llamada Libro que contenga
los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío.
 */
package biblio.entidad;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;  

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Libro() {
    }

    public void LibroCarga() {
        System.out.println("ingrese ISBN");
        this.ISBN= leer.nextInt();
        System.out.println("ingrese titulo del libro");
        this.titulo = leer.next();
        System.out.println("ingrese autor");
        this.autor = leer.next();
        System.out.println("ingrese numero de paginas");
        this.numPag = leer.nextInt();        
    }

    @Override
    public String toString() {
        return "Libro" + " \n* ISBN= " + ISBN + " \n* titulo= " + titulo + " \n* autor= " + autor + " \n* numPag= " + numPag ;
    }
    
   
    
}

