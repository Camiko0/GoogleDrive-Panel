//Paquete
package vista;

import java.awt.Color;
//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Declaración de la clase
public class Vista extends JFrame implements ActionListener{
	
	//Declaración de componentes
	private JPanel panelSuperior, panelInferior, panelIzquierdo, panelDerecho, panelFinal;
	
	//Constructor
	public Vista() {
		//Creación de dos paneles (Izquierdo y derecho) con diferente color
		
		//Panel Superior
		//Ejemplificación del Panel
		panelSuperior = new JPanel();
		//Posición y tamaño del panel
		panelSuperior.setBounds(0, 0, 1280, 80);
		//Color de fondo
		panelSuperior.setBackground(Color.blue);
		//Sin Layout
		panelSuperior.setLayout(null);
		
		//Panel Inferior
		panelInferior = new JPanel();
		panelInferior.setBounds(280, 80, 950, 80);
		panelInferior.setBackground(Color.green);
		panelInferior.setLayout(null);
				
		//Panel Izquierdo
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBounds(0, 80, 280, 590);
		panelIzquierdo.setBackground(Color.red);
		panelIzquierdo.setLayout(null);
		
		//Panel Derecho
		panelDerecho = new JPanel();
		panelDerecho.setBounds(280, 160, 950, 510);
		panelDerecho.setBackground(Color.orange);
		panelDerecho.setLayout(null);
		
		//Panel Inferior
		panelFinal = new JPanel();
		panelFinal.setBounds(1230, 80, 50, 590);
		panelFinal.setBackground(Color.white);
		panelFinal.setLayout(null);
		
		//Agregar componentes a la ventana
		add(panelSuperior);
		add(panelInferior);
		add(panelIzquierdo);
		add(panelDerecho);
		add(panelFinal);
		
		//Configuración de la ventana
		//Titulo
		setTitle("Google Drive");
		//Cerrar la ventana al terminar la ejecución
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Tamaño de la ventana
		setSize(1280,670);
		//Ubicación en el centro de la pantalla
		setLocationRelativeTo(this);
		//Sin Layout
		setLayout(null);
		//Sin barra superior
		setUndecorated(false);
		//No se le puede cambiar el tamaño
		setResizable(false);
		//Color de fondo de la ventana
		//getContentPane().setBackground(Color.green);
		setVisible(true);
	}

	//Metodo de eventos	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
