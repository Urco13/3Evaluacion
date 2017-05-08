/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpersonashashmap;

/**
 *
 * @author dam115
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPersonas lista=new ListaPersonas();
        
        lista.añadir(new Persona("carlos", "55555", "111"));
        lista.añadir(new Persona("Juana", "666666", "222"));
        lista.añadir(new Persona("dorinda", "77777777", "333"));
        lista.añadir(new Persona("pepe", "88888888", "444"));
        lista.añadir(new Persona("Dori", "88888888", "111"));
        lista.listarPersonas1();
        
    }
    
}
