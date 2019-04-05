/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion3;

import excepciones.ValidarLongitud6;
import excepciones.ValidarLongitud6Exception;
import funciones.Funciones;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class ProbarExcepcion {

    public static void main(String[] args) {
        try {
            ValidarLongitud6.validarLongitud("123456");
            System.out.println("Caracteres Aceptados :)");
            Validaciones.validaEdad(18);
            System.out.println("Edad Aceptada");
        } catch (MenorDeEdadException | ValidarLongitud6Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
