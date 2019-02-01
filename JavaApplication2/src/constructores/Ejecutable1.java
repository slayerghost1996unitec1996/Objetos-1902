package constructores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-101
 */
public class Ejecutable1 {
    
    
    public static void main(String[] args) {
       Animal a1=new Animal("perro");
       Animal a2=new Animal(20);
        System.out.println("el animal es un  "+a1.nombre);
       System.out.println("el animal pesa  "+a2.peso); 
   
    }
}
