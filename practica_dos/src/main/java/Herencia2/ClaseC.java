/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia2;

/**
 * 
 * @author Victor Uribe J
 */
public class ClaseC extends ClaseB{
    ClaseC(){
        super();
        System.out.println("Constructor C");
    }
    ClaseC(int c){
        super(18);
        System.out.println("Soy el contructor C " + "recibo el entero: " + c);
    }
    String imprimirC(){
        return "Soy metodo C";
    }
}
