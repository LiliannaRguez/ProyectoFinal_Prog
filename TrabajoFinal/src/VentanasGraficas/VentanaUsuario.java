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

@SuppressWarnings("serial")
public class VentanaUsuario extends JDialog {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuaio frame = new VentanaUsuaio();
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
		setBounds(473, 28, 1064, 781);
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
		panel1.setBounds(25, 115, 1016, 119);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel Label3 = new JLabel("Nombre :");
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
		
		textField4 = new JTextField();
		textField4.setBackground(SystemColor.controlHighlight);
		textField4.setBounds(653, 19, 210, 19);
		panel1.add(textField4);
		textField4.setColumns(10);
		
		JLabel Label6 = new JLabel("Nivel de Acceso :");
		Label6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label6.setHorizontalAlignment(SwingConstants.LEFT);
		Label6.setBounds(10, 69, 128, 24);
		panel1.add(Label6);
		
		textField5 = new JTextField();
		textField5.setBackground(SystemColor.controlHighlight);
		textField5.setBounds(123, 73, 210, 19);
		panel1.add(textField5);
		textField5.setColumns(10);
	
		textField3 = new JTextField();
		textField3.setBackground(SystemColor.controlHighlight);
		textField3.setBounds(358, 19, 210, 19);
		panel1.add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBackground(SystemColor.controlHighlight);
		textField4.setBounds(654, 19, 209, 19);
		panel1.add(textField4);
		textField4.setColumns(10);
		
		JButton Button2 = new JButton("Guardar Usuario");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button2.setForeground(Color.WHITE);
		Button2.setBackground(new Color(255, 175, 0));
		Button2.setBounds(246, 279, 165, 29);
		getContentPane().add(Button2);
		
		JButton Button3 = new JButton("Eliminar Usuario");
		Button3.setForeground(Color.WHITE);
		Button3.setBackground(new Color(255, 175, 0));
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button3.setBounds(462, 279, 165, 29);
		getContentPane().add(Button3);
		
		JButton Button4 = new JButton("Editar Usuario");
		Button4.setForeground(Color.WHITE);
		Button4.setBackground(new Color(255, 175, 0));
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button4.setBounds(673, 279, 165, 29);
		getContentPane().add(Button4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 353, 1016, 396);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Usuario", "Clave ", "Nivel de Acceso"
			}
		));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Correo", "Tel\u00E9fono ", "N\u00FAmero de Registro", "Fecha de Admisi\u00F3n "
			}
		));

	}
}
