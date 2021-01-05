/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia1;

/**
 *
 * @author Victor Uribe J
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*En relación al punto 3, verifcar si en el constructor 
        Mexicano o Americano puede ir el llamado super(....,....,....) 
        después de la inicialización del atributo curp o ssn.*/ 
        //Respuesta: No puede ir el llamado super despues del atributo CURP
        // TODO code application logic here
        Mexicano vuj = new Mexicano("Victor", "Uribe j", 25,"cuasasd");
        System.out.println(vuj.getInformacion());
        Americano pp = new Americano("Peter", "Parker", 20, "152000");
        System.out.println(pp.getInformacion());
        Humano persona = new Humano("Ana","Pola",18);
        System.out.println(persona.getInformacion());
    }

}
