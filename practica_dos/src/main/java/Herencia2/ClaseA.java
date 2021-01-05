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
public class ClaseA {

    ClaseA(){
        System.out.println("Constructor A");
    }
     ClaseA(int c){
        System.out.println("Soy el contructor A " + "recibo el entero: " + c);
    }
    String imprimirA(){
        return "Soy metodo A";
    }
}
