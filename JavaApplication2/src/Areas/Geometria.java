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
       Cuadrado c1=new Cuadrado();
       c1.setLado(3);
       Cuadrado c2=new Cuadrado();
       c2.setLado(6);
       Triangulo t=new Triangulo();
       t.setBase(5);
       t.setAltura(6);
       Circulo cir1=new Circulo();
       cir1.setRadio(2);
       Circulo cir2=new Circulo();
       cir2.setRadio(4);
       Areas ar[]={c1,c2,t,cir1,cir2};
       for(Areas a:ar)
       {
           a.calcularArea();
           System.out.println("Es: "+a.getArea()+" es un "+a.toString());
       }
       
    }
    
        
}
