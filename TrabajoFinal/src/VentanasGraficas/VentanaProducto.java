package VentanasGraficas;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import conexion.mysqlConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class VentanaProducto extends JDialog {
    private JTextField textField_Buscador;
    private JTable table_1;
    private JTextField textField_Nombre;
    private JTextField textField_Precio;
    private JTextField textField_Plato;
    private JTextField textField_Medida;
    private JTextField textField_INV_ID;
    private JTextField productosid;

    mysqlConexion cc = new mysqlConexion();
    Connection con = cc.estableceConexion();

    public VentanaProducto() {
        initialize();
        setVisible(true);
        
        mostrarDatos();
    }
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto window = new Producto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    table_1 = new JTable(); 
	    table_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(java.awt.event.MouseEvent evt) {
	    		
	    	    int filaSeleccionada = table_1.rowAtPoint(evt.getPoint());
	    	    
	    	    
	    	    productosid.setText(table_1.getValueAt(filaSeleccionada, 0).toString());
	    	    textField_Medida.setText(table_1.getValueAt(filaSeleccionada, 1).toString());
	    	    textField_Nombre.setText(table_1.getValueAt(filaSeleccionada, 2).toString());
	    	    textField_Precio.setText(table_1.getValueAt(filaSeleccionada, 3).toString());
	    	    textField_Plato.setText(table_1.getValueAt(filaSeleccionada, 4).toString());
	    	    textField_INV_ID.setText(table_1.getValueAt(filaSeleccionada, 5).toString());
	    		
	    	}
	    });
	    table_1.setBounds(25, 353, 1016, 417);
	    getContentPane().add(table_1);

		mostrarDatos();
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setEnabled(false);
		setBounds(487, 30, 1062, 775);
		//setBounds(1000, 100, 1067, 781);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Lista de Productos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(37, 38, 221, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(790, 38, 48, 29);
		getContentPane().add(lblNewLabel_1);
		
		textField_Buscador = new JTextField();
		textField_Buscador.setBounds(839, 39, 141, 28);
		getContentPane().add(textField_Buscador);
		textField_Buscador.setColumns(10);
		
		JButton btnBuscador = new JButton("");
		btnBuscador.setIcon(new ImageIcon(VentanaProducto.class.getResource("/img/pngwing.com.png")));
		btnBuscador.setBackground(new Color(255, 175, 0));
		btnBuscador.setBounds(990, 38, 36, 29);
		getContentPane().add(btnBuscador);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 222, 173));
		panel.setBounds(25, 115, 1016, 136);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 21, 61, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(355, 21, 45, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Medida:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(726, 21, 61, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Plato:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 79, 50, 13);
		panel.add(lblNewLabel_6);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBackground(new Color(217, 217, 217));
		textField_Nombre.setBounds(67, 19, 227, 19);
		textField_Nombre.setColumns(10);
		panel.add(textField_Nombre);
		
		textField_Precio = new JTextField();
		textField_Precio.setBackground(SystemColor.controlHighlight);
		textField_Precio.setBounds(410, 19, 268, 19);
		panel.add(textField_Precio);
		textField_Precio.setColumns(10);
		
		textField_Plato = new JTextField();
		textField_Plato.setBackground(SystemColor.controlHighlight);
		textField_Plato.setBounds(67, 76, 227, 19);
		panel.add(textField_Plato);
		textField_Plato.setColumns(10);
		
		textField_Medida = new JTextField();
		textField_Medida.setBackground(SystemColor.controlHighlight);
		textField_Medida.setBounds(796, 19, 193, 19);
		panel.add(textField_Medida);
		textField_Medida.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Guardar Producto");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 175, 0));
		btnNewButton_1.setBounds(234, 262, 165, 29);
		getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	insertarDatos();
            	mostrarDatos();
				limpiarCampos();
            }
        });
		
		
		
		
		
		JLabel lblNewLabel_4_1 = new JLabel("INV_ID:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(726, 79, 61, 13);
		panel.add(lblNewLabel_4_1);
		
		textField_INV_ID = new JTextField();
		textField_INV_ID.setColumns(10);
		textField_INV_ID.setBackground(SystemColor.controlHighlight);
		textField_INV_ID.setBounds(796, 76, 193, 19);
		panel.add(textField_INV_ID);
		
		productosid = new JTextField();
		productosid.setColumns(10);
		productosid.setBackground(SystemColor.controlHighlight);
		productosid.setBounds(485, 76, 193, 19);
		panel.add(productosid);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Producto iD");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_1.setBounds(368, 79, 87, 13);
		panel.add(lblNewLabel_4_1_1);
		
		
		JButton btnNewButton_2 = new JButton("Eliminar Producto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarRegistros();
				mostrarDatos();
				limpiarCampos();
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(255, 175, 0));
		btnNewButton_2.setBounds(449, 261, 165, 29);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Editar Producto");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ActualizarDatos();
				mostrarDatos();
				limpiarCampos();
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(255, 175, 0));
		btnNewButton_3.setBounds(673, 261, 165, 29);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Producto_id");
		lblNewLabel_2_1.setBounds(37, 301, 86, 35);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Medida_id");
		lblNewLabel_3_1.setBounds(186, 295, 130, 47);
		getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Nombre");
		lblNewLabel_4_2.setBounds(362, 295, 92, 47);
		getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Precio");
		lblNewLabel_4_1_2.setBounds(543, 295, 92, 47);
		getContentPane().add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Plato_id");
		lblNewLabel_4_1_1_1.setBounds(726, 295, 92, 47);
		getContentPane().add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Inventario_id");
		lblNewLabel_4_2_1.setBounds(900, 295, 92, 47);
		getContentPane().add(lblNewLabel_4_2_1);
		
	}
	

	
	
	
	
	
	
	   public void insertarDatos(){

	
	        
	        
	      if(!textField_Nombre.getText().isEmpty()&&!textField_Precio.getText().isEmpty()&&!textField_Plato.getText().isEmpty()&&!textField_Medida.getText().isEmpty()&&!textField_INV_ID.getText().isEmpty()){
	           
	           

           
	           
	               try{
	  
	            	  
	        
	        String SQL="insert into Productoss (Producto_id,Medida_id,Nombre,Precio,Plato_id,Inventario_id) values (?,?,?,?,?,?)";
	        
	        PreparedStatement pst=(PreparedStatement)con.prepareStatement(SQL);
	    
	        pst.setString(1, productosid.getText());
            pst.setString(2,textField_Medida.getText());
	        pst.setString(3,textField_Nombre.getText());
	        pst.setString(4,textField_Precio.getText());
	        pst.setString(5,textField_Plato.getText());
	        pst.setString(6,textField_INV_ID.getText());
	        
	        pst.execute();
	        
	        
	        JOptionPane.showMessageDialog(null, "Registro Exitoso");
	        
	    }catch (Exception e){
	          JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
	    
	    
	    }

	           

	    }else{
	           
	           JOptionPane.showMessageDialog(this, "Uno de los campos esta vacio");
	       }}
    
	
	
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    public void mostrarDatos() {
	    	
	        String[] titulos = {"Producto_id", "Medida_id", "Nombre", "Precio", "Plato_id", "Inventario_id"};
	        String[] registros = new String[6];

	        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

	        String SQL = "SELECT * FROM Productoss"; // Cambiar a "Productoss" si ese es el nombre correcto de la tabla

	        try {
	            Statement st = (Statement) con.createStatement();
	            ResultSet rs = st.executeQuery(SQL);

	            while (rs.next()) {
	                registros[0] = rs.getString("Producto_id");
	                registros[1] = rs.getString("Medida_id");
	                registros[2] = rs.getString("Nombre");
	                registros[3] = rs.getString("Precio");
	                registros[4] = rs.getString("Plato_id");
	                registros[5] = rs.getString("Inventario_id");

	                modelo.addRow(registros);
	                
	            }

	            table_1.setModel(modelo);
	            

	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
	        }
	    }

	
	
	
	
	
	
	
	
	
	    public void eliminarRegistros() {
	        int filaSeleccionada = table_1.getSelectedRow();

	        try {
	            String SQL = "DELETE FROM Productoss WHERE Producto_id = ?";
	            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

	            // Obtenemos el valor de Producto_id seleccionado
	            String productoId = (String) table_1.getValueAt(filaSeleccionada, 0);

	            // Establecemos el valor en el parámetro de la consulta
	            pst.setString(1, productoId);

	            int n = pst.executeUpdate();

	            if (n > 0) {
	                JOptionPane.showMessageDialog(null, "Registro eliminado");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error al eliminar el registro" + e.getMessage());
	        }
	    }

	    
	
	
	    
	    
	    public void ActualizarDatos() {
	        try {
	            String SQL = "UPDATE Productoss SET Medida_id=?, Nombre=?, Precio=?, Plato_id=?, Inventario_id=? WHERE Producto_id=?";

	            int filaSeleccionado = table_1.getSelectedRow();
	            String dao = (String) table_1.getValueAt(filaSeleccionado, 0);

	            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
	            pst.setString(1, textField_Medida.getText());
	            pst.setString(2, textField_Nombre.getText());
	            pst.setString(3, textField_Precio.getText());
	            pst.setString(4, textField_Plato.getText());
	            pst.setString(5, textField_INV_ID.getText());

	            // Importante: El índice del parámetro del Producto_id es 6
	            pst.setString(6, dao);

	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro Actualizado");
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error al actualizar el registro" + e.getMessage());
	        }
	    }


	    
	    
	    
	    
	    
	    
	    
	    
	
	private void limpiarCampos() {
		productosid.setText("");
		textField_Precio.setText("");
        textField_Plato.setText("");
        textField_Nombre.setText("");
        textField_Medida.setText("");
        textField_INV_ID.setText("");
	}
	
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                VentanaProducto dialog = new VentanaProducto();
                dialog.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
