package VentanasGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class VentanaIngresos extends JDialog {
	
	private JTextField textField;
	private JTextField textField3;
	private JTextField textField4;
	
	private JTable table;

	//private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaIngresos dialog = new VentanaIngresos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaIngresos() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setEnabled(false);
		setBounds(500, 255, 1082, 585);
		getContentPane().setLayout(null);
		
		JPanel panelContenedor1 = new JPanel();
		panelContenedor1.setBackground(SystemColor.window);
		panelContenedor1.setBounds(21, 0, 1015, 530);
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
		
	}

}
