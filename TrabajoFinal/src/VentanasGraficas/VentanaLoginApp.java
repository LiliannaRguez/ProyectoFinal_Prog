package VentanasGraficas;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Funcionalidad.CUsuario;



@SuppressWarnings("serial")
public class VentanaLoginApp extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textClave;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public VentanaLoginApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 694);
		contentPane = new FondoPanel("fondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(600, 140, 369, 430);
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
				
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(null);
		
		JLabel lblTitulo = new JLabel("INICIAR SECION");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(96, 77, 177, 18);
		panel_1.add(lblTitulo);
		
		JLabel lblTitulo_1 = new JLabel("MANJARES DEL CARIBE");
		lblTitulo_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo_1.setBounds(41, 29, 287, 30);
		panel_1.add(lblTitulo_1);
		
		JLabel lblNewLabel = new JLabel("Entra tus credenciales para acceder a tu cuenta ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 105, 308, 13);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(41, 10, 67, 13);
		panel_2.add(lblUsuario);
		
		textUser = new JTextField();
		textUser.setBounds(41, 28, 286, 36);
		panel_2.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClave.setBounds(41, 74, 67, 13);
		panel_2.add(lblClave);
		
		textClave = new JPasswordField();
		textClave.setBounds(41, 92, 286, 36);
		panel_2.add(textClave);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textUser.getText().equals("") || textClave.getPassword().equals("")) {
					JOptionPane.showMessageDialog(null,"Debe Ingrasar Datos en las Cajas de Texto");
					textUser.requestFocus();
				} else {
					CUsuario odjetoUsuario = new CUsuario();
					odjetoUsuario.ValidarUsuario(textUser, textClave, VentanaLoginApp.this);
				}
			}
		});
		
		btnNewButton.setBackground(new Color(254, 175, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(41, 51, 286, 41);
		panel_3.add(btnNewButton);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	
	}
	
	public class FondoPanel extends JPanel {
		private Image imagen;
		private String nombreImage;
		public FondoPanel(String nombreImage) {
			this.nombreImage = nombreImage;
		}
		@Override
		public void paint(Graphics g) {
			 imagen = new ImageIcon(getClass().getResource("/img/"+this.nombreImage)).getImage();
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
			setOpaque(false);
			super.paint(g);
		}
		
		
	}
}
