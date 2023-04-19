/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double radio;  

    public Circunferencia() {
    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        System.out.println("ingrese radio");
        this.radio = leer.nextDouble(); 
    }
    
    public double area() {
      double area = Math.PI*radio*radio; 
        System.out.println("area: " + area);
        return area;
    } 
    
    public double perimetro() {
        double perimetro= 2*Math.PI*radio;
        System.out.println("perimetro: " + perimetro);
        return perimetro;
    }
}
