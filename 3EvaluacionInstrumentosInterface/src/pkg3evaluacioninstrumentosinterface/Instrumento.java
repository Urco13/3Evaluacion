/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacioninstrumentosinterface;

/**
 *
 * @author dam115
 */
public class Instrumento implements InstrumentoMusical{
    public void tocar(){
        System.out.println(" tocar instrumento");
    }
    public void afinar(){
        System.out.println("");
    }
    public String tipoInstrumento(){
        return "tipo";
    }
}
