/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas
 * de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada
 * x e y un punto. Generar un objeto puntos usando un método crearPuntos()
 * que le pide al usuario los dos números y los ingresa en los atributos
 * del objeto. Después, a través de otro método calcular y devolver la
 * distancia que existe entre los dos puntos que existen en la clase Puntos.
 * Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 * @author MI EQUIPO
 */
public class Punto {
    Scanner leer = new Scanner(System.in);
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Punto() {
    }

    public Punto(char x1, char y1, char x2, char y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
     public void crearPunto1() {
        System.out.println("ingrese valor para X1 y otro para Y1");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("ingrese valor para X2 y otro para Y2");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    }
     
     
     public double calcular(){
         double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
         System.out.println(dist);
         return dist;
     }
    
    
}
