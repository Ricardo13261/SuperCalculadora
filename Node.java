/**
   * @Node.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * Node: Nodo para la lista simplemente encadenada
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014 
   *
   */

public class Node<E>{
    protected E data; 						//DATO A ALMACENAR
    protected Node<E> nextElement; 			// APUNTA AL SIGUIENTE NODO
    
    /*
     * pre: en v se tiene el valor y next apunta al siguiente nodo
     * post: se ha construido un nuevo nodo
     */
    public Node(E v, Node<E> next){
    	data = v;													
        nextElement = next;
    }
    
    /*
     * Los nodos se construyen en la cola de la lista
     */
    public Node(E v){
       this(v,null);	    

    }

    /*
     * Regresa un tipo Node osea la referencia al siguiente nodo
     */
    public Node<E> next(){
       return nextElement;
    }

    /*
     * post: se modifica la referencia al siguiente nodo
     */
    public void setNext(Node<E> next){
       nextElement = next;
    }

    /*
     * post: regresa lo que tiene el nodo almacenado
     */
    public E value()
    {
       return data;
    }

    /*
     * Nuevo valor para almacenar en el nodo
     */
    public void setValue(E value){
       data = value;
    }
}
