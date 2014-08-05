/**
   * @StackFactory.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * StackFactory: Factory de la hoja de trabajo 4
   * 
   *
   */

class StackFactory<E> {

   /**
    * selecciona la implementacion a utilizar para un stackse utiliza el patron Factory
    * @param entry
    * @return
    */
	public Stack<E> getStack(String entry,String listaEntry) {
	   // seleccion de la implementacion a utilizar:
		if (entry.equals("arraylist"))		      
			return new StackArrayList<E>(); //regresa list
		
		if (entry.equals("list")){
			if(listaEntry.equals("simple"))
				return new SingleList<E>(); //regresa ArrayList
			if(listaEntry.equals("doble"))
				return new DobleList<E>(); //regresa ArrayList
			if(listaEntry.equals("circular"))
				return new CircularList<E>(); //regresa ArrayList
			
		}
		if (entry.equals("vector"))
	      return new StackVector<E>(); //regresa Vector
		
		return null;   
   } 
   
}
