/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author T-101
 */
public class ProbarOperaciones {
    public static void main(String[] args) {
        
        // creamos un objeto
        
        Suma s=new Suma();
        
        s.setX(2);
        s.setY(3);
        
        //probamos  el metodo
        System.out.println("la suma es "+s.sumar());
        System.out.println("la resta es "+s.resta());
        System.out.println("la multiplicacion es "+s.multiplicacion());
        System.out.println("la division es "+s.division());
        System.out.println("esto es esparta"+s.thisisesparta());
     
    }
}
