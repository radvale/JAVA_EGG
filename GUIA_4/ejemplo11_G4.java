package guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 *
 * @author MI EQUIPO
 */
public class ejemplo11_G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase2 = "";
        String frase;
        do {
            System.out.println("ingrese palabra");
            frase = leer.nextLine();
            if (frase.equals(".")) {
                break;
            } else {
                frase2 += frase + " ";
            }
        } while (true);
            
        //System.out.println(cambio(frase2));
        String salida = cambio(frase2);
        System.out.println(salida);
    }

    //inicio funcion
    public static String cambio(String frase2) {
        //int longitud = frase2.length();
        String frasefin = " ";
        for (int i = 0; i < frase2.length(); i++) {
            switch (frase2.substring(i, i+1)) {
                //if (frase.substring(i, i++)) {
                case "a":
                    frasefin += "@";
                    break;
                case "e":
                    frasefin += "#";
                    break;
                case "i":
                    frasefin += "$";
                    break;
                case "o":
                    frasefin += "%";
                    break;
                case "u":
                    frasefin += "*";
                    break;
                default:
                    frasefin += frase2.substring(i, (i + 1));
                    break;

            }

        }
        return frasefin;
    }
}

//if (frase.substring(i, i+1).equalsIgnoreCase("A"));

