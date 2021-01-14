/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Division_de_arreglo_version_1;

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
int[] division(){
    for(int i = 0; i < a.length; i++){
        c[i] = a[i] / b[i];
        System.out.println("Arreglo C posicion: " + i + " : " + a[i] + " / " + b[i] + " = " + c[i]);
    }
    return c;
}


}
