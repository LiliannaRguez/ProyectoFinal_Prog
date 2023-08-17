package VentanasGraficas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;
import Funcionalidad.CUsuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class VentanaUsuario extends JDialog {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTable table;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuario frame = new VentanaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VentanaUsuario() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(SystemColor.menu);
		getContentPane().setEnabled(false);
		setBounds(487, 30, 1062, 775);
		//setBounds(1000, 100, 1067, 781);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel Label1 = new JLabel("Lista de Usuarios");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label1.setHorizontalAlignment(SwingConstants.LEFT);
		Label1.setBounds(37, 38, 221, 29);
		getContentPane().add(Label1);
		
		JLabel Label2 = new JLabel("Buscar");
		Label2.setEnabled(false);
		Label2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label2.setHorizontalAlignment(SwingConstants.LEFT);
		Label2.setBounds(790, 38, 48, 29);
		getContentPane().add(Label2);
		
		textField1 = new JTextField();
		textField1.setBounds(839, 39, 141, 28);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton Button1 = new JButton("");
		Button1.setIcon(new ImageIcon(VentanaEmpleados.class.getResource("/img/pngwing.com.png")));
		Button1.setBackground(new Color(255, 175, 0));
		Button1.setBounds(990, 38, 36, 29);
		getContentPane().add(Button1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(240, 222, 173));
		panel1.setBounds(25, 136, 1016, 60);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel Label3 = new JLabel("ID :");
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label3.setHorizontalAlignment(SwingConstants.LEFT);
		Label3.setBounds(10, 21, 58, 13);
		panel1.add(Label3);
		
		textField2 = new JTextField();
		textField2.setBackground(SystemColor.controlHighlight);
		textField2.setColumns(10);
		textField2.setBounds(70, 19, 210, 19);
		panel1.add(textField2);
		
		JLabel Label4 = new JLabel("Usuario :");
		Label4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label4.setHorizontalAlignment(SwingConstants.LEFT);
		Label4.setBounds(302, 21, 58, 13);
		panel1.add(Label4);
		
		textField3 = new JTextField();
		textField3.setBackground(SystemColor.controlHighlight);
		textField3.setBounds(358, 19, 210, 19);
		panel1.add(textField3);
		textField3.setColumns(10);
		
		JLabel Label5 = new JLabel("Clave :");
		Label5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label5.setHorizontalAlignment(SwingConstants.LEFT);
		Label5.setBounds(603, 21, 70, 13);
		panel1.add(Label5);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.controlHighlight);
		passwordField.setBounds(648, 19, 178, 19);
		panel1.add(passwordField);
		
		JButton Button2 = new JButton("Guardar Usuario");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button2.setForeground(Color.WHITE);
		Button2.setBackground(new Color(255, 175, 0));
		Button2.setBounds(252, 242, 165, 29);
		getContentPane().add(Button2);
		
		JButton Button3 = new JButton("Eliminar Usuario");
		Button3.setForeground(Color.WHITE);
		Button3.setBackground(new Color(255, 175, 0));
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button3.setBounds(449, 242, 165, 29);
		getContentPane().add(Button3);
		
		JButton Button4 = new JButton("Editar Usuario");
		Button4.setForeground(Color.WHITE);
		Button4.setBackground(new Color(255, 175, 0));
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button4.setBounds(648, 242, 165, 29);
		getContentPane().add(Button4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 317, 1016, 437);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Usuario", "Clave "
			}
		));
		
		Button2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		    	int ID =Integer.parseInt(textField2.getText());
		    	String usuario = textField3.getText();
		        String clave = new String(passwordField.getPassword());
		        
		        
		        CUsuario nuevoUsuario = new CUsuario(ID, usuario, clave,table);
		        nuevoUsuario.guardar();
		       nuevoUsuario.actualizarTabla();
		        
		    }
		});
		
		Button3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        int ID = Integer.parseInt(textField2.getText());
		        
		        CUsuario usuarioAEliminar = new CUsuario(table);
		        usuarioAEliminar.setID(ID);
		        usuarioAEliminar.eliminar();
		        usuarioAEliminar.actualizarTabla();
		    }
		});

		Button4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        int ID = Integer.parseInt(textField2.getText());
		        String usuario = textField3.getText();
		        String clave = new String(passwordField.getPassword());
		       
		        
		        CUsuario usuarioAEditar = new CUsuario(ID, usuario, clave, table);
		        usuarioAEditar.editar();
		        usuarioAEditar.actualizarTabla();
		    }
		});

	}
}
