/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nochecadas;

import javaapplication2.Funciones;

/**
 *
 * @author T-101
 */
public class Exepcion2 {
    public static void main(String[] args) {
        Funciones f = new Funciones();
        try{
            float x=2;
             
               float z=x/0;       
        }catch(ArithmeticException ex2){
            System.out.println(ex2.getMessage());
                    System.out.println("NO ESTA PERMITIDO EL COCIENTE CON 0");
                    
        }
        
        
    }
}
