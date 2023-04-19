/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio  
 * de un atributo privado base y un atributo privado altura.
 * La clase incluirá un método para crear el rectángulo con 
 * los datos del Rectángulo dados por el usuario. También incluirá
 * un método para calcular la superficie del rectángulo y un método
 * para calcular el perímetro del rectángulo. Por último,
 * tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura. Se deberán además 
 * definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author MI EQUIPO
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
    public void CrearRectangulo(){
        System.out.println("ingrese base");
        base= leer.nextInt();
        System.out.println("ingrese altura");
        altura = leer.nextInt();       
    }
    public double superficie(){
        double superficie = base * altura;
        System.out.println("la superficie del rectangulo es: " + superficie);
        return superficie;
    }
    public double perimetro(){
        double perimetro = (base + altura) * 2;
        System.out.println("el perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }
    public void dibujo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1) {
                    System.out.print("* ");
                } else if (j==0 || j==base-1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }        
    }   
}
