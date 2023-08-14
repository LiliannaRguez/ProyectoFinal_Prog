import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Producto extends JDialog {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	

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
	
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public Producto() {
		initialize();
		setVisible(true);
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
		
		textField = new JTextField();
		textField.setBounds(839, 39, 141, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscador = new JButton("");
		btnBuscador.setIcon(new ImageIcon(Producto.class.getResource("/img/pngwing.com.png")));
		btnBuscador.setBackground(new Color(255, 175, 0));
		btnBuscador.setBounds(990, 38, 36, 29);
		getContentPane().add(btnBuscador);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
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
		
		JLabel lblNewLabel_4 = new JLabel("Stock:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(735, 21, 45, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 79, 45, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Comentario:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(355, 79, 99, 13);
		panel.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(67, 19, 227, 19);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(65, 77, 163, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setBounds(410, 19, 268, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.controlHighlight);
		textField_4.setBounds(461, 77, 410, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.controlHighlight);
		textField_5.setBounds(796, 19, 193, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Guardar Producto");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 175, 0));
		btnNewButton_1.setBounds(105, 290, 165, 29);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificar Producto");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(255, 175, 0));
		btnNewButton_2.setBounds(324, 290, 165, 29);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Editar Producto");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(255, 175, 0));
		btnNewButton_3.setBounds(542, 290, 165, 29);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Añadir Producto");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(255, 175, 0));
		btnNewButton_4.setBounds(754, 290, 165, 29);
		getContentPane().add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 353, 1016, 396);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Precio", "Stock", "ID", "Comentario"
			}
		));
		scrollPane.setViewportView(table);
	}
}
