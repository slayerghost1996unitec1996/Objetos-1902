/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Areas.Geometria;

/**
 *
 * @author T-101
 */
public class ProbarDatos {

    public static void main(String[] args) {
        byte b = 127;
        String hola = "ya tengo mucha hambre datoncito quiere quesito";
        byte[] algo = hola.getBytes();

        for (byte x : algo) {
            System.out.println(x);
        }
        Geometria g = new Geometria();
        String topoyiyo = g.toString();
        byte[] malito = topoyiyo.getBytes();

        //inversa
        String recobrar = new String(malito);

        //Geometria ge=(Geometria)recobrar;
        for (byte x : malito) {
            System.out.println(x);

        }

    }

}
