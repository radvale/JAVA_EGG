/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class cafeteraServicio {
     Scanner leer = new Scanner(System.in);
    
  public void llenarCafeter(Cafetera p1){
      System.out.println("cual es la capacidad maxima de su cafetera?");
      p1.setCapacidadMaxima(leer.nextInt());
      System.out.println("cual es la cantidad actual de cafe que contiene la cafetera");
      p1.setCantidadActual(leer.nextInt());
      p1.setCantidadActual(p1.getCapacidadMaxima());   
  }
 
    public int servirTaza(Cafetera p1){
        System.out.println("ingrese tamaño de la taza que desea llenar");
        int tam = leer.nextInt();
        if (tam< p1.getCantidadActual()) {
            System.out.println("llenando...");
            p1.setCantidadActual(-tam);
        } else if (tam > p1.getCantidadActual()) {
            System.out.println("el contenido actual no alcanza para llenar su taza \n su taza contiene: " + p1.getCantidadActual());
            p1.setCantidadActual(-tam);            
        }
        return p1.getCantidadActual();
    }
  public void vaciarCafetera(Cafetera p1){
      p1.setCantidadActual(0);
      System.out.println("la cafetera esta vacia");
  }
  
   public int agregarCafe(Cafetera p1){
       System.out.println("cuanto cafe desea ingresar?");
       int cant = leer.nextInt();
       if (cant <= (p1.getCapacidadMaxima()- p1.getCantidadActual())) {
           System.out.println("ingresando cafe...");    
           p1.setCantidadActual(+cant);
       } else if (cant > (p1.getCapacidadMaxima()- p1.getCantidadActual())) {
           System.out.println("no se puede ingresar esta cantidad");
       }
       return p1.getCantidadActual();
  }
  
}
