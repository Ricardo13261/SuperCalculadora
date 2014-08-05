/**
   * @SingleList.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * SingleList: implementacion de listas simplemente encadenadas
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014 
   *
   */

public class SingleList<E> extends AbstractList<E> {

	protected int count; // tamaño de la lista
    protected Node<E> head; // referencia a la cabeza de la lista

    public SingleList()
    // post: crea una lista vacía
    {
        head = null;
        count = 0;
    }

    public int size()
    // post: retorna el tamaño de la lista
    {
         return count;
    }

    public void addFirst(E value)
    // post: se agrega un elemento a la cabeza de la lista
    {
         head = new Node<E>(value, head);
         count++;
    }

    public E removeFirst()
    // pre: la lista no esta vacía
    // post: se remueve y retorna el elemento cabeza de la lista
    {
        Node<E> temp = head;
        head = head.next();
        count--;
        return temp.value();
    }

    public E peek()
    // pre: la lista no esta vacía
    // post: se retorna el último valor ingresado al stack
    {
         return head.value();
    }
  
    public void push(E item)
    // post: se agrega un elemento al stack
    // Este elemento sera retirado con un pop si no se realiza otro push
    {
        addFirst(item);
    }

    public E pop()
    // pre: el stack no esta vacío
    // post: el último elemento al que se le hizo push es retirado
    {
        return removeFirst();
    }
  
    public void addLast(E value)
    // post: se agrega un nuevo valor al final de la lista
    {
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
           // pointer to possible tail
           Node<E> finger = head;
           while (finger.next() != null)
           {
                finger = finger.next();
           }
           finger.setNext(temp);
        } 
        else head = temp;
        
        count++;
     }

    /*
     * Este metodo regresa el ultimo elemento de la lista
     * (non-Javadoc)
     * @see List#removeLast()
     */
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
