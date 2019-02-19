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
public class Triangulo extends Areas{
     private float base;
    private float altura;
    private float lado;

    
    @Override
    public void calcularArea() {

        float area = (base*altura)/2;
        setArea(area);
    }
    
    @Override
    public void calcularPermietro() {
        float perimetro=3*lado;
        setPerimetro(perimetro);
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     
    
    

    
}
