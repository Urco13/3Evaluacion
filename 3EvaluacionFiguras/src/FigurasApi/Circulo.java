/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasApi;

import FigurasApi.Figura.TipoColor;

/**
 *
 * @author dam115
 */
public class Circulo extends Figura{
    private float radio;

    public Circulo(float radio, TipoColor color) {
        super(color);
        this.radio=radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
       double area;
       area = Math.PI *Math.pow(this.radio, 2);
       return area;
    }

    @Override
    public double perimetro() {
        double perimetro;
        perimetro = Math.PI*Math.pow(this.radio, 2);
        return perimetro;
    }

    public float getRadio() {
        return radio;
    }
    
}
