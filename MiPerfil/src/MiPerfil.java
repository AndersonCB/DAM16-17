import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class MiPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField cajaParaNombre;
	private JLabel etiquetaApellidos;
	private JTextField cajaParaApellidos;
	private JLabel etiquetaEdad;
	private JTextField cajaParaEdad;
	private JLabel etiquetaEmail;
	private JTextField cajaParaEmail;

	// PUNTO DE ENTRADA A NUESTRA APP
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiPerfil() {
		//CONFIGURACION VENTANA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//CONFIGURACION CONTENEDOR		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ETIQUETA NOMBRE	
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaNombre.setBounds(10, 24, 68, 14);
		contentPane.add(etiquetaNombre);
		
		//CAJA PARA NOMBRE		
		cajaParaNombre = new JTextField();
		cajaParaNombre.setText("Anderson Estiven");
		cajaParaNombre.setBounds(10, 49, 232, 20);
		contentPane.add(cajaParaNombre);
		cajaParaNombre.setColumns(10);
		
		//ETIQUETA APELLIDOS		
		etiquetaApellidos = new JLabel("Apellidos");
		etiquetaApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaApellidos.setBounds(10, 80, 68, 14);
		contentPane.add(etiquetaApellidos);
		
		//CAJA PARA APELLIDOS	
		cajaParaApellidos = new JTextField();
		cajaParaApellidos.setText("Carvajal Benitez");
		cajaParaApellidos.setBounds(10, 106, 232, 20);
		contentPane.add(cajaParaApellidos);
		cajaParaApellidos.setColumns(10);
		
		//ETIQUETA EDAD		
		etiquetaEdad = new JLabel("Edad");
		etiquetaEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEdad.setBounds(10, 137, 46, 14);
		contentPane.add(etiquetaEdad);
		
		//CAJA PARA EDAD
		cajaParaEdad = new JTextField();
		cajaParaEdad.setText("21");
		cajaParaEdad.setBounds(10, 162, 46, 20);
		contentPane.add(cajaParaEdad);
		cajaParaEdad.setColumns(10);
		
		//ETIQUETA EMAIL
		etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEmail.setBounds(10, 193, 46, 14);
		contentPane.add(etiquetaEmail);
		
		//CAJA PARA EMAIL		
		cajaParaEmail = new JTextField();
		cajaParaEmail.setText("andyestiven95@gmail.com");
		cajaParaEmail.setBounds(10, 218, 232, 20);
		contentPane.add(cajaParaEmail);
		cajaParaEmail.setColumns(10);
		
		
		
		
		
		
		
	}
}
