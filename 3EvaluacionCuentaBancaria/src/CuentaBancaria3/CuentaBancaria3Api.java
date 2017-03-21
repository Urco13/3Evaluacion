/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria3;

import ExepcionesCuenta.ErroresExcepciones;

/**
 *
 * @author dam115
 */
public class CuentaBancaria3Api {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErroresExcepciones {
        CuentaBancaria miCuenta = new CuentaBancaria("titular", 3, 3);
       miCuenta.estadoCB=CuentaBancaria.Estado.Activada;
    }
    
}
