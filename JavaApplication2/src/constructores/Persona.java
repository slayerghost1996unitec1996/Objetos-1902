package constructores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-101
 */
public class Persona {
    
  private int edad;
  private String nombre;
  private String correo;

    public Persona(int edad, String nombre, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
   
    
}
