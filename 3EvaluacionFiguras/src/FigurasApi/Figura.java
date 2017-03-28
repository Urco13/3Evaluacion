/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasApi;

/**
 *
 * @author dam115
 */
public abstract class Figura {
    public enum tipoColor{Negro, Verde, Azul};
    tipoColor colorFigura;//mirar
    public abstract double area();
    public abstract double perimetro();
}
