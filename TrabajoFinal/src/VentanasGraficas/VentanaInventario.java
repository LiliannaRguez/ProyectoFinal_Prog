package VentanasGraficas;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import conexion.mysqlConexion;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VentanaInventario extends JDialog {
	private JTextField textField;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario window = new Inventario();
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
					Inventario frame = new Inventario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}/*

	/**
	 * Create the application.
	 */
    mysqlConexion cc = new mysqlConexion();
    Connection con = cc.estableceConexion();
    
	public VentanaInventario() {
		initialize();
		setVisible(true);
		
		 mostrarDatos();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setEnabled(false);
		setBounds(473, 28, 1064, 781);
		//setBounds(1000, 100, 1067, 781);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Almacen");
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
		
		textField = new JTextField();
		textField.setBounds(839, 39, 141, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscador = new JButton("");
		btnBuscador.setIcon(new ImageIcon(VentanaInventario.class.getResource("/img/pngwing.com.png")));
		btnBuscador.setBackground(new Color(255, 175, 0));
		btnBuscador.setBounds(990, 38, 36, 29);
		getContentPane().add(btnBuscador);
		
		table = new JTable();
		table.setBounds(25, 157, 1016, 637);
		getContentPane().add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Producto_id");
		lblNewLabel_2.setBounds(73, 114, 86, 35);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Medida_id");
		lblNewLabel_3.setBounds(227, 108, 130, 47);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setBounds(378, 108, 92, 47);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Precio");
		lblNewLabel_4_1.setBounds(541, 108, 92, 47);
		getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Inventario_id");
		lblNewLabel_4_2.setBounds(892, 108, 92, 47);
		getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Plato_id");
		lblNewLabel_4_1_1.setBounds(708, 108, 92, 47);
		getContentPane().add(lblNewLabel_4_1_1);
		
		
		
	}
	
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

          table.setModel(modelo);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
        }
    }
}
