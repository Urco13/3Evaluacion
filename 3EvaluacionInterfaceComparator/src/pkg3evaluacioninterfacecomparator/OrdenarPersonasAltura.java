/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacioninterfacecomparator;

import java.util.Comparator;

/**
 *
 * @author dam115
 */
public class OrdenarPersonasAltura implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2){
        return o1.altura - o2.altura;
        //Devuelve un entero positivo si la altura de o1
    }
}
