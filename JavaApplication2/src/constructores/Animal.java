/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-101
 */
public class Animal {
  public String nombre;
  public float peso;

    public Animal(float peso) {
        this.peso = peso;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }
}
