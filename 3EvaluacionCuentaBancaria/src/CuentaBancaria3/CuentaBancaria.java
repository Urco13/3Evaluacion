/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Añadir 
*Excepciones den datos no validos
*Estado de la cuenta Bancaria
*Estado Bloqueada, Activada, Noactivada usar enum
 */
package CuentaBancaria3;

import ExepcionesCuenta.ErroresExcepciones;

/**
 *
 * @author dam115
 */
public class CuentaBancaria {
    private String titular;
    private int numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;
    public enum Estado{Bloqueada,Activada,NOactivada}
    Estado estadoCB=Estado.Activada;
    public CuentaBancaria(String titular, int numeroDeCuenta, double saldo) throws ErroresExcepciones {
        if(titular.trim().isEmpty())
            throw new ErroresExcepciones(1);
        if (String.valueOf(numeroDeCuenta).length()>6)
            throw new ErroresExcepciones(2);
        if (saldo<=0)
            throw new ErroresExcepciones(3);
       
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta) {
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }
    
    public void ingresarDinero(double ingreso){
        this.saldo+=ingreso;
    }
    public void retirarDinero(double cantidad){
        this.saldo-=cantidad;
    }
    
   //toString ejemplo
    @Override
    public String toString(){
        return "Titular "+this.titular+" Saldo "+this.saldo+" ";
    }
    //eguals Ejemplo
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this.getClass() !=obj.getClass()){
            return false;
        }
        final CuentaBancaria miCuenta = (CuentaBancaria) obj;
        return miCuenta.titular.equals(this.titular);
    }
    public void estadoCuenta(Estado estadoCB){
        if (estadoCB==Estado.Activada)
            System.out.println("Tienes la cuenta activada");
        if(estadoCB==Estado.Bloqueada)
            System.out.println("Tienes la cuenta desastivada");
        if(estadoCB==Estado.NOactivada)
            System.out.println("No tienes la cuenta activada");
    }
    
}
