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
public class Mexicano extends Humano {
    private String curp;

    Mexicano(String nombre, String apellido, int edad, String curp){
    //super(nombre, apellido, edad);
    //super();
    this.curp = curp;
    }

    String getInformacion(){
    return "Nombre: " + super.getNombreCompleto() + " " + "Edad: " + getEdad()
            + " CURP: " + curp;
    }

}
