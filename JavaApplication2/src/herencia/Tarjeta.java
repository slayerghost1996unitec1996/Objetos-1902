/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public abstract class Tarjeta {

    private long numero;
    private String nombre;
    private int nip;

    public Tarjeta(int nip) {
        this.nip = nip;
    }

    public Tarjeta(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta(long numero) {
        this.numero = numero;
    }

    

    

    
    
    public long getNumero() {
        return numero;
    }
    

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

}
