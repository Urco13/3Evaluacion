/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionfutbol;

/**
 *
 * @author dam115
 */
public class Fubol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demarcacion delantero = Demarcacion.DELANTERO;
        Demarcacion defensa = Demarcacion.DEFENSA;
        
        System.out.println("Delantero.name() "+delantero.name());
        Futbolista futbolista1 = new Futbolista("Carlos", 6, Demarcacion.DELANTERO, Equipo.BARÇA);
        
        
        Equipo villarreal = Equipo.VILLAREAL;
        System.out.println("defensa.toString()="+defensa.toString());
        //devuelve un entero con la posicion de la constante segun esta declarada
        System.out.println("Delantero.ordinal()"+ delantero.ordinal());
        //compara enum con el parametro segun el orden en el que estan declaradas
        System.out.println("Delantero compareTo(portero)= "+delantero.compareTo(defensa));
        System.out.println("Delantero compareTo(delantero)= "+delantero.compareTo(delantero));
        
        //recorre todas las constantes de la enumeracion
        for (Demarcacion d : Demarcacion.values()) {
            System.out.println(d.toString()+" - ");
        }
    }
    
}
