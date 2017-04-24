
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public  class NumerosAleatorios {
    
    
    public int[] calcularNumeros(int numero){
        int  numeroAle = 0;
        int [] vector = new int[numero];
        boolean existe=false;
        Random ale = new Random();
        
        for (int i = 0; i < numero; i++) {
            while (existe)
            {
                 numeroAle=ale.nextInt(50)+1;
                 existe=comprobar(vector, numeroAle);
            }
           vector[i]=numeroAle;
        }
        return vector;
    }//fin numerosAle
     private  boolean comprobar(int vector[],int numero)
  {
  		int i=0;
		boolean existe= false;  
  		for (i=0; i<vector.length&& existe==false; i++)
		{
			if (vector[i]==numero)
				existe=true;
		}
		return existe;
  }  
}//fin class
