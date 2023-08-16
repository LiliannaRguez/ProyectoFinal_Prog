package VentanasGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaInicio extends JDialog {

	//private final JPanel contentPanel = new JPanel(); 
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaInicio dialog = new VentanaInicio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaInicio() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(SystemColor.menu);
		getContentPane().setEnabled(false);
		setBounds(473, 28, 1064, 781);
		//setBounds(1000, 100, 1067, 781);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 77, 1016, 2);
		getContentPane().add(separator);
		
		JLabel Label1 = new JLabel("Buscar");
		Label1.setEnabled(false);
		Label1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label1.setHorizontalAlignment(SwingConstants.LEFT);
		Label1.setBounds(790, 38, 48, 29);
		getContentPane().add(Label1);
		
		textField1 = new JTextField();
		textField1.setBounds(839, 39, 141, 28);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton Button1 = new JButton("");
		Button1.setIcon(new ImageIcon(VentanaEmpleados.class.getResource("/img/pngwing.com.png")));
		Button1.setBackground(new Color(255, 175, 0));
		Button1.setBounds(990, 38, 36, 29);
		getContentPane().add(Button1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(240, 249, 255));
		panel1.setBounds(16, 117, 240, 163);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(77, 100, 140, 41);
		panel1.add(textPane_3);
		textPane_3.setBackground(new Color(240, 249, 255));
		
		JButton Button2 = new JButton("Empleados");
		Button2.setIcon(new ImageIcon(VentanaInicio.class.getResource("/img/person48.png")));
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button2.setHorizontalAlignment(SwingConstants.LEFT);
		
		Button2.setForeground(new Color(0, 0, 0));
		Button2.setBackground(new Color(240, 249, 255));
		Button2.setBounds(0, 1, 240, 162);
		panel1.add(Button2);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(254, 246, 251));
		panel2.setBounds(270, 117, 240, 163);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBackground(new Color(254, 246, 251));
		textPane_1.setBounds(76, 100, 140, 41);
		panel2.add(textPane_1);
		
		JButton Button3 = new JButton("Producto");
		Button3.setIcon(new ImageIcon(VentanaInicio.class.getResource("/img/inventory40.png")));
		Button3.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button3.setHorizontalAlignment(SwingConstants.LEFT);
		Button3.setBackground(new Color(254, 246, 251));
		Button3.setBounds(0, 1, 240, 162);
		panel2.add(Button3);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(254, 251, 236));
		panel3.setBounds(526, 117, 240, 163);
		getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(78, 100, 140, 41);
		panel3.add(textPane);
		textPane.setBackground(new Color(254, 251, 236));
		
		JButton Button4 = new JButton("Ventas");
		Button4.setIcon(new ImageIcon(VentanaInicio.class.getResource("/img/sell40.png")));
		Button4.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button4.setHorizontalAlignment(SwingConstants.LEFT);
		Button4.setBackground(new Color(254, 251, 236));
		Button4.setBounds(0, 1, 240, 162);
		panel3.add(Button4);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(225, 210, 225));
		panel4.setBounds(786, 117, 240, 163);
		getContentPane().add(panel4);
		panel4.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(78, 101, 140, 41);
		panel4.add(textPane_2);
		textPane_2.setBackground(new Color(225, 210, 225));
		
		JButton Button5 = new JButton("Usuarios");
		Button5.setIcon(new ImageIcon(VentanaInicio.class.getResource("/img/manage40.png")));
		Button5.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button5.setHorizontalAlignment(SwingConstants.LEFT);
		Button5.setBackground(new Color(225, 210, 225));
		Button5.setBounds(0, 0, 240, 163);
		panel4.add(Button5);
		
	
	}
}
