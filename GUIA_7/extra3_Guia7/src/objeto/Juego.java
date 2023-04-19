/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *Crea una clase "Juego" que tenga un método "iniciar_juego"
 * que permita a dos jugadores jugar un juego de adivinanza
 * de números. El primer jugador elige un número y el segundo
 * jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de 
 * "más alto" o "más bajo" después de cada intento.
 * El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número
 * de intentos necesarios para adivinar el número y el
 * número de veces que cada jugador ha ganado.

 * @author MI EQUIPO
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    public int num1;
    public int num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void iniciarJuego() {
        String resp = " ";
        int gano = 0;
        int partidas = 0;
        do {
            partidas++;
            System.out.println("ingrese numero a adivinar");
            num1 = leer.nextInt();
            int cont = 1;
            do {
                System.out.println("adivine el numero");
                num2 = leer.nextInt();
                if (num2 == num1) {
                    System.out.println("CORRECTO el numero era: " + num1 + " y usaste " + cont + " intentos");
                    gano++;
                    System.out.println("desea volver a jugar? s/n");
                    resp = leer.next();
                } else if (num2 != num1 && cont < 4) {
                    cont++;
                    System.out.println("INCORRECTO ");
                    if (num2 < num1 && cont < 4) {
                        System.out.println("mas Alto");
                    } else if (num2 > num1 && cont < 4) {
                        System.out.println("mas Bajo");
                    }
                    if (cont == 4) {
                        System.out.println("te quedaste sin intentos");
                        System.out.println("desea volver a jugar? s/n");
                        resp = leer.next();
                    }
                }
            } while (num2 != num1 && cont < 4);

            if ("n".equals(resp)) {
                System.out.println("jugaste " + partidas + " partidas, y gasnaste " + gano + " veces");
            }
        } while ("s".equals(resp));
    }
}
