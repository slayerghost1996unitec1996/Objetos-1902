/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos2;

/**
 *
 * @author T-101
 */
public class ProbarDatos2 {

    public static void main(String[] args) {
        //conversiones de byte en la familia de integrales
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        //algunos renglones dan errores no los corrijas 
        i=b;
        b=(byte)i;
        b=(byte)s;
        b=(byte)l;
        i=s;
        l=i;
        i=(int)l;
        l=b;
        
    }

}
