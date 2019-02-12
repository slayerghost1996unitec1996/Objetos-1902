/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author T-101
 */
public class Suma {

    private int x;
    private int y;

    // suma
    
    int sumar() {
        int z = x + y;
        //return x+y
        return z;
    }

    //resta
    
    int resta() {
        int z = x - y;
        return z;
    }
    
    //multiplicacion
    
    int multiplicacion(){
        int z=x*y;
        return z;
        
    }
    
    //division
    
    double division(){
        double z=(double) x/y;
        return z;
    }
    
    double thisisesparta(){
        int z=x*x;
        return z;
    }
            

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0)x=-x;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y<0)y=-y;
        this.y = y;
    }
}
