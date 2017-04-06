package aplicacionnombreant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
class VentanaSW extends JFrame
{
    JLabel etiqueta;
   JButton boton;
  static String mensaje = "!!!Hola mundo!!!";
  
  VentanaSW(String titulo) // constructor
  {
    super(titulo); // t�tulo de la ventana principal
    iniciarComponentes();
    // Ajustar el tama�o de la ventana al m�nimo
   // pack(); descomentar y probar
  }//fin constructor...................................

  private void iniciarComponentes()
  { 
     this.getContentPane().setLayout(new FlowLayout()); // gestor a la ventana
      // ****Permitir que la ventana de la aplicacion responda a los
    // eventos de ventana (p.e. cerrar la ventana)
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
    // Crear una etiqueta con el texto centrado y Crear un boton
    etiqueta = new JLabel();
    etiqueta.setHorizontalAlignment(JLabel.CENTER);
    boton = new JButton("Haga clic aqui");
    // Establecer como tecla aceleradora la C. Entonces, pulsar Alt+C
    boton.setMnemonic(KeyEvent.VK_C);
    // Asignar al bot�n una descripcion abreviada
    boton.setToolTipText("boton de pulsacion");
    // Permitir que el bot�n responda a los eventos de accion
    ActionListener al =
      new ActionListener()
      {    // Este metodo se ejecutar cuando se haga clic en "boton"
        @Override
        public void actionPerformed(ActionEvent evento)
        {
          Object obj = evento.getSource();
          if (obj == boton)
            mostrarMensaje();
        }
      };
    boton.addActionListener(al);
    // Crear un panel para colocar los controles
    JPanel panel = new JPanel();
    // Introducimos un borde sin pintar alrededor de los controles:
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 20, 20));
    panel.setBackground(Color.CYAN);
    // Establecer un administrador de dise�o de cuadr�cula al panel
    panel.setLayout(new GridLayout(0, 1));
    // Los controles se a�aden en columna (filas = 0)
   
    panel.add(etiqueta);
    panel.add(boton);
    this.setResizable(false);//la ventana no puede cambiar su tamaño
    // A�adir los componentes al contenedor de la aplicaci�n
    getContentPane().add(panel, BorderLayout.CENTER);
    
Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-300)/2,(screenSize.height-500)/2 , 300,500);
    
    }
    private void mostrarMensaje()
  {
    // Mostrar el "mensaje" en la "etiqueta"
    etiqueta.setText(mensaje);
  }
}
public class EstrucAplicaSW{
  public static void main(String[] args)
  {
    try     
    {    // Aspecto y percepci�n de la interfaz gr�fica
      UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch (Exception e)
    {
      System.out.println("No se pudo establecer el aspecto deseado: " + e);
    }
    VentanaSW miventana = new VentanaSW ("Aplicaci�n Swing");
    miventana.setVisible(true);
  }// fin main.........................
}