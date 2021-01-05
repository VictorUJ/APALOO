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
public class Principal {

    /**
     * 1. Existen un error en el llamado al no haber un método sobrecargado que reciba un
           entero?
           Repuesta: No ya que existe un metodo que recibe double y puede convertir el entero a double
       2. Si es que no hay error, que método sobrecargado se ejecuta?
       *   Repuesta: void test(double a){}
       3. Si se invierten los tpos de datos que pasa?
▪         void test(double a) ----> void test(int a)
▪         int i ------> double i
*         Repuesta: Saldria un error ya que se pierde informacion al convertir del double a int
*      4. De lo anterior, que diferencias hay (o no hay) con la sobrecarga de constructores?
*         Repuesta: La unica diferencia esta al utilizar el llamado super en caso de definir un caso para algun constructor
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double i = 17.21;
        OverloadDemo obj1 = new OverloadDemo();
        obj1.test();
        obj1.test(i);
    }
    
}
