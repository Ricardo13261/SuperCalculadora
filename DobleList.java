/**
   * @DoubleList.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * DoubleList: implementacion de listas doblemente encadenadas
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014
   *
   */

public class DobleList<E> extends AbstractList<E>{
	    protected int count;   									 //tamaño de la lista
	    protected NodeDoubleLinked<E> head;  					//referencia a la cabeza de la lista
	    protected NodeDoubleLinked<E> tail;  					//referencia a la cola de la lista

	    /*
	     * Constructor de una lista vacia
	     */
	    public DobleList()
	    {
	        head = null;
	        tail = null;
	        count = 0;
	    }

	    /*
	     * pre: head y tail con null por lo que no se agregab
	     * post: se agrega un elemento a la cabeza de la lista
	     * (non-Javadoc)
	     * @see List#addFirst(java.lang.Object)
	     */
	    public void addFirst(E value)
	    {
	        head = new NodeDoubleLinked<E>(value, head, null);
	        if (tail == null) 
	            tail = head;
	        count++;
	    }

	    /*
	     * pre: head y tail con null por lo que no se agregan
	     * post: se agrega un elemento a la cola de la lista
	     * (non-Javadoc)
	     * @see List#addLast(java.lang.Object)
	     */
	    public void addLast(E value){
	        tail = new NodeDoubleLinked<E>(value, null, tail);
	        if (head == null) 
	            head = tail;
	        count++;
	    }

	    /*
	     * pre: la lista no esta vacia entonces se procede
	     * post: devuelve el ultimo elemento
	     * (non-Javadoc)
	     * @see List#removeLast()
	     */
	    public E removeLast() {
	        NodeDoubleLinked<E> temp = head;
	        head = head.next();
	        if (head == null) {
	            tail = null;
	        } else {
	            head.setPrevious(null);
	        }
	        count--;
	        return temp.value();
	    }
	    
	    /*
	     * Metodo que retorna el ultimo valor ingresado al stack
	     * (non-Javadoc)
	     * @see Stack#peek()
	     */
	    public E peek(){
	         return head.value();
	    }
	  /*
	   * Se le agrega un elemento al STACK 
	   * (non-Javadoc)
	   * @see Stack#push(java.lang.Object)
	   */
	    public void push(E item) {
	        addFirst(item);
	    }

	    /*Metodo que regresa el ultimo elemento al que se le hizo push
	     * (non-Javadoc)
	     * @see Stack#pop()
	     */
	    public E pop(){
	        return removeLast();
	    }
	    
	    /*
	     * Metodo que retorna en un elemento el tamaño de la lista
	     * (non-Javadoc)
	     * @see List#size()
	     */
	    public int size(){
	         return count;
	    }

	    /*
	     * Metodo que regrea el primer elemento de la lista
	     * (non-Javadoc)
	     * @see List#removeFirst()
	     */
	    public E removeFirst() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
	}
