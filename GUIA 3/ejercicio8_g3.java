
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MI EQUIPO
 */
public class ejercicio8_g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("leer tamaño");
        int tam = leer.nextInt();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || i == tam - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == tam - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                {
                    {

                    }

                }
            }
            System.out.println("");
        }
    }

}
