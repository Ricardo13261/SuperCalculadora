/**
   * @NodeDoubleLinked.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * NodeDoubleLinked: nodos para la implementacion de las listas doblemente encadenadas
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014
   *
   */
public class NodeDoubleLinked<E>{
    protected E data;
    protected NodeDoubleLinked<E> nextElement;
    protected NodeDoubleLinked<E> previousElement;

    /*
     * Constructor, se recibe el valor a almacenar, la referencia al siguiente nodo y la referencia al nodo anterior
     */
    public NodeDoubleLinked(E v,NodeDoubleLinked<E> next, NodeDoubleLinked<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }   

    /*
     *  Se construye un nodo
     */
    public NodeDoubleLinked(E v){
        this(v,null,null);
    }
    
    /*
     * Metodo que retorna el valor almacenado en el nodo
     */
    public E value(){
       return data;
    }
    
    /*
     * Asigna una nueva referencia para el siguiente nodo
     */
    public void setPrevious(NodeDoubleLinked<E> previous){
       previousElement = previous;
    }
    
    /*
     * post: se regresa el nodo anterior
     */
    public NodeDoubleLinked<E> next(){
       return nextElement;
    }
}
