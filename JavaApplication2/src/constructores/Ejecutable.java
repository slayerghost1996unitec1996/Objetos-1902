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
public class Ejecutable {
    
    
    public static void main(String[] args) {
        Persona p1=new Persona(24, "axel", "vargaslnaxel@gmail.com");
        System.out.println(p1.getEdad()+" "+p1.getNombre()+" "+p1.getCorreo());
    }
}
