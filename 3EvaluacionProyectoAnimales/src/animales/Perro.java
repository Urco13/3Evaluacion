/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author dam115
 */
public class Perro extends Mamifero{
    private String raza;
    
    @Override
    public final void mover(){
        System.out.println("Ahora es un perro el que se mueve");
    }
}
