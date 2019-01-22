/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author T-101
 */
public class Funciones {
    public void Funcion()
    {
        System.out.println("Esto es una función");
    }
    
    public void Imprimir(String imprimir)
    {
        System.out.println(imprimir);
    }
    
    public static void main(String[] args) {
        Funciones f=new Funciones();
        f.Imprimir("Hola mundo Avanzado");
        f.Funcion();
    }
}
