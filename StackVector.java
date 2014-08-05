/**
   * @StackVector.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * StackVector: Stack para el vector
   * 
   *
   */

import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
    /**
     * Atributos de la pila
     */
    protected Vector<E> data;
    protected boolean contenido;
    
    /**
     * Constructor
     */
    public StackVector(){
        data = new Vector<E>();
        contenido = false;
    }
    
    /* (non-Javadoc)
     * @see Stack#push(java.lang.Object)
     */
    public void push(E item){
        data.addElement(item);
    }
    
    /* (non-Javadoc)
     * @see Stack#pop()
     */
    public E pop(){
    	E e;
    	e=data.get(size()-1);
    	data.removeElementAt(size()-1);
    	
        return e;
    }
    
    /* (non-Javadoc)
     * @see Stack#peek()
     */
    public E peek(){
        return data.get(size()-1);
    }
    
    /* (non-Javadoc)
     * @see Stack#size()
     */
    public int size(){
        return data.size();
    }
    
    /* (non-Javadoc)
     * @see Stack#empty()
     */
    public boolean empty(){
        if(data.isEmpty()){
            contenido = false;
        }
        else{
            contenido = true;
        }
        return contenido;
    }    
}
