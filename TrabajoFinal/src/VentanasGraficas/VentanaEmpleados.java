package VentanasGraficas;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;
import Funcionalidad.CrudMetodos;
import conexion.mysqlConexion;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import Funcionalidad.CEmpleados;
import Funcionalidad.CUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class VentanaEmpleados extends JDialog {
	private JTextField textField1;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField;
	private JTextField textField7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JComboBox comboBox1;
	

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
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setEnabled(false);
		setBounds(487, 30, 1062, 775);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel Label1 = new JLabel("Lista de Empleados");
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
		panel1.setBounds(25, 115, 1016, 136);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel Label3 = new JLabel("Nombre :");
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label3.setHorizontalAlignment(SwingConstants.LEFT);
		Label3.setBounds(10, 21, 58, 13);
		panel1.add(Label3);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setColumns(10);
		textField.setBounds(67, 19, 210, 19);
		panel1.add(textField);
		
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
		textField5.setBounds(137, 58, 128, 19);
		panel1.add(textField5);
		textField5.setColumns(10);
		
		JLabel Label7 = new JLabel("Fecha de Admisión :");
		Label7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label7.setHorizontalAlignment(SwingConstants.LEFT);
		Label7.setBounds(302, 60, 134, 13);
		panel1.add(Label7);
		
		textField6 = new JTextField();
		textField6.setBackground(SystemColor.controlHighlight);
		textField6.setHorizontalAlignment(SwingConstants.LEFT);
		textField6.setBounds(423, 58, 210, 19);
		panel1.add(textField6);
		textField6.setColumns(10);
		
		textField7 = new JTextField();
		textField7.setBackground(SystemColor.controlHighlight);
		textField7.setBounds(732, 58, 168, 19);
		panel1.add(textField7);
		textField7.setColumns(10);
		
		JLabel Label9 = new JLabel("Puesto :");
		Label9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label9.setHorizontalAlignment(SwingConstants.LEFT);
		Label9.setBounds(10, 102, 58, 13);
		panel1.add(Label9);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setText("");
		textField_1.setBounds(61, 100, 216, 19);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Label10 = new JLabel("Turno :");
		Label10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label10.setHorizontalAlignment(SwingConstants.LEFT);
		Label10.setBackground(SystemColor.desktop);
		Label10.setBounds(302, 102, 45, 13);
		panel1.add(Label10);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBackground(SystemColor.controlHighlight);
		comboBox1.setBounds(347, 99, 166, 21);
		panel1.add(comboBox1);
		
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		comboBoxModel.addElement("Matutino");
		comboBoxModel.addElement("Vespertino");
		comboBoxModel.addElement("Nocturno");
		
		comboBox1.setModel(comboBoxModel);
		
		JLabel Label11 = new JLabel("Horario :");
		Label11.setHorizontalAlignment(SwingConstants.LEFT);
		Label11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label11.setBounds(534, 102, 64, 13);
		panel1.add(Label11);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(590, 100, 210, 19);
		panel1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Label12 = new JLabel("Salario :");
		Label12.setHorizontalAlignment(SwingConstants.LEFT);
		Label12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label12.setBounds(677, 61, 58, 13);
		panel1.add(Label12);
		  
		JButton Button2 = new JButton("Guardar Empleado");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button2.setForeground(Color.WHITE);
		Button2.setBackground(new Color(255, 175, 0));
		Button2.setBounds(235, 290, 165, 29);
		getContentPane().add(Button2);
		
		JButton Button3 = new JButton("Eliminar Empleado");
		Button3.setForeground(Color.WHITE);
		Button3.setBackground(new Color(254, 175, 0));
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button3.setBounds(464, 290, 165, 29);
		getContentPane().add(Button3);
		
		JButton Button4 = new JButton("Editar Empleado");
		Button4.setForeground(new Color(255, 255, 255));
		Button4.setBackground(new Color(255, 175, 0));
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button4.setBounds(683, 290, 165, 29);
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
					"Nombre", "Correo", "Teléfono", "Número de Registro", "Fecha de Admisión", "Salario", "Puesto", "Turno", "Horario"
			}
		));
		
		Button2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	String Nombre = textField.getText();
		        String Correo = textField3.getText();
		        String telefono = textField4.getText();
		        int ID = Integer.parseInt(textField5.getText());
		        String fecha_Admision = textField6.getText();
		        int Salario = Integer.parseInt(textField7.getText());
		        String Puesto = textField_1.getText();
		        String Turno = comboBox1.getSelectedItem().toString();
		        String Horario = textField_2.getText();
		        
		        
	            CEmpleados empleado = new CEmpleados(Nombre, Correo, telefono,ID, fecha_Admision, Salario, Puesto, Turno, Horario, table);
	            empleado.guardar();
	            empleado.actualizarTabla();

	            //empleado.cargarDatosDesdeBaseDeDatos(); 
	            
	         
	        }
	    });
		
		Button3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	int ID = Integer.parseInt(textField5.getText());
	        	CEmpleados empleadoAEliminar = new CEmpleados( table);
	        	empleadoAEliminar.setID(ID);
	        	empleadoAEliminar.eliminar();
	        	empleadoAEliminar.actualizarTabla();
	    
	        }
	    });
		
		Button4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	int ID = Integer.parseInt(textField5.getText());
	        	
	        	String Nombre = textField.getText();
		        String Correo = textField3.getText();
		        String telefono = textField4.getText();
		        String fecha_Admision = textField6.getText();
		        int Salario = Integer.parseInt(textField7.getText());
		        String Puesto = textField_1.getText();
		        String Turno = comboBox1.getSelectedItem().toString();
		        String Horario = textField_2.getText();
	        	
	            CEmpleados empleadoAEditar = new CEmpleados (Nombre, Correo, telefono,ID, fecha_Admision, Salario, Puesto, Turno, Horario, table);
	            empleadoAEditar.editar();
	            empleadoAEditar.actualizarTabla();
	            
	        }
	    });
		
	}
}