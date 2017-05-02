/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author dam115
 */
public class Listin {
    private ArrayList<Persona> agenda;

    public Listin() {
        agenda = new ArrayList<>();
    }
    public void añadir(Persona persona){
    agenda.add(persona);
    }
    public void listar(){
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia");
        }else{
            System.out.println("Agenda: ");
            for (Persona p : agenda) {
                System.out.println(p.toString());
                System.out.println(agenda.indexOf(p));
            }
        }
    }//fin listar
    
    public void cantidadPersonas(){
        System.out.println("El tamaño es"+ agenda.size());
    }
    public void listarNTP(){
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia");
        }else{
            for (Persona p : agenda) {
                System.out.println(p.getNombre());
            }
        }
    }
    
    public void buscarNombre(String nombre){
        boolean sw=false;
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia");
        }else{
            for (Persona p : agenda) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(p.toString());
                    sw=true;
                }
            }
        }
        if (!sw) {
            System.out.println("No se encontraron coincidencias");
        }
    }//buscar nombre
   public String buscarNombre2(String nombre){
        String cadena ="ERROR"+ nombre;
        ListIterator<Persona> iterador = agenda.listIterator();
        Persona temp;
        if (agenda.isEmpty()) {
            cadena="La agenda esta vacia";
        }else{
            while (iterador.hasNext()) {
                temp=iterador.next();
                if (nombre.equalsIgnoreCase(temp.getNombre())) {
                    cadena=temp.toString();
                }
            }
        }
       return cadena;
    }//buscar nombre
}//fin listin
