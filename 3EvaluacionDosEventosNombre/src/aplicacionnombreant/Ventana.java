/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionnombreant;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author 
 */
public class Ventana extends JFrame  {
    //Creamos los componentes que va a tener la ventana(JFrame)
    JTextField txtnombre;
    JLabel lblnombre;
    JTextField txtnumero;
    JLabel lblnumero;
    JPanel panel1;
    JButton boton;
    
    JLabel lblmensaje;
    Ventana(){
        
        this.setTitle("Aplicacion Nombre");
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        
//        getContentPane().setLayout(new FlowLayout());
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        boton =new JButton("Hola");
        txtnombre = new JTextField();
        lblnombre = new JLabel("Nombre: ");
        txtnumero = new JTextField();
        lblmensaje=new JLabel();
        lblnumero = new JLabel("Número de letras: ");
        
        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 16));
        txtnombre.setEditable(true);
        txtnumero.setEditable(false);
        
        panel1 = new JPanel();
        
        lblmensaje=new JLabel();
        
        //Se crean los eventos que se pueden producir
        ActionListener a1 = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent evento){
               
                
               Object obj = evento.getSource();
              
               if (obj == txtnombre){
                   
                   txtnumero.setText(""+txtnombre.getText().length());
               }
            }
        };
        
       // eventos teclado
  
      KeyListener k=new KeyListener(){
              @Override
              public void keyTyped(KeyEvent e){    
       }
              @Override
        public void keyPressed(KeyEvent e) {
    	lblmensaje.setText("has escrito... ");
    	}
              @Override
      public void keyReleased(KeyEvent e) {
    	}
      };

      
  //asociar eventos
        txtnombre.addActionListener(a1);
        txtnombre.addKeyListener(k);
        
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel1.setLayout(new GridLayout(3,3));
        panel1.add(lblnombre);
        panel1.add(txtnombre);
        panel1.add(lblnumero);
        panel1.add(txtnumero);
        panel1.add(lblmensaje);
//        panel1.add(boton);
        getContentPane().add(panel1, BorderLayout.CENTER);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenSize.width-500)/2,(screenSize.height-700)/2, 300, 200);
        
    }
    
}
