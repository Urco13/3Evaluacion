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
public class PolimorfismoAnimales {

     private static void muevete(Mamifero m){
            m.mover();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Mamifero unMamifero=new Mamifero();
       Perro unPerro = new Perro();
       //muevete (unMamifero);
        muevete(unPerro);
        
        if (unPerro instanceof Perro)
            System.out.println("el objeto es un perro");
        if(unPerro instanceof Mamifero)
            System.out.println("el objeto tambien es un Mamifero");
    }//fin main
    
}//fin class
