/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionnombreant;

import javax.swing.UIManager;

/**
 *
 * @author cai112
 */
public class Main {

   
    public static void main(String[] args) {
        
        try{
            
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
           Ventana miVentana = new Ventana();
        miVentana.setVisible(true); 
        }catch(Exception e){
            
            System.out.println("No se pudo establecer el aspecto deseado: " + e);
        }
        
        
              
    }

}
