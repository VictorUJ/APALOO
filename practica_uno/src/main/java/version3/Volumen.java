/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version3;

/**
 *
 * @author Folken
 */
public class Volumen {
    private int ancho;
    private int alto;
    private int profundo;
    int volumen(){
        return ancho*alto*profundo;
        
    }
    void setAncho(int ancho){
        this.ancho = ancho;
    }
    void setAlto(int alto){
        this.alto = alto;
    }
    void setProfundo(int profundo){
        this.profundo = profundo;
    }
    int getAncho(){
        return ancho;
    }
    int getAlto(){
        return alto;
    }
    int getProfundo(){
        return profundo;
    }
}
