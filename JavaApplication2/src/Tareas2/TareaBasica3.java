/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas2;

import java.time.LocalTime;

/**
 *
 * @author T-101
 */
public class TareaBasica3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        LocalTime hora = LocalTime.now();
                        System.out.println(hora);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }

            }

        });
        t1.start();
    }
}
