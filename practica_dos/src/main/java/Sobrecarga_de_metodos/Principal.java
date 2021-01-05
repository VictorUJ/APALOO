/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga_de_metodos;

/**
 *
 * @author Victor Uribe J
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double i = 17.21;
        OverloadDemo obj1 = new OverloadDemo();
        obj1.test();
        obj1.test(i);
    }
    
}
