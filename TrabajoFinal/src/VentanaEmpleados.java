import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEmpleados extends JInternalFrame {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmpleados frame = new VentanaEmpleados();
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
	public VentanaEmpleados() {
		getContentPane().setEnabled(false);
		setBounds(100, 100, 939, 508);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 60, 873, 2);
		getContentPane().add(separator);
		
		JLabel Label1 = new JLabel("Lista de Empleados");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label1.setHorizontalAlignment(SwingConstants.LEFT);
		Label1.setBounds(25, 21, 221, 29);
		getContentPane().add(Label1);
		
		JLabel Label2 = new JLabel("Buscar");
		Label2.setEnabled(false);
		Label2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label2.setHorizontalAlignment(SwingConstants.LEFT);
		Label2.setBounds(665, 21, 48, 29);
		getContentPane().add(Label2);
		
		textField1 = new JTextField();
		textField1.setBounds(711, 22, 141, 28);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton Button1 = new JButton("");
		Button1.setIcon(new ImageIcon(VentanaEmpleados.class.getResource("/img/Buscar_Icon.png")));
		Button1.setBounds(862, 21, 36, 29);
		getContentPane().add(Button1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(25, 79, 873, 95);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel Label3 = new JLabel("Nombre :");
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label3.setHorizontalAlignment(SwingConstants.LEFT);
		Label3.setBounds(10, 21, 58, 13);
		panel1.add(Label3);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setBackground(SystemColor.controlHighlight);
		textField2.setForeground(Color.WHITE);
		textField2.setBounds(66, 19, 210, 19);
		panel1.add(textField2);
		textField2.setColumns(10);
		
		JLabel Label4 = new JLabel("Correo :");
		Label4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label4.setHorizontalAlignment(SwingConstants.LEFT);
		Label4.setBounds(302, 21, 58, 13);
		panel1.add(Label4);
		
		textField3 = new JTextField();
		textField3.setBackground(SystemColor.controlHighlight);
		textField3.setBounds(357, 19, 210, 19);
		panel1.add(textField3);
		textField3.setColumns(10);
		
		JLabel Label5 = new JLabel("Teléfono :");
		Label5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label5.setHorizontalAlignment(SwingConstants.LEFT);
		Label5.setBounds(590, 21, 70, 13);
		panel1.add(Label5);
		
		textField4 = new JTextField();
		textField4.setBackground(SystemColor.controlHighlight);
		textField4.setBounds(653, 19, 210, 19);
		panel1.add(textField4);
		textField4.setColumns(10);
		
		JLabel Label6 = new JLabel("Número de Registro :");
		Label6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label6.setHorizontalAlignment(SwingConstants.LEFT);
		Label6.setBounds(10, 54, 128, 24);
		panel1.add(Label6);
		
		textField5 = new JTextField();
		textField5.setBackground(SystemColor.controlHighlight);
		textField5.setBounds(137, 58, 210, 19);
		panel1.add(textField5);
		textField5.setColumns(10);
		
		JLabel Label7 = new JLabel("Fecha de Admisión :");
		Label7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label7.setHorizontalAlignment(SwingConstants.LEFT);
		Label7.setBounds(376, 61, 134, 13);
		panel1.add(Label7);
		
		textField6 = new JTextField();
		textField6.setBackground(SystemColor.controlHighlight);
		textField6.setHorizontalAlignment(SwingConstants.LEFT);
		textField6.setBounds(501, 58, 210, 19);
		panel1.add(textField6);
		textField6.setColumns(10);
		
		JButton Button2 = new JButton("Guardar Empleado");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button2.setForeground(new Color(0, 0, 0));
		Button2.setBackground(new Color(255, 175, 0));
		Button2.setBounds(108, 199, 165, 29);
		//Button2.setBackground(java.awt.Color.ORANGE);
		getContentPane().add(Button2);
		
		JButton Button3 = new JButton("Modificar Empleado");
		Button3.setBackground(new Color(255, 175, 0));
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button3.setBounds(292, 199, 165, 29);
		getContentPane().add(Button3);
		
		JButton Button4 = new JButton("Editar Empleado");
		Button4.setBackground(new Color(255, 175, 0));
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button4.setBounds(472, 199, 165, 29);
		getContentPane().add(Button4);
		
		JButton Button5 = new JButton("Añadir Empleado");
		Button5.setBackground(new Color(255, 175, 0));
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button5.setBounds(653, 199, 165, 29);
		getContentPane().add(Button5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 258, 873, 182);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Correo", "Tel\u00E9fono ", "N\u00FAmero de Registro", "Fecha de Admisi\u00F3n "
			}
		));

	}
}
