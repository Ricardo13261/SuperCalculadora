import javax.swing.JFrame;

/**
   * @Principal.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * Principal: Programa principal de la calculadora
   * 
   *
   */

public class Principal {
	//Frame de control
	private static JFrame frame;	

	public static void main (String args[]){
		InterfazGrafica in = new InterfazGrafica(frame);
		frame.setDefaultLookAndFeelDecorated(true);
		in.creandoInterfaz();
		}
}



