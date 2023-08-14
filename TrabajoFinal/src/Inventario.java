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
public class Inventario extends JDialog {
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
	
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public Inventario() {
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
		btnBuscador.setIcon(new ImageIcon(Inventario.class.getResource("/img/pngwing.com.png")));
		btnBuscador.setBackground(new Color(255, 175, 0));
		btnBuscador.setBounds(990, 38, 36, 29);
		getContentPane().add(btnBuscador);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 85, 1016, 664);
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
