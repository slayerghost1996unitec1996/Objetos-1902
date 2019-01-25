/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanabasica;

/**
 *
 * @author T-101
 */
//primer paso pedimos la clase ala jdk 
import javax.swing.JFrame;
public class VentanaBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //paso 2: generamos el objeto de tipo JFrame
    
    //es la clase padre es la referencia
    // REFERENCIA        //CONSTRUCTOR 
    JFrame ventanita= new JFrame("HOLA MUNDO");
        //ESTO ES LA INSTANCIACION
    
        //PASO 3: DAMOS ORDENES AL OBJETO PARA QUE FUNCIONE
        ventanita.setSize(300, 300);
    
        ventanita.setVisible(true);
    }
    
}
