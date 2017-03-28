/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpolimorfismobicis;

/**
 *
 * @author dam115
 */
public class BiciMontana extends Bici{
    boolean suspension;
//Metodo de la clase hija que redefine al de la clase padre
    @Override public void indicarModelo() {
    System.out.println("Es una bicicleta de montana"); } 
}
