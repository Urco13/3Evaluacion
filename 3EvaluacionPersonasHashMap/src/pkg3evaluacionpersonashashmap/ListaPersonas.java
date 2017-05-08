/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpersonashashmap;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author dam115
 */
public class ListaPersonas {
    private HashMap lista = new HashMap();
    
    public void añadir(Persona p){
        String clave=p.getDni();
        lista.put(clave, p);
    }
    
    public void listarPersonas1(){
        Persona[]datos=this.obtenertabla();
        for (Persona i : datos) {
            System.out.println(i.toString());
        }
    }

    private Persona[] obtenertabla() {
        Collection valores=this.lista.values();
        
        Persona[]tabla=new Persona[0];
        tabla=(Persona[])valores.toArray(tabla);
        return tabla;
    }
    
  
}
