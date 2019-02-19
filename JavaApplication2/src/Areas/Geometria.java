/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author T-101
 */
public class Geometria {
    public static void main(String[] args) {
       Cuadrado c=new Cuadrado();
       c.setLado(5);
       c.calcularArea();
        System.out.println("el area es   "+c.getArea());
        System.out.println("el perimetro es  "+c.getPerimetro());
        
    
    }
    
        
}
