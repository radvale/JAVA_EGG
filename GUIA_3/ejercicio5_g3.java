
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author MI EQUIPO
 */
public class ejercicio5_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese valor limite");
        int limit = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese numero");
            int num = leer.nextInt();
            suma += num;
        } while (suma <= limit);
        System.out.println("la suma de los numeros ingresados es de: "+ suma);
        
    }
}
