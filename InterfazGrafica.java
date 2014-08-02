/**
   * @InterfazGrafica.java  1.0 01/08/14
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Ricardo Franco: 13261
   * InterfazGrafica: GUI de la hoja de trabajo 4
   * 
   *
   */
//Importando librerias utiles
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class InterfazGrafica extends JPanel implements ActionListener, ItemListener{
	/**ATRIBUTOS**/
	private static JFrame frame,frameControl;										//frame principal de la GUI y frame de control de errores
	private JTextArea areatexto; 
    private JComboBox comboBox;
	private JButton btonSimplEncadenado,btonDoblEncadenado, btonCircular;
	private static String comSimple,comDoble,comCircular;
	
	/**
	* Constructor con un parametro que es un frame de control de errores
	* @param v El parámetro v es un frame que sirve para mostrarle errores de ingreso al usuario
	*/
	public InterfazGrafica(JFrame v){
		frameControl=v;																	//Panel de control de errores
		
		//Construyendo paneles de la interfaz				
		JComponent panelBanner=panelBanner();											
		JComponent panelImplementacion=panelImplementacion();
		JComponent panelResultado=panelResultado();
		JComponent panelImplementacionList=panelImplementacionList(); 
		
		add(panelBanner);
		add(panelImplementacion);
		add(panelImplementacionList);
		add(panelResultado);

		
	}	
	
	/**
	* Método que devuelve el panel con los botones para seleccionar la implemetacion del stack
	* @return JPanel con tres botones
	*/	  									  							  
		protected JComponent panelImplementacion(){
		JPanel panel = new JPanel(new GridLayout(0,1));									//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Implementacion. ")); 		
		panel.setPreferredSize(new Dimension(125, 55));     							//Cambiandolo de tamanio

		comboBox= new JComboBox();
		comboBox.addItem("Escoga una opcion");
		comboBox.addItem("Vector");
		comboBox.addItem("ArrayList");
        comboBox.addItem("List");
	    
		comboBox.addItemListener(this); 
		panel.add(comboBox);
		
		return panel;
		

	}
		
	
	/**
	* Método que devuelve el panel con los botones para seleccionar la implementacion de list
	* @return JPanel con tres botones
	*/	  									  							  
		protected JComponent panelImplementacionList(){
		JPanel panel = new JPanel(new GridLayout(0,1));									//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Tipo de Lista. ")); 		
		panel.setPreferredSize(new Dimension(200, 75));     							//Cambiandolo de tamanio
		
		btonSimplEncadenado=new JButton("Simplemente encadenados");
		btonSimplEncadenado.setActionCommand(comSimple);											//Comando de boton
		btonSimplEncadenado.addActionListener(this);												//Asignando listener
		btonDoblEncadenado=new JButton("Doble encadenados");
		btonDoblEncadenado.setActionCommand(comDoble);											//Comando de boton
		btonDoblEncadenado.addActionListener(this);												//Asignando listener
		btonCircular=new JButton("Circular");
		btonCircular.setActionCommand(comCircular);											//Comando de boton
		btonCircular.addActionListener(this);												//Asignando listener
		
		panel.add(btonSimplEncadenado);
		panel.add(btonDoblEncadenado);
		panel.add(btonCircular);

		
		return panel;
	}
			
	/**
	* Método que devuelve el panel con una caja de texto y scroll
	* @return JPanel con una caja de texto y scroll
	*/	  									  							  
		protected JComponent panelResultado(){
		JPanel panel = new JPanel(new GridLayout(0,1));									//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Resultado. ")); 		
		panel.setPreferredSize(new Dimension(335, 100));     							//Cambiandolo de tamanio
		
	    areatexto = new JTextArea ( 16, 58 );
	    areatexto.setEditable ( false ); // set textArea non-editable
	    JScrollPane scroll = new JScrollPane ( areatexto );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

	    panel.add ( scroll );

	
		return panel;
	}	
	
	
			
	/**
	* Método que devuelve el panel con el banner que contiene una imagen jpg de una calculadora
	* @return JPanel con una imagen
	*/
	protected JComponent panelBanner(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		JLabel banner = new JLabel("", JLabel.CENTER);  						//Centrando banner              
		banner.setOpaque(true);        											//Haciendolo mas opaco
		banner.setPreferredSize(new Dimension(350, 325));         				//Cambiandolo de tamaÃ±o
		banner.setIcon(new ImageIcon("calcuworld.png")); 							//Creando Imaege icon con parametro de direccion	
		JPanel bannerPanel = new JPanel(new BorderLayout());      				//Creando panel para banner
		bannerPanel.add(banner, BorderLayout.CENTER);        					//Centrado y agregando el banner al panel
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Calculadora version 2.0")); 	//Colocandole texto al borde			
		panel.add(bannerPanel, BorderLayout.CENTER);							//AÃ±adiendo al Frame
		return panel;
	}

	/**
	*	GESTIONADOR DE EVENTOS: Permite gestionar todos los eventos de la clase.
	* @see ActionEvent
	* @see ActionListener
	*/						  
	public void actionPerformed(ActionEvent e){									//Empieza el control de eventos
	String comando = e.getActionCommand();										//String del comando de accion			
	
	
	
	}//Final de gestionador de eventos	

	/**
	* creandoInterfaz:Metodo que crea el Frame principal, el contenedor principal y muestra la interfaz grafica
	* @see windowActivated */
	public void creandoInterfaz() {
		frame = new JFrame(" Calculadora Post-fix. ");			        						//Creando la ventana principal
		frame.setPreferredSize(new Dimension(395, 590)); 						//colocar caracteristicas al frame (tamaÃ±o)
		
		this.setOpaque(true); 													//Se vuelve opaco el panel de contenido para que no sea diferenciado
		frame.setContentPane(this);												//Estableciendo el panel principal.
		frame.setResizable(false);												//Bloqueando la maximizaciÃ³n de la ventana
		
		
		
		frame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);	//Asegurandose de que el evento foco se valla al Panel principal
		frame.addWindowListener(new WindowAdapter() {							//El evento foco se centra en este panel no importa que
		//Cerrando con confirmacion
		public void windowClosing(WindowEvent we){
			int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea salir?");
			if ( eleccion == 0) {
				System.exit(0);
			}  
			}
		});
		
		//Mostrando el frame
		frame.pack();
		frame.setLocationRelativeTo(null);;										//Frame en el centro
		frame.setVisible(true);	
	}

	
	/*
	 * Metodo donde se controlan los indices del Combo Box
	 * Ademas en cada indice se muestra el resultado deseado segun la implementacion escogida por le usuario
	 * (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	public void itemStateChanged(ItemEvent a){ 

		if(comboBox.getSelectedIndex() == 0){
	    	btonSimplEncadenado.setVisible(false);
			btonDoblEncadenado.setVisible(false);
			btonCircular.setVisible(false);
			/*En esta opcion no se muestra nada*/
		}
		
		if(comboBox.getSelectedIndex() == 1){
	    	btonSimplEncadenado.setVisible(false);
			btonDoblEncadenado.setVisible(false);
			btonCircular.setVisible(false);
			/*Muestra el Resultado con la implementacion de arrayList*/
			Calculadora calarraylist= new Calculadora("vector");
	    	areatexto.setText(calarraylist.muestraResultado());

		}
		
	    if(comboBox.getSelectedIndex() == 2){
			btonSimplEncadenado.setVisible(false);
			btonDoblEncadenado.setVisible(false);
			btonCircular.setVisible(false);
			/*Muestra el Resultado con la implementacion de vector*/
			Calculadora calvector= new Calculadora("arraylist");
	    	areatexto.setText(calvector.muestraResultado());

	    }
					
		if(comboBox.getSelectedIndex() == 3){
			btonSimplEncadenado.setVisible(true);
			btonDoblEncadenado.setVisible(true);
			btonCircular.setVisible(true);
			/*Muestra el Resultado con la implementacion de list*/
			Calculadora calarraylist= new Calculadora("vector");
	    	areatexto.setText(calarraylist.muestraResultado());
		}
								
			
		
    	
		
	}
}
