
/**
   * @List.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * List: Interfaz de la Lista.
   * Basado en el contenido 06 (listas) De algoritmos y estructura de Datos 02/08/2014
   * 
   */

public interface List<E>
{
   public int size();
   // post: returns number of elements in list

   public boolean empty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list
}
