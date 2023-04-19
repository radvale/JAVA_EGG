/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author MI EQUIPO
 */
public class persona {

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public persona(String nombre, int edad, int fechaNac) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
    }
    public String nombre;
    public int edad;
    public int fechaNac;
    
}
