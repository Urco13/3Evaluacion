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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5, Figura.TipoColor.Negro);
        Triangulo triangulo1 = new Triangulo(3, 5, Figura.TipoColor.Negro);
        Rectangulo rectangulo1 = new Rectangulo(5, 6, Figura.TipoColor.Negro);
        
        System.out.println("Tipo de objeto "+circulo1.getClass().getName());
       
        System.out.println(circulo1.toString());
        
        Figura lista[]=new Figura[5];
        
        
        Circulo c1=new Circulo((float)4.5, Figura.TipoColor.Negro);
        lista[0]=c1;
        lista[1]= new Circulo(6, Figura.TipoColor.Negro);
        lista[2]= new Rectangulo(6, 6, Figura.TipoColor.Negro);
        lista[3]= new Triangulo(6, 8, Figura.TipoColor.Negro);
        lista[4]= new Circulo(8, Figura.TipoColor.Negro);
        ((Triangulo)lista[3]).getAltura();
        ((Circulo)lista[4]).getRadio();
        
                
        //recorrer
              for (int i = 0; i < lista.length; i++) {
                  System.out.println("Clase="+ c1.getClass().getName());
                  System.out.println("Color="+ lista[i].getNomColor());
                  //funciona
                  System.out.println("Color2"+lista[i].getColor());
                  
                 //conversiones
                  if (lista[i] instanceof Circulo) {
                      System.out.println("Area="+((Circulo)lista[i]).area());
                  }else if(lista[i]instanceof Triangulo){
                      System.out.println("Area="+((Triangulo)lista[i]).area());
                  }else
                       System.out.println("Area="+((Rectangulo)lista[i]).area());
        }//fin for
 
              //tipo objeto, variable o posicion y sobre que estructura
         for (Figura i : lista) {
             System.out.println("Clase"+ i.getClass().getName());
             System.out.println("=> "+ i.toString());
        }
         System.out.println("Lista de colores");
         for (TipoColor c : TipoColor.values()) {//estructura de datos
             System.out.println(c);
        }
    }
    
}
