/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra4_guia7;
import java.util.Scanner;
import objeto.Cuenta;
/**
 *
 * @author MI EQUIPO
 */
public class Extra4_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.titular = "valentina";
        c1.contraseña = 1234;
        c1.saldo = 50000;
        c1.retirarDinero();

    }

}
