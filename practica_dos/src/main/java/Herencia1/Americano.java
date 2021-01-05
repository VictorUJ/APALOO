/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia1;

/**
 * 
 * @author  Victor Uribe J
 */
class Americano extends Humano{
 private String nss;

    Americano(String nombre, String apellido, int edad, String nss) {
        super(nombre, apellido, edad);
        this.nss = nss;
    }
    
    String getInformacion(){
        return "Nombre: " + getNombreCompleto()+ " " + " Edad: " + super.getEdad()
                + " NSS: " + nss;
    }
}
