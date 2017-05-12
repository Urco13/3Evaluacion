/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacioninterfacecomparator;

import java.util.Objects;

/**
 *
 * @author dam115
 */
public class Persona {
    private String nombre,tlf;
    private String dni;
    public int altura;
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

    public String getDni() {
        return dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", tlf=" + tlf + ", dni=" + dni + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
}
