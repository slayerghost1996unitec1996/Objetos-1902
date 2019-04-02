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
public class ValidarEdad {
    public static void ValidarMayorDeEdad(int x)throws ValidarMayor18Exception
    {
        if(x<18)throw new ValidarMayor18Exception();
    }
}
