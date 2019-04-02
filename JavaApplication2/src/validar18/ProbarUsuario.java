/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validar18;

/**
 *
 * 
 */
public class ProbarUsuario {
    public static void main(String[] args) {
       Usuario u=new Usuario();
        try
        {
            int x=18;
            ValidarEdad.ValidarMayorDeEdad(x);
            u.setEdad(x);
            System.out.println("es mayor de edad");
        }catch (Exception e)
        {
            System.out.println(""+e.getMessage());
        }
    }
}
