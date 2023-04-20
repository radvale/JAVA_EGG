/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);

    public Persona crear() {

        return new Persona();
    }

    public void crearPersona(Persona p1) {
        System.out.println("ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("ingrese edad");
        p1.setEdad(leer.nextInt());
        System.out.println("ingrese altura (en metros)");
        p1.setAltura(leer.nextDouble());
        System.out.println("ingrese peso en kilogramos");
        p1.setPeso(leer.nextDouble());
        do {
            System.out.println("ingrese sexo f/m/o");
            p1.setSexo(leer.next());
        } while ("s".equalsIgnoreCase(p1.getSexo()) || "m".equalsIgnoreCase(p1.getSexo()) || "o".equalsIgnoreCase(p1.getSexo()));
    }

    public void esMayorDeEdad(Persona p1) {
        System.out.println("es mayor de edad? ");
        if (p1.getEdad() >= 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public int calcularIMC(Persona p1) {
        double res = p1.getPeso() / (Math.pow(p1.getAltura(), 2));
        int imc = 0;
        if (res < 20) {
            imc = -1;
        } else if (res >= 20 && res <= 25) {
            imc = 0;
        } else if (res > 25) {
            imc = 1;
        }
        System.out.println("   ");
        System.out.println("el resultado de tu IMC es:  " + imc + "\n (-1) estas por debajo de tu peso ideal \n (0) peso ideal \n (1) estas sobre tu peso ideal");
        return imc;
    }

}
