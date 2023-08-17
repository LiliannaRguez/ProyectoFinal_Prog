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
import conexion.mysqlConexion;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import Funcionalidad.CEmpleados;
import Funcionalidad.CUsuario;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class VentanaEmpleados extends JDialog {
	private JTextField textField1;
	private JTextField textCorreo;
	private JTextField textTele;
	private JTextField textRegi;
	private JTextField textFechaAd;
	private JTextField textName;
	private JTextField textSalar;
	private JTextField textPuesto;
	private JTextField textField_2;
	private JTable table;
	private JComboBox comboBox1;
	  private CEmpleados empleado;
	  private DefaultTableModel model;
		mysqlConexion conexionDB = new mysqlConexion();
		Connection connection = conexionDB.estableceConexion();
	

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
		
		textName = new JTextField();
		textName.setBackground(SystemColor.controlHighlight);
		textName.setColumns(10);
		textName.setBounds(67, 19, 210, 19);
		panel1.add(textName);
		
		JLabel Label4 = new JLabel("Correo :");
		Label4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label4.setHorizontalAlignment(SwingConstants.LEFT);
		Label4.setBounds(302, 21, 58, 13);
		panel1.add(Label4);
		
		textCorreo = new JTextField();
		textCorreo.setBackground(SystemColor.controlHighlight);
		textCorreo.setBounds(357, 19, 210, 19);
		panel1.add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel Label5 = new JLabel("Teléfono :");
		Label5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label5.setHorizontalAlignment(SwingConstants.LEFT);
		Label5.setBounds(590, 21, 70, 13);
		panel1.add(Label5);
		
		textTele = new JTextField();
		textTele.setBackground(SystemColor.controlHighlight);
		textTele.setBounds(653, 19, 210, 19);
		panel1.add(textTele);
		textTele.setColumns(10);
		
		JLabel Label6 = new JLabel("Número de Registro :");
		Label6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label6.setHorizontalAlignment(SwingConstants.LEFT);
		Label6.setBounds(10, 54, 128, 24);
		panel1.add(Label6);
		
		textRegi = new JTextField();
		textRegi.setBackground(SystemColor.controlHighlight);
		textRegi.setBounds(137, 58, 128, 19);
		panel1.add(textRegi);
		textRegi.setColumns(10);
		
		JLabel Label7 = new JLabel("Fecha de Admisión :");
		Label7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label7.setHorizontalAlignment(SwingConstants.LEFT);
		Label7.setBounds(302, 60, 134, 13);
		panel1.add(Label7);
		
		textFechaAd = new JTextField();
		textFechaAd.setBackground(SystemColor.controlHighlight);
		textFechaAd.setHorizontalAlignment(SwingConstants.LEFT);
		textFechaAd.setBounds(423, 58, 210, 19);
		panel1.add(textFechaAd);
		textFechaAd.setColumns(10);
		
		textSalar = new JTextField();
		textSalar.setBackground(SystemColor.controlHighlight);
		textSalar.setBounds(732, 58, 168, 19);
		panel1.add(textSalar);
		textSalar.setColumns(10);
		
		JLabel Label9 = new JLabel("Puesto :");
		Label9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label9.setHorizontalAlignment(SwingConstants.LEFT);
		Label9.setBounds(10, 102, 58, 13);
		panel1.add(Label9);
		
		textPuesto = new JTextField();
		textPuesto.setBackground(SystemColor.controlHighlight);
		textPuesto.setText("");
		textPuesto.setBounds(61, 100, 216, 19);
		panel1.add(textPuesto);
		textPuesto.setColumns(10);
		
		JLabel Label10 = new JLabel("Turno :");
		Label10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label10.setHorizontalAlignment(SwingConstants.LEFT);
		Label10.setBackground(SystemColor.desktop);
		Label10.setBounds(302, 102, 45, 13);
		panel1.add(Label10);
		
		@SuppressWarnings("rawtypes")
		 JComboBox  comboBox1= new JComboBox();
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
		
		
		/*model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        
        model.addColumn("Fecha de Admision");
        model.addColumn("Salario");
        model.addColumn("Puesto");
        model.addColumn("Turno");
        model.addColumn("Horario");

        
		scrollPane.setBounds(25, 355, 1016, 373);
		getContentPane().add(scrollPane);
		table.setModel(model);*/
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {

        			    int filaSeleccionada = table.rowAtPoint(e.getPoint());

        			    textRegi.setText(table.getValueAt(filaSeleccionada, 3).toString());
        			    textName.setText(table.getValueAt(filaSeleccionada, 0).toString());
        			    textCorreo.setText(table.getValueAt(filaSeleccionada, 1).toString());
        			    textTele.setText(table.getValueAt(filaSeleccionada, 2).toString());
        			    textFechaAd.setText(table.getValueAt(filaSeleccionada, 4).toString());
        			    textSalar.setText(table.getValueAt(filaSeleccionada, 5).toString());
        			    textPuesto.setText(table.getValueAt(filaSeleccionada, 6).toString());
        			    String valorCombo = table.getValueAt(filaSeleccionada, 7).toString();
        			    comboBox1.setSelectedItem(valorCombo);
        			    textField_2.setText(table.getValueAt(filaSeleccionada, 8).toString());
        			    
        			  
        				
        			}
        		}); 
		JScrollPane scrollPane = new JScrollPane(table);

		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Correo");
		model.addColumn("Telefono");
		model.addColumn("Fecha de Admision");
		model.addColumn("Salario");
		model.addColumn("Puesto");
		model.addColumn("Turno");
		model.addColumn("Horario");

		scrollPane.setBounds(25, 355, 1016, 373);
		getContentPane().add(scrollPane);

		cargarDatosDesdeBaseDeDatos();

		Button2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	/*int ID =Integer.parseInt(textField2.getText());
		    	String usuario = textField3.getText();
		        String clave = new String(passwordField.getPassword());
		        
		        
		        CUsuario nuevoUsuario = new CUsuario(ID, usuario, clave,table);
		        nuevoUsuario.guardar();
		       nuevoUsuario.actualizarTabla();*/
	        	
	        	int ID = Integer.parseInt(textRegi.getText());
	        	String Nombre = textName.getText();
                String Correo = textCorreo.getText();
                String telefono = textTele.getText();
                String fecha_Admision = textFechaAd.getText();
                int Salario = Integer.parseInt(textSalar.getText());
                String Puesto = textPuesto.getText();
                String Turno = comboBox1.getSelectedItem().toString();
                String Horario = textField_2.getText();

                CEmpleados nuevoEmpleado = new CEmpleados ( ID,Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario, table);
                nuevoEmpleado.guardar();
                nuevoEmpleado.actualizarTabla();
                
	            
	         
	        }
	    });
		
		Button3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	/*public void actionPerformed(ActionEvent e) {
		            int selectedRow = table.getSelectedRow();
		            if (selectedRow == -1) {
		                JOptionPane.showMessageDialog(null, "Selecciona un usuario de la tabla para eliminar.");
		                return;
		            }

		            int ID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
		            System.out.println("ID to delete: " + ID);

		            CUsuario usuarioAEliminar = new CUsuario(ID, "", "", table);
		            usuarioAEliminar.eliminar();
		            usuarioAEliminar.actualizarTabla();
		        }*/
	        	
	        	int selectedRow = table.getSelectedRow();
	            if (selectedRow == -1) {
	                JOptionPane.showMessageDialog(null, "Selecciona un Empleado de la tabla para eliminar.");
	                return;
	            }
	            
	            int ID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
	            System.out.println("ID to delete: " + ID);
	            
	            CEmpleados empleado = new CEmpleados(table);
	            empleado.setID(ID);
	            empleado.eliminar();
	            empleado.actualizarTabla();
	            cargarDatosDesdeBaseDeDatos();	            //JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
	        
                
	    
	        }
	    });
		
		Button4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	/*int ID = Integer.parseInt(textField2.getText());
		        String usuario = textField3.getText();
		        String clave = new String(passwordField.getPassword());
		       
		        CUsuario usuarioAEditar = new CUsuario(ID, usuario, clave, table);
		        usuarioAEditar.editar();
		       
		    }*/
	        	
	        	/*int selectedRow = table.getSelectedRow();
	            if (selectedRow == -1) {
	                JOptionPane.showMessageDialog(null, "Selecciona un Empleado de la tabla para editar.");
	                return;
	            }*/
	            
	            int ID = Integer.parseInt(textRegi.getText());
	            String Nombre = textName.getText();
	            String Correo = textCorreo.getText();
	            String telefono = textTele.getText();
	            String fecha_Admision = textFechaAd.getText();
	            int Salario = Integer.parseInt(textSalar.getText());
	            String Puesto = textPuesto.getText();
	            String Turno = comboBox1.getSelectedItem().toString();
	            String Horario = textField_2.getText();

	            CEmpleados empleado = new CEmpleados(ID, Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario, table);
	            empleado.editar();
	            empleado.actualizarTabla();
	            cargarDatosDesdeBaseDeDatos();	            //empleado.actualizarTabla();
	            //JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
	        
            }

	    });
		
	}
	
	
        
	private void cargarDatosDesdeBaseDeDatos() {
		/*String query = "SELECT ID, Usuario, Clave FROM Usuario";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String usuario = resultSet.getString("Usuario");
                String clave = resultSet.getString("Clave");

                model.addRow(new Object[]{ID, usuario, clave});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
		//System.out.println("Cargando datos desde la base de datos...");

	    String query = "SELECT ID, Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario FROM Empleado";

	    try (PreparedStatement preparedStatement = connection.prepareStatement(query);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	        	int ID = resultSet.getInt("ID");
	        	String Nombre = resultSet.getString("Nombre");
	            String Correo = resultSet.getString("Correo");
	            String telefono = resultSet.getString("telefono");
	            String fecha_Admision = resultSet.getString("fecha_Admision");
	            int Salario = resultSet.getInt("Salario");
	            String Puesto = resultSet.getString("Puesto");
	            String Turno = resultSet.getString("Turno");
	            String Horario = resultSet.getString("Horario");

	            //System.out.println("ID: " + ID + "Nombre: " + Nombre + ", Correo: " + Correo + ", Teléfono: " + telefono + ", Fecha Admision: " + fecha_Admision +",Salario : "+ Salario + ", Puesto : "+ Puesto + ", Turno : " + Turno + ",Horario : " + Horario);

	            model.addRow(new Object[]{ID, Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario});
	        }//table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}