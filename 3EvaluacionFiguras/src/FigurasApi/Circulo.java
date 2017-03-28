/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasApi;

import FigurasApi.Figura.tipoColor;

/**
 *
 * @author dam115
 */
public class Circulo extends Figura{
    float radio;

    public Circulo(float radio, tipoColor colorCirculo) {
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
