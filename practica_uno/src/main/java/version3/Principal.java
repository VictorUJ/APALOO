/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version3;

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
        caja1.setAlto(5);
        caja1.setAncho(2);
        caja1.setProfundo(1);
        System.out.println("el volumende una caja de alto:  "+ 
                caja1.getAlto() + ", ancho: "+ caja1.getAncho() + ", profundo: "
                + caja1.getProfundo() + " es: " + caja1.volumen());
        
        
    }
    
}
