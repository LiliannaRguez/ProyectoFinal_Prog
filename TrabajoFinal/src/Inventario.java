import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class Inventario extends JInternalFrame {

	private JFrame frame;
	private JPanel panelA;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public Inventario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setBounds(100, 100, 909, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelA = new JPanel();
		panelA.setBackground(new Color(229, 229, 229));
		panelA.setBounds(10, 11, 873, 559);
		frame.getContentPane().add(panelA);
		panelA.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 41, 853, 3);
		panelA.add(separator);
		
		JLabel lblNewLabel = new JLabel("Lista de Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 155, 19);
		panelA.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		lblNewLabel_1.setBounds(597, 15, 56, 14);
		panelA.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(645, 10, 155, 20);
		panelA.add(textField);
		textField.setColumns(10);
		
		JPanel panelB = new JPanel();
		panelB.setBounds(10, 55, 853, 98);
		panelA.add(panelB);
		panelB.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(10, 22, 52, 14);
		panelB.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID:");
		lblNewLabel_2_1.setBounds(10, 64, 46, 14);
		panelB.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(66, 19, 221, 20);
		panelB.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(31, 61, 120, 20);
		panelB.add(textField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Precio:");
		lblNewLabel_2_2.setBounds(333, 22, 46, 14);
		panelB.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Comentario:");
		lblNewLabel_2_2_1.setBounds(173, 64, 69, 14);
		panelB.add(lblNewLabel_2_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(389, 19, 161, 20);
		panelB.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(252, 61, 510, 20);
		panelB.add(textField_4);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Stock:");
		lblNewLabel_2_2_2.setBounds(595, 22, 46, 14);
		panelB.add(lblNewLabel_2_2_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(651, 19, 170, 20);
		panelB.add(textField_5);
		
		JPanel panelC = new JPanel();
		panelC.setBackground(new Color(240, 240, 240));
		panelC.setBounds(10, 164, 853, 73);
		panelA.add(panelC);
		panelC.setLayout(null);
		
		JButton btnGuardarButton = new JButton("Guardar Producto");
		btnGuardarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField_1.getText();
		        String id = textField_2.getText();
		        String precio = textField_3.getText();
		        String comentario = textField_4.getText();
		        String stock = textField_5.getText();
			}
		});
		
		btnGuardarButton.setForeground(new Color(255, 255, 255));
		btnGuardarButton.setBounds(37, 11, 147, 44);
		btnGuardarButton.setBackground(new Color(252, 173, 8));
		panelC.add(btnGuardarButton);
		
		JButton btnModificarProducto = new JButton("Modificar Producto");
		btnModificarProducto.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = textField_1.getText();
		        String id = textField_2.getText();
		        String precio = textField_3.getText();
		        String comentario = textField_4.getText();
		        String stock = textField_5.getText();
		    }
		});
		
		btnModificarProducto.setForeground(Color.WHITE);
		btnModificarProducto.setBounds(254, 11, 147, 44);
		btnModificarProducto.setBackground(new Color(252, 173, 8));
		panelC.add(btnModificarProducto);
		
		JButton btnEditarProducto = new JButton("Editar Producto");
		btnEditarProducto.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtener los valores de los campos de texto
		        String nombre = textField_1.getText();
		        String id = textField_2.getText();
		        String precio = textField_3.getText();
		        String comentario = textField_4.getText();
		        String stock = textField_5.getText();
		    }
		});
		
		btnEditarProducto.setForeground(Color.WHITE);
		btnEditarProducto.setBounds(466, 11, 147, 44);
		btnEditarProducto.setBackground(new Color(252, 173, 8));
		panelC.add(btnEditarProducto);
		
		JButton btnAadirProducto = new JButton("Añadir Producto");
		btnAadirProducto.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtener los valores de los campos de texto
		        String nombre = textField_1.getText();
		        String id = textField_2.getText();
		        String precio = textField_3.getText();
		        String comentario = textField_4.getText();
		        String stock = textField_5.getText();
		    }
		});
		
		btnAadirProducto.setForeground(Color.WHITE);
		btnAadirProducto.setBounds(676, 11, 147, 44);
		btnAadirProducto.setBackground(new Color(252, 173, 8));
		panelC.add(btnAadirProducto);
		
		JButton btnBuscador = new JButton("");
		btnBuscador.setSelectedIcon(new ImageIcon(Inventario.class.getResource("/img/pngwing.com.png")));
		btnBuscador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscador.setBackground(new Color(252, 173, 8));
		btnBuscador.setIcon(new ImageIcon(Inventario.class.getResource("/img/pngwing.com.png")));
		btnBuscador.setBounds(810, 5, 38, 33);
		panelA.add(btnBuscador);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 248, 853, 300);
		panelA.add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Precio", "Stock", "ID", "Comentario"
			}
		));
	}
}
