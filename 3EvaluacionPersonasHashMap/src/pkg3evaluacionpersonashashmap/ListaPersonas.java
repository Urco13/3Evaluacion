/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3evaluacionpersonashashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author dam115
 */
public class ListaPersonas {
    private HashMap lista = new HashMap();
    
    public void añadir(Persona p){
        String clave=p.getDni();
        lista.put(clave, p);
    }
    
    public void listarPersonas1(){
        Persona[]datos=this.obtenertabla();
        for (Persona i : datos) {
            System.out.println(i.toString());
        }
    }

    private Persona[] obtenertabla() {
        Collection valores=this.lista.values();
        
        Persona[]tabla=new Persona[0];
        tabla=(Persona[])valores.toArray(tabla);
        return tabla;
    }
    
  public void buscarPorDni(String dni){
      if (lista.containsKey(dni.toString())) {
          System.out.println("Ya existe el dni");
      }else{
          System.out.println("No existe el dni");
      }
  }
  public Persona buscarPorClave(String clave){
      Persona miPersona = null;
      if (lista.containsKey(clave)) {
          System.out.println("Si existe");
             miPersona =(Persona) lista.get(clave);
      }else{
          System.out.println("No existe"); 
      }
      return miPersona;
  }
  
  public void borrarLista(String clave){
      
  }
  public void mostraClaveValor(){
      System.out.println("Mostrar clave valor");
      System.out.println(lista.entrySet().toString());
  }
  public Object[]listaclaves(){
      Set conjunto=lista.keySet();
      //lista.keySet().toString();//pasa una cadena
      return conjunto.toArray();
  }
  
  public void modificar(){
      
  }
//  public void modificar(String nombre,String telf, String dni){
//      lista.remove(dni);
//      Persona p=new Persona(nombre, telf, dni);
//      lista.put(dni, p);
//  }
//  public void pruebaModificar(String dni,String nombre){
//      Persona p;
//      if (lista.containsKey(dni)) {
//          p=(Persona) lista.get(dni);
//          System.out.println("refer obtenida");
//          System.out.println("==> "+p.toString());
//          p.setNombre(nombre);//modifico
//          System.out.println(" "+p.getDni()+" "+p.getNombre());
//          System.out.println("refer objeto modificado");
//      }
//  }
  
}//lista personas
