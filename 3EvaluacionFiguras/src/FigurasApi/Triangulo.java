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
public class Triangulo extends Figura{
   float altura;
   float lado;
   public Triangulo(float altura, float lado, tipoColor colorTriangulo){
   }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", lado=" + lado + '}';
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
