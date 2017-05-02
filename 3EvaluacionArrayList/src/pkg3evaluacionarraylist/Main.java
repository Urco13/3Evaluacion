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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Listin agenda = new Listin();
        try{
        Persona per1 = new Persona("Urco", "6666", "5446664c");
        Persona per2 = new Persona("Ursula", "5555", "111111c");
        Persona per3 = new Persona("Urraca", "4444", "333333c");
        //añadiendo contacto
        agenda.añadir(per1);
        agenda.añadir(per2);
        agenda.añadir(per3);
//        agenda.listar();
        }catch(Exception e){
        }
    }
    
}
