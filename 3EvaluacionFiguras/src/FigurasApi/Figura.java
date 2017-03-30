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
    enum TipoColor{Negro, Verde, Azul};
    
    private TipoColor color;
    
    public Figura(TipoColor color){
        this.color=color;
    }
    public abstract double area();
    public abstract double perimetro();

    public TipoColor getColor() {
        return color;
    }
    
    public String getNomColor(){
        String val="";
        switch (color) {
            case Negro:val = "Rojo";break;
            case Verde:val = "Verde";break;
            case Azul:val = "Azul";break;
        }
        return val;
    }
    
}
