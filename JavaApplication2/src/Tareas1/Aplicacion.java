/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas1;

/**
 *
 * @author T-101
 */
public class Aplicacion {

    public static void main(String[] args) {

        //creamos el thread
        TareaBasica t1 = new TareaBasica();
        TareaBasica t2 = new TareaBasica();
        TareaBasica t3 = new TareaBasica();
        //poner el thread en estado de inicializado

        t1.start();
        t2.start();
        t3.start();

    }

}
