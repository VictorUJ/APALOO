/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Division_de_arreglo_version_2;

import java.util.Random;

/**
 * 
 * @author Victor Uribe J
 */
public class Arreglo {
private int[] a = new int[100];
private int[] b = new int[100];
private int[] c = new int[100];

Arreglo(){
    Random numero = new Random();
    for(int i = 0; i< a.length; i++){
        a[i] = numero.nextInt(20);
        b[i] = numero.nextInt(20);
    }
}
void division(){
    int contador = 0;
    for(int i = 0; i < a.length; i++){
        try{
            c[i] = a[i] / b[i];
            System.out.println("Arreglo C posicion: " + i + " : " + a[i] + " / " + b[i] + " = " + c[i]);    
        }
        catch(ArithmeticException e){
            System.out.println( "Arreglo C posicion: " + i + " : " + a[i] + " / " + b[i] + " = " + c[i] +" INFINITO " );
            contador ++;
        }
        finally{
            if(i==99){
                System.out.println("Numero de veces que se generó la excepcion: " + contador);
            }
        }
        
    }
    
}
}
