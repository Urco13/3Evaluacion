/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpersonashashmap;

/**
 *
 * @author urco1
 */
public class MultiplesExcepciones extends Exception{
    private int error;
    public MultiplesExcepciones(int error){
        this.error=error;
    }
    
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1:return "No puede contener caracteres";
            case 2:return "No puede ser menor de 9";
            case 3:return "Al final tiene que estar una letra";
            case 4:return "Tu numero de letra no es correcto";
            default:
                throw new AssertionError();
        }
    }
}
