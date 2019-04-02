/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nochecadas;

/**
 *
 * @author T-101
 */
public class NoNegativoExeption extends Exception{
 public NoNegativoExeption(){
     super("no permito valores negativos");
     
 }   
}
