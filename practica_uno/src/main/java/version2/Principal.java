/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version2;

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
        Volumen caja1 = new Volumen();
        caja1.alto = 5;
        caja1.ancho = 2;
        caja1.profundo = 1;
        System.out.println("el volumende una caja de alto:  "+ 
                caja1.alto + ", ancho: "+ caja1.ancho + ", profundo: "
                + caja1.profundo + " es: " + caja1.volumen());
        
        Volumen caja2 = new Volumen();
        caja2.alto = 1;
        caja2.ancho = 1;
        caja2.profundo = 1;
        System.out.println("el volumende una caja 2 de alto:  "+ 
                caja2.alto + ", ancho: "+ caja2.ancho + ", profundo: "
                + caja2.profundo + " es: " + caja2.volumen());
    }
    
}
