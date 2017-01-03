import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField CampoTextoIzquierda;
	private JTextField CampoTextoDerecha;

	//PUNTO DE ENTRADA A LA APP
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// CONFIGURACION VENTANA
	public BailandoTexto() {
		//CONTENEDOR
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CAJA TEXTO IZQUIERDA		
		CampoTextoIzquierda = new JTextField();
		CampoTextoIzquierda.setFont(new Font("Tahoma", Font.BOLD, 11));
		CampoTextoIzquierda.setForeground(Color.BLACK);
		CampoTextoIzquierda.setBackground(Color.GRAY);
		CampoTextoIzquierda.setBounds(29, 105, 116, 34);
		contentPane.add(CampoTextoIzquierda);
		CampoTextoIzquierda.setColumns(10);
		
		//CAJA TEXTO DERECHA
		CampoTextoDerecha = new JTextField();
		CampoTextoDerecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		CampoTextoDerecha.setForeground(Color.BLACK);
		CampoTextoDerecha.setBackground(new Color(255, 0, 0));
		CampoTextoDerecha.setBounds(256, 105, 132, 34);
		contentPane.add(CampoTextoDerecha);
		CampoTextoDerecha.setColumns(10);
		
		//BOTON DE IZQUIERDA A DERECHA
		JButton botonPaLaDerecha = new JButton("--->");
		botonPaLaDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CUANDO SE APRIETA COGE EL TEXTO DE LA IZQUIERDA Y PASA A LA DERECHA
				CampoTextoDerecha.setText(CampoTextoIzquierda.getText());
				//DEJA EN BLANCO EL DE LA IZQUIERDA
				CampoTextoIzquierda.setText("");
			}
		});
		botonPaLaDerecha.setBounds(150, 44, 89, 23);
		contentPane.add(botonPaLaDerecha);
		
		//BOTON DE DERECHA A IZQUIERDA
		JButton botonPaLaIzquierda = new JButton("<---");
		botonPaLaIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CUANDO SE APRIETA COGE EL TEXTO DE LA DERECGA Y PASA A LA IZQUIERDA
				CampoTextoIzquierda.setText(CampoTextoDerecha.getText());
				//DEJA EN BLANCO EL DE LA DERECHA
				CampoTextoDerecha.setText("");
			}
		});
		botonPaLaIzquierda.setBounds(150, 167, 89, 23);
		contentPane.add(botonPaLaIzquierda);
	}
}
