/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionarraylist;

/**
 *
 * @author dam115
 */
public class Persona {
    private String nombre,tlf;
    private String dni;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String tlf, String dni) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", tlf=" + tlf + ", dni=" + dni + '}';
    }
    
}
