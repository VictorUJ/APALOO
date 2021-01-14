/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

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
        int a;
        String basura;
        boolean salida = true;
        Scanner sc = new Scanner(System.in);
        
        while(salida){
            System.out.println("Dame un numero ");
            try{
                a = sc.nextInt();
                salida = false;
                System.out.println("El entero ingresado es: " + a);
            }
            catch(InputMismatchException e){
                basura = sc.nextLine();
                System.out.println("No me diste un entero, me diste: " + basura); 
                
            }
        }
        
        System.out.println("Fin del programa");
    }
    
}
