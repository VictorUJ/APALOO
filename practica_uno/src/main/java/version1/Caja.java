/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Folken
 */
public class Caja {

    static int ancho;
    static int alto;
    static int profundo;
    static int volumen(){
        return ancho*alto*profundo;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        alto = 5;
        ancho = 2;
        profundo = 1;
        System.out.println("el volumende una caja de alto:  "+ 
                alto + ", ancho: "+ ancho + ", profundo: "
                + profundo + " es: " + volumen());
        
        
        alto = 1;
        ancho = 1;
        profundo = 1;
        System.out.println("el volumende una caja 2 de alto:  "+ 
                alto + ", ancho: "+ ancho + ", profundo: "
                + profundo + " es: " + volumen());
    }
    
}
