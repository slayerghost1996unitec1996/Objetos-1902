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
public class Exepciones1 {

    public static void main(String[] args) {
       
        int[] arreglito = {3, -2, 5};
       try{ 
        
        
        System.out.println(arreglito[2]);
        System.out.println(arreglito[0]);
System.out.println("si ocurre la excepcion. yo no me vere ratoncito no hay quesito");
        }catch(Exception e){
            System.out.println(e.getMessage());  
        }
    }
}
