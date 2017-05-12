/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacioninterfacecomparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dam115
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Persona>listaPersonas=new ArrayList<Persona>();
       listaPersonas.add(new Persona("Carlos", "666666", "6666666666F"));
       listaPersonas.add(new Persona("Pepito", "4444444", "444444444F"));
       listaPersonas.add(new Persona("Menganito", "333333333", "333333333F"));
       
       Collections.sort(listaPersonas,new OrdenarPersonasAltura());
        System.out.println("Lista ordenada por orden altura"+listaPersonas);
        //otra ordenacion
        System.out.println("Personas ordenadas por fecha");
//        Collections.sort(, new CompararFechaNacimiento());
//        System.out.println("Lista"+listaPersonas);
    }
    
}
