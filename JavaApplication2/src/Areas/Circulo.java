/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author T-101
 */
public class  Circulo extends Areas {
    private float radio;
    
     @Override
    public void calcularArea() {

        float area = 3.1416f*radio*radio;
        setArea(area);
        
      
    }
    
    @Override
    public void calcularPermietro() {
        float perimetro=2f*radio;
        setPerimetro(perimetro);
    }
    
}
