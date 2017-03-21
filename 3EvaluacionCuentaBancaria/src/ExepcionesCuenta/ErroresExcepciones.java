/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExepcionesCuenta;

/**
 *
 * @author dam115
 */
public class ErroresExcepciones extends Exception{
    int error=0;
    public ErroresExcepciones(int error){
        this.error=error;
    }
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1:return "No puedes dejar en blaco este campo";
            case 2:return "El numero de cuenta tiene que tener tamaño 6";
            case 3:return "El saldo no puede ser 0 ni menor de 0";
                
            default:return "error";
        }
    }
}
