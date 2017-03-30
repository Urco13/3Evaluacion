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
public class Triangulo extends Figura{
   private float altura;
   private float lado;
   public Triangulo(float altura, float lado, TipoColor color){
       super(color);
       this.altura=altura;
       this.lado=lado;
   }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", lado=" + lado + '}';
    }

    @Override
    public double area() {
        double area;
        area = this.altura * this.lado/2;
        return area;
    }

    @Override
    public double perimetro() {
        return this.lado*3;
    }

    public float getAltura() {
        return altura;
    }
   
}
