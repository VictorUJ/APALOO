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
public class OverloadDemo {
    void test(){
        System.out.println("Salida metodo 1");
    }
    void test(int a, int b){
        System.out.println("Salida metodo 2" + " valor de a: " + a + " Valor de b: " + b);
    }
    void test(double a){
        System.out.println("Salida metodo 3" + " Valor de a: " + a);
    }
    

}
