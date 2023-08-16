package VentanasGraficas;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


@SuppressWarnings("serial")
public class VentanaCuentasPorCobrar extends JDialog {
	
	
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTable table_1;


	//private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaCuentasPorCobrar dialog = new VentanaCuentasPorCobrar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaCuentasPorCobrar() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setEnabled(false);
		setBounds(473, 240, 1082, 585);
		getContentPane().setLayout(null);
				
		JPanel panelContenedor2 = new JPanel();
		panelContenedor2.setBackground(Color.WHITE);
		panelContenedor2.setBounds(23, 10, 1019, 530);
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
		Button7.setBounds(139, 81, 195, 29);
		panelContenedor2.add(Button7);
		
		JButton Button8 = new JButton("Eliminar Cuenta Por Cobrar");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button8.setForeground(Color.WHITE);
		Button8.setBackground(new Color(255, 175, 0));
		Button8.setBounds(392, 81, 195, 29);
		panelContenedor2.add(Button8);
		
		JButton Button9 = new JButton("Editar Cuenta Por Cobrar");
		Button9.setForeground(Color.WHITE);
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Button9.setBackground(new Color(255, 175, 0));
		Button9.setBounds(652, 81, 202, 29);
		panelContenedor2.add(Button9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 129, 999, 349);
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
	}

}
