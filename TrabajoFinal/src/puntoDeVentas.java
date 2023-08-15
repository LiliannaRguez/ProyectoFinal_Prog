
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

@SuppressWarnings("serial")
public class puntoDeVentas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puntoDeVentas frame = new puntoDeVentas();
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
	public puntoDeVentas() {
		setUndecorated(true);
		setTitle(" ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(473, 28, 1064, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 986, 172);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(puntoDeVentas.class.getResource("/img/LogoPrincipal.png")));
		lblLogo.setBounds(140, 0, 167, 170);
		panel_1.add(lblLogo);
		
		JLabel lblNewLabel_2 = new JLabel("MANJARES DEL CARIBE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(429, 30, 287, 50);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Todo Tipo de Delicias");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(472, 78, 200, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("TEL:: 829-745-8951");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(505, 110, 135, 22);
		panel_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 176, 986, 124);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COD. PRODU:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 10, 141, 24);
		panel_2.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(33, 44, 141, 24);
		panel_2.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(33, 78, 141, 24);
		panel_2.add(lblCantidad);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setBounds(139, 13, 168, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(139, 47, 168, 21);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(139, 81, 168, 21);
		panel_2.add(textField_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(352, 14, 96, 21);
		panel_2.add(btnNewButton);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(352, 48, 96, 21);
		panel_2.add(btnAgregar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(352, 83, 96, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblProducto = new JLabel("PLATO:");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProducto.setBounds(498, 10, 104, 24);
		panel_2.add(lblProducto);
		
		JLabel lblStock = new JLabel("STOCK:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(498, 44, 104, 24);
		panel_2.add(lblStock);
		
		JLabel lblVende = new JLabel("VENDE:");
		lblVende.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVende.setBounds(498, 78, 104, 24);
		panel_2.add(lblVende);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(586, 81, 356, 21);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_5.setColumns(10);
		textField_5.setBounds(586, 47, 356, 21);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(586, 13, 356, 21);
		panel_2.add(textField_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 308, 986, 280);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 7, 913, 265);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NRO", "COD", "PRODUCTO", "CAN", "PRE UNI", "TOTAL"
			}
		));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 598, 986, 76);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(221, 22, 109, 31);
		panel_4.add(btnCancelar);
		
		JButton btnGenerarVenta = new JButton("GENERAR VENTA");
		btnGenerarVenta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGenerarVenta.setBounds(352, 22, 165, 31);
		panel_4.add(btnGenerarVenta);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL A PAGAR:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(569, 28, 137, 20);
		panel_4.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(701, 24, 147, 27);
		panel_4.add(textField_7);
	}
}
