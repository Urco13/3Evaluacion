package TiposEnumerados2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
enum Colores{
    Rojo, Verde, Azul
}
public class Figura {
    //si definimos enum dentro solo funciona en la clase no en el paquete
//    enum Colores{
//    Rojo, Verde, Azul
//}
    private Colores color;
    ///***clase color , objeto diferente
    //color c=color.BLUE;
    public Figura(Colores color){
        this.color=color;
    }
    public Colores getColor(){
        return color;
    }
    public void setColor(Colores color){
        this.color=color;
    }
    
    public String getNomColor(){
        String val="";
        switch (color) {
            case Rojo:val="Rojo";break;
            case Verde:val="Verde";break;
            case Azul:val="Azul";break;
        }
        return val;
    }
    //public Colores getColor3(){
//    return color;
//}
    
}// class
