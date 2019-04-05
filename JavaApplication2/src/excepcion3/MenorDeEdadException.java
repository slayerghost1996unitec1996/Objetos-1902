/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion3;

/**
 *
 * 
 */
public class MenorDeEdadException extends Exception{
    public MenorDeEdadException()
    {
        super("¡No se aceptan menores de edad!"); 
    }
}
