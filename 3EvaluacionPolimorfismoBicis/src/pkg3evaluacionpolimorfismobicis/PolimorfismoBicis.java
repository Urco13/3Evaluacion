/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpolimorfismobicis;

/**
 *
 * @author dam115
 */
public class PolimorfismoBicis {
    /*Limitacion del polimorfismo limita el t
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui se declara la referencia de la clase padre 
        Bici miBici;
//Aqui adoptara la forma de referencia a la clase BiciCarreras 
miBici = new BiciCarreras(); 
miBici.indicarModelo();
//Aqui adoptara la forma de referencia a la clase BiciMontana 
miBici = new BiciMontana(); 
miBici.indicarModelo();
//miBici. buscando los metodos a los que se puede acceder veremos que no podemos
//ver el metodo prueba
    }//fin main
    
}//fin class
