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
public class ClaseB extends ClaseA {
    ClaseB(){
        //super(2);
        System.out.println("Constructor B");
    }
     ClaseB(int c){
         //super();
        System.out.println("Soy el contructor B " + "recibo el entero: " + c);
    }
    String imprimirB(){
        return "Soy metodo B";
    }

}
