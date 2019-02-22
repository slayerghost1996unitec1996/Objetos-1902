/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author T-101
 */
public class ProbarArreglos {

    public static void main(String[] args) {
        // Formas de crear un arreglo: Declaración con la iniciación explicita
        int[] x = {5, -7,2 };

        // Declaración con inicialización implicita
        int[] y = new int[3];

        //vamos a invocar la propiedad length del arreglo para los dos anteriores
        System.out.println("el tamaño del primer arreglo es:" + y.length);
        
        //vamos a invocar el elemento cuyo indice es 1 del arreglo x
        System.out.println(x[1]);
        
        //vamos a iterar nuestro arreglo x con un ciclo for
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            
        }
        System.out.println("el siguiente es el ciclo for mejorado:");
        
        for(int z:x){
            System.out.println(z);
        }
        
        // 1
        String[] persona={"yo","tengo","mucha","hambre"};
        
        for(String v:persona)
        {
            System.out.println(v);
        }
        
        // 2
        String persona2[]={"yo","tengo","mucha","hambre"};
        
        for(String v:persona2)
        {
            System.out.println(v);
        }
        
    }

}
