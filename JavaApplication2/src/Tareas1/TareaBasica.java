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

import javax.swing.*;
public class TareaBasica extends Thread {

    @Override
    public void run() {
          System.out.println("me llamo"+Thread.currentThread().getName());
         
          JFrame ventana=new JFrame();
          ventana.setSize(500, 500);
          ventana.setVisible(true);
         
    }

    

}
