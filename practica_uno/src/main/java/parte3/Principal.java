/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte3;

import java.util.Random;

/**
 *
 * @author Folken
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja caja1 = new Caja();
        Random r = new Random();
        caja1.alto = 1;
        caja1.ancho = 2;
        caja1.profundo = 3;
        System.out.println("El volumen es: "+ caja1.volumen());
        int val = r.nextInt(2);
        System.out.println(val);
    }
}
