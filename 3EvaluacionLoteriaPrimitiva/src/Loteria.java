
import java.util.Random;

/**
 * 
 */
/**
 *
 * @author dam115
 */
public class Loteria {
    public void numerosAleatorios(int numero){
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
}
