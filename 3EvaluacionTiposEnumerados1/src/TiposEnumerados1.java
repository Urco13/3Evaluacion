/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class TiposEnumerados1 {
    //fuera de metodo
    public enum Semana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public static void main(String[]args){
        //definimos una variable que pertenece al tipo enumerado semana y le damos 
        //el valor que representa el dia martes
        Semana hoy= Semana.MARTES;
        //Si el dia cayese en fin de semana no hay que trabajar
        //observese que gracias a la numeracion del programa es facil de entender
        if (hoy==Semana.DOMINGO || hoy == Semana.SABADO) {
            System.out.println("Hoy toca descansar");
        }else{
            System.out.println("Hoy toca trabajar");
        }
        hoy =Semana.DOMINGO;
        System.out.println("Hoy =>"+hoy);
        
        //for extendido
        for(Semana d: Semana.values()){
            System.out.println("dia "+ d.toString());
        }
    }//fin main
}//fin class
