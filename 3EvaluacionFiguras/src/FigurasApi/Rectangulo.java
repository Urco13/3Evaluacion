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
public class Rectangulo extends Figura{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura, TipoColor color) {
        super(color);
        this.base=base;
        this.altura=base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double area() {
        double area;
        area=this.base * this.altura;
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro;
        perimetro = 2*(this.base+this.altura);
        return perimetro;
    }
    
}
