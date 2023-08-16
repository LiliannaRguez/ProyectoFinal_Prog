package VentanasGraficas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


@SuppressWarnings("serial")
public class VentanaCuadreCaja extends JDialog {
	
	private JTable table_2;
	

	//private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaCuadreCaja dialog = new VentanaCuadreCaja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaCuadreCaja() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setEnabled(false);
		setBounds(473, 230, 1082, 585);
		getContentPane().setLayout(null);
				
		JPanel panelContenedor3 = new JPanel();
		panelContenedor3.setBounds(10, 25, 1036, 541);
		getContentPane().add(panelContenedor3);
		panelContenedor3.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 70, 999, 300);
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
		
		JLabel lblNewLabel = new JLabel("Ventas del Dia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 31, 193, 22);
		panelContenedor3.add(lblNewLabel);
	}

}
