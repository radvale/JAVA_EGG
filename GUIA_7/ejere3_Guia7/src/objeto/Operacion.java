/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 * @author MI EQUIPO
 */
public class Operacion {
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;
    
    public Operacion() {
        
    }
    public Operacion(int nunero1, int numero2) {
        this.numero1 = nunero1;
        this.numero2 = numero2;
    }
    public int getNunero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNunero1(int nunero1) {
        this.numero1 = nunero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        System.out.println("ingrese primer numero");
        this.numero1 = leer.nextInt();
        System.out.println("ingrese segundo numero");
        this.numero2 = leer.nextInt();
    }
    public int sumar() {
       int sumar = numero1 + numero2;
        System.out.println("la suma de los numeros es: " + sumar);
      return sumar;  
    }
    
     public int restar() {
       int restar = numero1 - numero2;
        System.out.println("la resta de los numeros es: " + restar);
      return restar;  
    }
    
     public int multiplicar() {
      if (numero1 == 0 || numero2 == 0) {
          int multiplicar = 0;
          System.out.println("alguno de los numeros es 0");
      }
      int multiplicar = numero1 * numero2;
         System.out.println("la multuplicacion es: " + multiplicar);
      return multiplicar;  
    }
     public double dividir(){
         if (numero1 == 0 || numero2 == 0) {
          double dividir = 0;
          System.out.println("alguno de los numeros es 0");
      } 
         double dividir = numero1/numero2;
         System.out.println("la devision es: " + dividir);
         return dividir;
     }
}
