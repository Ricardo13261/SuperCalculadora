
/**
   * @AbstractList.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * Abstracklist: Clase abstracta para las listas
   * 
   *
   */


abstract public class AbstractList<E> implements List<E>,Stack<E>{
	
  public boolean empty(){
	  //post: regresa true si el stack esta vacio
      return size() == 0;
   }
 }
