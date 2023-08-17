package VentanasGraficas;

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
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class VentanapuntoDeVentas extends JDialog {

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
					VentanapuntoDeVentas frame = new VentanapuntoDeVentas();
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
	public VentanapuntoDeVentas() {
		setUndecorated(true);
		setTitle(" ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(487, 30, 1062, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1042, 145);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MANJARES DEL CARIBE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(100, 90, 287, 22);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Todo Tipo de Delicias");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(487, 93, 200, 17);
		panel_1.add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(12, 57, 1016, 2);
		panel_1.add(separator_1);
		
		JLabel lblVentas = new JLabel("Ventas");
		lblVentas.setHorizontalAlignment(SwingConstants.LEFT);
		lblVentas.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblVentas.setBounds(25, 20, 221, 29);
		panel_1.add(lblVentas);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(12, 131, 1016, 2);
		panel_1.add(separator_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 158, 479, 521);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COD. PRODU:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 98, 141, 24);
		panel_2.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(23, 132, 141, 24);
		panel_2.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(23, 166, 141, 24);
		panel_2.add(lblCantidad);
		
		textField = new JTextField();
		textField.setBackground(new Color(217, 217, 217));
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setBounds(129, 101, 168, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(217, 217, 217));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(129, 135, 168, 21);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(217, 217, 217));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(129, 169, 168, 21);
		panel_2.add(textField_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBackground(new Color(254, 175, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(342, 102, 96, 21);
		panel_2.add(btnNewButton);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(254, 175, 0));
		btnAgregar.setForeground(new Color(255, 255, 255));
		btnAgregar.setBounds(342, 136, 96, 21);
		panel_2.add(btnAgregar);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(217, 217, 217));
		textField_3.setBounds(342, 171, 96, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblProducto = new JLabel("PLATO:");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProducto.setBounds(23, 235, 104, 24);
		panel_2.add(lblProducto);
		
		JLabel lblStock = new JLabel("STOCK:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(23, 269, 104, 24);
		panel_2.add(lblStock);
		
		JLabel lblVende = new JLabel("VENDE:");
		lblVende.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVende.setBounds(23, 303, 104, 24);
		panel_2.add(lblVende);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(217, 217, 217));
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(111, 306, 327, 21);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(217, 217, 217));
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_5.setColumns(10);
		textField_5.setBounds(111, 272, 327, 21);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(217, 217, 217));
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(111, 238, 327, 21);
		panel_2.add(textField_6);
		
		JLabel lblIngresarInformacionDe = new JLabel("Ingresar Informacion de Venta");
		lblIngresarInformacionDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresarInformacionDe.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblIngresarInformacionDe.setBounds(93, 17, 295, 29);
		panel_2.add(lblIngresarInformacionDe);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(11, 52, 459, 10);
		panel_2.add(separator);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(78, 415, 124, 31);
		panel_2.add(btnCancelar);
		btnCancelar.setBackground(new Color(254, 175, 0));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnGenerarVenta = new JButton("GENERAR VENTA");
		btnGenerarVenta.setBounds(224, 415, 165, 31);
		panel_2.add(btnGenerarVenta);
		btnGenerarVenta.setBackground(new Color(254, 175, 0));
		btnGenerarVenta.setForeground(new Color(255, 255, 255));
		btnGenerarVenta.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL A PAGAR:");
		lblNewLabel_1.setBounds(23, 350, 137, 20);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_7 = new JTextField();
		textField_7.setBounds(168, 347, 147, 27);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(483, 158, 559, 521);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(13, 12, 534, 497);
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
	}
}
