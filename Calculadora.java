
/**
   * @Calculadora.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * Calculadora: Lee un archivo.txt una expresion en un formato postfix y lo calcula
   * 
   *
   */

import java.io.*;

public class Calculadora {
	/*Atributos de la calse*/
	private Stack<Integer> data;
	private String car;
	private int operando1,operando2,resultado;
	private char aChar;						//Se guarda el caracter que se va a ir leyendo
	private String implementacion;
	
	/**
	 * Constuctor de la clase
	 */
	public Calculadora(String implementa) {
		implementacion=implementa;
		StackFactory<Integer> sFactory= new StackFactory<Integer>();
		data =  sFactory.getStack(implementa);
		car="";
		operando1=0;
		operando2=0;
		resultado=0;
	}

	public void eligeImplementacion(){
		
		
	}

	/**
	 * Metodo que muestra el resultado de la operacion en el archivo .txt 
	 */
	public String muestraResultado() {
	      File text = null;													//Objeto de tipo File
	      FileReader fr = null;												//Se crea objeto lector de objetos File
	      BufferedReader br = null;											//Objeto que me carga en el buffer
	 
	      try {
	    	  String dir = System.getProperty("user.dir");
	    	  text = new File (dir+"\\Datos.txt");									//Se abre el fichero
	         
	         fr = new FileReader (text);									//Lector del archivo
	         br = new BufferedReader(fr);									//Se carga el archivo
	
	         car=br.readLine();										//Se guarda lo leido en stringDatos
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{															//Se asegura que se cierre el fichero
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	          
	  	//ciclo que compara cada caracter para saber si hacer push o pop y que operacion realizar
	      for (int x=0; x<car.length(); x++){
	    	  aChar=car.charAt(x);
	          if (aChar=='+'){					//suma los 2 ultimos valores si encuentra un "+"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 + operando2;
	          	data.push(resultado);
	          }

	          if (aChar=='-'){					//resta los 2 ultimos valores si encuentra un "-"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 - operando2;
	          	data.push(resultado);
	          }
	         
	          if (aChar=='*'){					//multiplica los 2 ultimos valores si encuentra un "*"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 * operando2;
	          	data.push(resultado);	        	
	          }
	          
	          if (aChar=='/'){					//divide los 2 ultimos valores si encuentra un "/"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 / operando2;
	          	data.push(resultado);	        	
	          }	        
	          
	          if (aChar=='0' || aChar=='1' || aChar=='2' || aChar=='3' 			//si encuentra un numero lo guarda en la pila
	          		 || aChar=='4' || aChar=='5' || aChar=='6' || aChar=='7' 
	          		 || aChar=='8' || aChar=='9'){
	          	data.push((int)aChar-48);
	          }
	           
	      }
	      return "El resultado de la implementacion usando "+implementacion+ " es:" +"\n" +data.peek();

	}
}
