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
public class Humano {
    private String nombre;
    private  String apellido;
    private int edad;
    
    Humano(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    Humano(){
        System.out.println("Soy el constructor Humano vacio");
    }
String getNombreCompleto(){
    return nombre + " " + apellido;
}
int getEdad(){
    return edad;
}
String getInformacion(){
    return "Nombre: " + nombre + " " + apellido+ " " + "Edad: " + edad;
    }

}
