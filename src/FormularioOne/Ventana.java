package FormularioOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Ventana {
	JFrame Ventana;
	JPanel panelA,panelB,panelBB,panelC,panelD;
	JLabel label,label1,label2,label3,label4,label5,label6;
	JTextField texto,texto1,texto2,texto3,texto4;
	JButton boton,boton1,boton2,boton3,boton4,boton5;

	//------------------------------------------------------------
	public void panelA() {
		panelA =new JPanel();
		panelA.setLayout(new FlowLayout(FlowLayout.CENTER));
		Border v = BorderFactory.createTitledBorder("User");
        panelA.setBorder(BorderFactory.createCompoundBorder(v, BorderFactory.createEmptyBorder(10, 10, 10, 10))); // Agrega margen interno
		
		
	     //--------------- AGG IMGA AL LADO DE EL TITULO
		ImageIcon icono = new ImageIcon(getClass().getResource("/pp.jpeg"));
		Image img = icono.getImage().getScaledInstance(110, 110, Image.SCALE_FAST);
		ImageIcon iconoEscalado = new ImageIcon(img);
			
			
		label =new JLabel("FORMULARIO DE CLIENTES", iconoEscalado, JLabel.LEFT);
		Font max = new Font("Arial",Font.BOLD,29);
		label.setFont(max);


		panelA.add(label);
	}
	//------------------------------------------------------------
	
	public void panelB() {
		panelB =new JPanel();
		label1 =new JLabel();
		panelB.setLayout(new FlowLayout(FlowLayout.CENTER));


		Border tittle = BorderFactory.createTitledBorder("Datos de el Cliente");
		panelB.setBorder(BorderFactory.createCompoundBorder(tittle, BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
        
		
		label2 =new JLabel("ID");
		texto=new JTextField("ID",15);
		texto.setForeground(Color.red);
		
		
		label3 =new JLabel("Descricion");
		texto1=new JTextField("Descricion",15);
		texto1.setForeground(Color.red);

	
		label4 =new JLabel("Direcion");
		texto2=new JTextField("Direcion",15);
		texto2.setForeground(Color.red);

		
		panelB.add(label1);
		panelB.add(label2);
		panelB.add(texto);
		panelB.add(texto1);
		panelB.add(label3);
		panelB.add(texto2);
		panelB.add(label4);
	
	}
	
	
	public void panelBB() {
		panelBB =new JPanel();
		
		panelBB.setLayout(new FlowLayout(FlowLayout.CENTER));


		Border tittlee = BorderFactory.createDashedBorder(null);
		panelBB.setBorder(tittlee);
        

		label5 =new JLabel("Telefono");
		texto3=new JTextField("Telefono",15);
		texto3.setForeground(Color.red);
		
		
		label6 =new JLabel("RUC");
		texto4=new JTextField("RUC",15);
		texto4.setForeground(Color.red);

		panelBB.add(texto3);
		panelBB.add(label6);
		panelBB.add(texto4);
		panelBB.add(label5);
		

		
	}
	//------------------------------------------------------------

	public void panelC() {
		panelC =new JPanel();
	    panelC.setLayout(new FlowLayout(FlowLayout.CENTER));
		Border v = BorderFactory.createTitledBorder("Acciones a Realizar");
		panelC.setBorder(BorderFactory.createCompoundBorder(v, BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
	        
	    ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/icono_nuevo.png"));
	    boton = new JButton("Nuevo", iconoNuevo);
	    boton.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton.setHorizontalTextPosition(SwingConstants.CENTER);
	    

	    ImageIcon iconoNuevo1 = new ImageIcon(getClass().getResource("/icono_guardar.png"));
		boton1 = new JButton("Guardar",iconoNuevo1);
		boton1.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton1.setHorizontalTextPosition(SwingConstants.CENTER);
		
	    ImageIcon iconoNuevo2 = new ImageIcon(getClass().getResource("/icono_editar.png"));
		boton2 = new JButton("Editar",iconoNuevo2);
		boton2.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton2.setHorizontalTextPosition(SwingConstants.CENTER);
		
	    ImageIcon iconoNuevo3 = new ImageIcon(getClass().getResource("/icono_eliminar.png"));
		boton3 = new JButton("Eliminar",iconoNuevo3);
		boton3.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton3.setHorizontalTextPosition(SwingConstants.CENTER);
		
	    ImageIcon iconoNuevo4 = new ImageIcon(getClass().getResource("/icono_informe.png"));
		boton4 = new JButton("Informe",iconoNuevo4);
		boton4.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton4.setHorizontalTextPosition(SwingConstants.CENTER); 
	    
	    ImageIcon iconoNuevo5 = new ImageIcon(getClass().getResource("/icono_cancelar.png"));
		boton5 = new JButton("Cancelar",iconoNuevo5);
		boton5.setVerticalTextPosition(SwingConstants.BOTTOM);
	    boton5.setHorizontalTextPosition(SwingConstants.CENTER);
		
        boton.setPreferredSize(new Dimension(100, 90));
		boton1.setPreferredSize(new Dimension(100, 90));
		boton2.setPreferredSize(new Dimension(100, 90));
		boton3.setPreferredSize(new Dimension(100, 90));
		boton4.setPreferredSize(new Dimension(100, 90));
		boton5.setPreferredSize(new Dimension(100, 90));
		
		panelC.add(boton);
		panelC.add(boton1);
		panelC.add(boton2);
		panelC.add(boton3);
		panelC.add(boton4);
		panelC.add(boton5);
	}
	//------------------------------------------------------------

	public void panelD() {
		//------  AQUI VA LA TABLAS
		panelD = new JPanel();
	    panelD.setLayout(new BorderLayout());
			Border vA = BorderFactory.createTitledBorder("Registro");
			panelD.setBorder(vA);
			
		 Vector<String> fila = new Vector<String>();
		 fila.addElement("2020-1596");
		 fila.addElement("Software");
		 fila.addElement("Anderson Batista");
		 fila.addElement("Santo Domingo sur");
		 fila.addElement("809-969-0000");
		 fila.addElement("20123456789");

		 
		 Vector<String> fila2 = new Vector<String>();
		 fila2.addElement("2023-1396 ");
		 fila2.addElement("Coordinador");
		 fila2.addElement("Juan Pérez ");
		 fila2.addElement("Santo Domingo Norte");
		 fila2.addElement("809-969-1424"); 
		 fila2.addElement("10123456789");

		 
		 Vector<String> fila3 = new Vector<String>();
		 fila3.addElement("2023-1396");
		 fila3.addElement("Ingeniero de Proyectos");
		 fila3.addElement("José López");
		 fila3.addElement("Santo Domingo Oeste");
		 fila3.addElement("809-969-1424");
		 fila3.addElement("30123456789");

		 Vector<String> fila4 = new Vector<String>();
		 fila4.addElement("2023-1396");
		 fila4.addElement("Asistente Administrativo");
		 fila4.addElement("Ana Fernández");
		 fila4.addElement("Distrito Nacional");
		 fila4.addElement("809-969-1424");
		 fila4.addElement("40123456789");
		 
		 @SuppressWarnings("rawtypes")
		Vector<Vector> filatotal = new Vector<Vector>();
		 filatotal.addElement(fila);
		 filatotal.addElement(fila2);
		 filatotal.addElement(fila3);
		 filatotal.addElement(fila4);
		 filatotal.addElement(fila3);
		 filatotal.addElement(fila3);

		 
		 Vector<String> colunm = new Vector<String>();
		 colunm.addElement("ID");
		 colunm.addElement("Pocicion");
		 colunm.addElement("Nombre");
		 colunm.addElement("Direccion");
		 colunm.addElement("Telefono");
		 colunm.addElement("RUC");

		 
		 JTable table = new JTable(filatotal, colunm);
		 JScrollPane sp = new JScrollPane(table);
		  panelD.add(sp, BorderLayout.CENTER);
		 

	}
	//------------------------------------------------------------

		
	
	//-------------- VENTANA DE EL FORMULARIO
	
   public void ventanametodo() {
	   Ventana= new JFrame();
	   Ventana.setVisible(true);
	   Ventana.setTitle("Formulario de Cliente");
	   Ventana.setSize(700, 600);
	   Ventana.setLayout(new BoxLayout(Ventana.getContentPane(),BoxLayout.Y_AXIS));
	   Ventana.setLocationRelativeTo(null);
	   Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
	   panelA.setBounds(0,10,50,50);
	   //-------------------------------------------------------------
	   
	   //--------- AQUI BOY AGG LOS PANALES A LA VENTANA
	   Ventana.add(panelA);
	   Ventana.add(panelB);
	   Ventana.add(panelBB);

	   Ventana.add(panelC);
	   Ventana.add(panelD);
	   
   }
   
   
	//-------------- CONSTRUCTOR PARA EJECUTAR LOS METODOS Y EL FORMULARIO
   Ventana(){
	   panelA();
	   panelB();
	   panelBB();
	   panelC();
	   panelD();

	   
	   ventanametodo();
   }

	}














