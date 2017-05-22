/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelovistacontrolador;

import java.util.ArrayList;

/**
 *
 * @author dam115
 */
public class Lista {
    private ArrayList <Persona>lista;

    public Lista() {
        this.lista = new ArrayList<Persona>();
    }

   
    /**
     * Get the value of lista
     *
     * @return the value of lista
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }

    /**
     * Set the value of lista
     *
     * @param lista new value of lista
     */
    public void addPersona(Persona p) {
        this.lista.add(p);
    }
    
    public Persona getPersona(int p) {
        return (Persona)lista.get(p);        
    }
    
    public int tam() {
        return lista.size();
    }
}
