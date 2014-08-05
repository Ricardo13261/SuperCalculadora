/**
   * @CircularList.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * CircularList: implementacion de listas circulares
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014
   *
   */

public class CircularList<E> extends AbstractList<E>
{
    protected Node<E> tail; // referencia a la cola de la lista
    protected int count; // tamaño de la lista

    /*
     * Se construye lista circular vacia tail=null
     * Y el tamaño = 0 
     */
    public CircularList(){
       tail = null;
       count = 0;
    }

    /*
     * Pre: no se envia un valor en NULL
     * Post: se agregan elementos a la lista
     * (non-Javadoc)
     * @see List#addFirst(java.lang.Object)
     */
    public void addFirst(E value){
       Node<E> temp = new Node<E>(value);
       if (tail == null) { // first value added
           tail = temp;
           tail.setNext(tail);
       } else { // element exists in list
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }

    /*
     * Se envia un elemento a la ultima posicion de la lista
     * (non-Javadoc)
     * @see List#addLast(java.lang.Object)
     */
    public void addLast(E value){
       addFirst(value);
       tail = tail.next();
    }

    /*
     * Se agrega un elemento al stack
     * (non-Javadoc)
     * @see Stack#push(java.lang.Object)
     */
    public void push(E item){
        addLast(item);
    }

    /*
     * Se obtiene el ultimo elemento del stack
     * (non-Javadoc)
     * @see Stack#pop()
     */
    public E pop(){
        return removeLast();
    }
    
    /*
     * Se muestra el ultimo valor al que se le hizo push
     * (non-Javadoc)
     * @see Stack#peek()
     */
    public E peek(){
        return tail.value();
    }

    /*
     * Se retorna el numero de elementos en el STACK
     * (non-Javadoc)
     * @see List#size()
     */
    public int size(){
        return count;
    }

    /*
     * Se toma el ultimo elemento de la lista solo si no esta vacio
     * (non-Javadoc)
     * @see List#removeLast()
     */
    public E removeLast(){
       Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
       }
       count--;
       return temp.value();
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
