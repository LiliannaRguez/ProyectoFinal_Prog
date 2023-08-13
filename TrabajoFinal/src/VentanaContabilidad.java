
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaContabilidad extends JDialog {

	private JTextField textField;
	private JTextField textField1;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaContabilidad dialog = new VentanaContabilidad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaContabilidad() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setEnabled(false);
		setBounds(473, 28, 1082, 781);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel Label1 = new JLabel("Contabilidad");
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
		Button1.setIcon(new ImageIcon(VentanaEmpleados.class.getResource("/img/Buscar_Icon.png")));
		Button1.setBounds(990, 38, 36, 29);
		getContentPane().add(Button1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.window);
		panel1.setBounds(25, 110, 1016, 104);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(36, 30, 233, 49);
		panel1.add(panel2);
		panel2.setLayout(null);
		
		JButton Button2 = new JButton("Ingresos");
		Button2.setForeground(Color.WHITE);
		Button2.setBackground(new Color(255, 175, 0));
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button2.setBounds(0, 0, 233, 49);
		panel2.add(Button2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(SystemColor.controlShadow);
		panel3.setBounds(279, 30, 233, 49);
		panel1.add(panel3);
		panel3.setLayout(null);
		
		JButton Button3 = new JButton("Cuentas Por Pagar");
		Button3.setBounds(0, 0, 234, 49);
		panel3.add(Button3);
		Button3.setForeground(Color.WHITE);
		Button3.setBackground(new Color(255, 175, 0));
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(522, 30, 233, 49);
		panel1.add(panel6);
		panel6.setLayout(null);
		
		JButton Button10 = new JButton("Cuadre de Caja");
		Button10.setForeground(Color.WHITE);
		Button10.setBackground(new Color(255, 175, 0));
		Button10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button10.setBounds(0, 0, 233, 49);
		panel6.add(Button10);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.WHITE);
		panelPrincipal.setBounds(10, 214, 1048, 530);
		//panelPrincipal.add(panelContenedor1);
		//panelPrincipal.add(panelContenedor2);
		getContentPane().add(panelPrincipal);
		
		JPanel panelContenedor1 = new JPanel();
		panelContenedor1.setBackground(SystemColor.window);
		panelContenedor1.setBounds(25, 214, 1015, 530);
		getContentPane().add(panelContenedor1);
		panelContenedor1.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(220, 220, 220));
		panel4.setBounds(10, 0, 995, 54);
		panelContenedor1.add(panel4);
		panel4.setLayout(null);
		
		JLabel Label3 = new JLabel("Procedencia :");
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label3.setHorizontalAlignment(SwingConstants.LEFT);
		Label3.setBounds(10, 21, 84, 13);
		panel4.add(Label3);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setColumns(10);
		textField.setBounds(92, 19, 210, 19);
		panel4.add(textField);
		
		JLabel Label4 = new JLabel("Monto :");
		Label4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label4.setHorizontalAlignment(SwingConstants.LEFT);
		Label4.setBounds(312, 21, 58, 13);
		panel4.add(Label4);
		
		textField3 = new JTextField();
		textField3.setBackground(SystemColor.controlHighlight);
		textField3.setBounds(362, 19, 210, 19);
		panel4.add(textField3);
		textField3.setColumns(10);
		
		JLabel Label5 = new JLabel("Fecha :");
		Label5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label5.setHorizontalAlignment(SwingConstants.LEFT);
		Label5.setBounds(591, 21, 70, 13);
		panel4.add(Label5);
		
		textField4 = new JTextField();
		textField4.setBackground(SystemColor.controlHighlight);
		textField4.setBounds(641, 19, 210, 19);
		panel4.add(textField4);
		textField4.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 124, 995, 347);
		panelContenedor1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Procedencia", "Monto", "Fecha"
			}
		));
		
		JButton Button5 = new JButton("Eliminar Ingreso");
		Button5.setBounds(415, 71, 165, 29);
		panelContenedor1.add(Button5);
		Button5.setForeground(Color.WHITE);
		Button5.setBackground(new Color(255, 175, 0));
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton Button4 = new JButton("Guardar Ingreso");
		Button4.setBounds(195, 71, 165, 29);
		panelContenedor1.add(Button4);
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button4.setForeground(Color.WHITE);
		Button4.setBackground(new Color(255, 175, 0));
		
		JButton Button6 = new JButton("Editar Ingreso");
		Button6.setBounds(641, 71, 165, 29);
		panelContenedor1.add(Button6);
		Button6.setForeground(Color.WHITE);
		Button6.setBackground(new Color(255, 175, 0));
		Button6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panelContenedor2 = new JPanel();
		panelContenedor2.setBackground(Color.WHITE);
		panelContenedor2.setBounds(22, 214, 1019, 530);
		getContentPane().add(panelContenedor2);
		panelContenedor2.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(220, 220, 220));
		panel5.setBounds(10, 0, 995, 61);
		panelContenedor2.add(panel5);
		panel5.setLayout(null);
		
		JLabel Label6 = new JLabel("Destino :");
		Label6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label6.setBounds(10, 24, 89, 13);
		panel5.add(Label6);
		
		textField5 = new JTextField();
		textField5.setBackground(SystemColor.controlHighlight);
		textField5.setBounds(66, 22, 220, 19);
		panel5.add(textField5);
		textField5.setColumns(10);
		
		JLabel Label7 = new JLabel("Monto :");
		Label7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label7.setBounds(310, 25, 45, 13);
		panel5.add(Label7);
		
		textField6 = new JTextField();
		textField6.setBackground(SystemColor.controlHighlight);
		textField6.setBounds(362, 22, 220, 19);
		panel5.add(textField6);
		textField6.setColumns(10);
		
		JLabel Label8 = new JLabel("Fecha :");
		Label8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label8.setBounds(615, 25, 45, 13);
		panel5.add(Label8);
		
		textField7 = new JTextField();
		textField7.setBackground(SystemColor.controlHighlight);
		textField7.setBounds(664, 22, 190, 19);
		panel5.add(textField7);
		textField7.setColumns(10);
		
		JButton Button7 = new JButton("Guardar Cuenta Por Cobrar");
		Button7.setForeground(Color.WHITE);
		Button7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button7.setBackground(new Color(255, 175, 0));
		Button7.setBounds(139, 71, 195, 29);
		panelContenedor2.add(Button7);
		
		JButton Button8 = new JButton("Eliminar Cuenta Por Cobrar");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button8.setForeground(Color.WHITE);
		Button8.setBackground(new Color(255, 175, 0));
		Button8.setBounds(393, 71, 195, 29);
		panelContenedor2.add(Button8);
		
		JButton Button9 = new JButton("Editar Cuenta Por Cobrar");
		Button9.setForeground(Color.WHITE);
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button9.setBackground(new Color(255, 175, 0));
		Button9.setBounds(651, 71, 202, 29);
		panelContenedor2.add(Button9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 116, 999, 349);
		panelContenedor2.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Destino", "Monto", "Fecha"
			}
		));
		
		JPanel panelContenedor3 = new JPanel();
		panelContenedor3.setBounds(10, 203, 1048, 541);
		getContentPane().add(panelContenedor3);
		panelContenedor3.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 40, 999, 300);
		panelContenedor3.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Producto", "Cantidad", "Precio"
			}
		));
		
		JButton Button11 = new JButton("Cuadre de Caja");
		Button11.setForeground(new Color(255, 255, 255));
		Button11.setBackground(new Color(255, 175, 0));
		Button11.setBounds(900, 490, 123, 30);
		panelContenedor3.add(Button11);
		
		
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelContenedor1.setVisible(true);
				panelContenedor2.setVisible(false);
				panelContenedor3.setVisible(false);
				/*Button2.setBackground((new Color(255, 175, 0)));
				Button3.setBackground((new Color(242, 234, 225)));
				Button10.setBackground((new Color(242, 234, 225)));*/
			
			}
		});
		
		
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelContenedor2.setVisible(true);
				panelContenedor1.setVisible(false);
				panelContenedor3.setVisible(false);
				/*Button3.setBackground((new Color(255, 175, 0)));
				Button2.setBackground((new Color(242, 234, 225)));
				Button10.setBackground((new Color(242, 234, 225)));*/
				
			}
		});
		
		Button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelContenedor3.setVisible(true);
				panelContenedor2.setVisible(false);
				panelContenedor1.setVisible(false);
				/*Button10.setBackground((new Color(255, 175, 0)));
				Button2.setBackground((new Color(242, 234, 225)));
				Button3.setBackground((new Color(242, 234, 225)));*/
			}
		});
		
		
	}
}
