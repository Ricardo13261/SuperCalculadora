/**
   * @AbstractStack.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * AbstrackStack: Clase abstracta para los Stacks
   * 
   *
   */

abstract public class AbstractStack<E> implements Stack<E>{
   
	/* post: regresa true si el stack esta vacio
    * (non-Javadoc)
    * @see Stack#empty()
    */
	public boolean empty(){
      return size() == 0;
   }
}
