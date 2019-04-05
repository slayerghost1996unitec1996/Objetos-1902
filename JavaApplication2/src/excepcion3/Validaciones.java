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
public class Validaciones {
// otra excepcion
    /*
    Cualquier string solamente permite más de 6 caracteres
    
    */
    public static void validaEdad(int edad) throws MenorDeEdadException {
        // Ponemos 1 condición
        if (edad < 18) {
            throw new MenorDeEdadException();
        }
    }
}
