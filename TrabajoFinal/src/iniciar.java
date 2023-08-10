import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class iniciar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iniciar frame = new iniciar();
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
	public iniciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setForeground(new Color(242, 234, 225));
		splitPane.setResizeWeight(0.15);
		panel.add(splitPane, BorderLayout.CENTER);
		
		JPanel sidebar = new JPanel();
		sidebar.setForeground(new Color(242, 234, 225));
		sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
		sidebar.setBackground(new Color(242, 234, 225));
		splitPane.setLeftComponent(sidebar);
		
		JPanel sidebarInt1 = new JPanel();
		sidebarInt1.setBackground(new Color(242, 234, 225));
		sidebarInt1.setLayout(new BoxLayout(sidebarInt1, BoxLayout.Y_AXIS));
		sidebar.add(sidebarInt1);
		
		JLabel lbllogo = new JLabel("");
		sidebarInt1.add(lbllogo);
		lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbllogo.setBackground(new Color(240, 240, 240));
		lbllogo.setLabelFor(this);
		lbllogo.setIcon(new ImageIcon(iniciar.class.getResource("/img/Mi proyecto.png")));
		
		JPanel panelNombre = new JPanel();
		panelNombre.setBackground(new Color(242, 234, 225));
		sidebar.add(panelNombre);
		
		JLabel lblNombre = new JLabel("Megan Fox");
		lblNombre.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		panelNombre.add(lblNombre);
		
		JPanel panelCargo = new JPanel();
		panelCargo.setBackground(new Color(242, 234, 225));
		sidebar.add(panelCargo);
		
		JLabel lblCargo = new JLabel("Administrador");
		lblCargo.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		panelCargo.add(lblCargo);
		
		JPanel panel1 = new JPanel();
		sidebar.add(panel1);
		panel1.setLayout(new BorderLayout(0, 0));
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInicio.setBackground(Color.RED);
			}
		});
		btnInicio.setForeground(new Color(0, 0, 0));
		btnInicio.setBackground(new Color(242, 234, 225));
		btnInicio.setBorderPainted(false); 
		panel1.add(btnInicio);
		
		JPanel panel2 = new JPanel();
		sidebar.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		JButton btnProducto = new JButton("Producto");
		btnProducto.setBackground(new Color(242, 234, 225));
		btnProducto.setBorderPainted(false); 
		panel2.add(btnProducto);
		
		JPanel panel3 = new JPanel();
		sidebar.add(panel3);
		panel3.setLayout(new BorderLayout(0, 0));
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.setBackground(new Color(242, 234, 225));
		btnEmpleados.setBorderPainted(false); 
		panel3.add(btnEmpleados);
		
		JPanel panel4 = new JPanel();
		sidebar.add(panel4);
		panel4.setLayout(new BorderLayout(0, 0));
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.setBackground(new Color(242, 234, 225));
		btnVentas.setBorderPainted(false); 
		panel4.add(btnVentas);
		
		JPanel panel5 = new JPanel();
		sidebar.add(panel5);
		panel5.setLayout(new BorderLayout(0, 0));
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setBackground(new Color(242, 234, 225));
		btnInventario.setBorderPainted(false); 
		panel5.add(btnInventario);
		
		JPanel panel6 = new JPanel();
		sidebar.add(panel6);
		panel6.setLayout(new BorderLayout(0, 0));
		
		JButton btnContailidad = new JButton("Contailidad");
		btnContailidad.setBackground(new Color(242, 234, 225));
		btnContailidad.setBorderPainted(false); 
		panel6.add(btnContailidad);
		
		JPanel panel7 = new JPanel();
		sidebar.add(panel7);
		panel7.setLayout(new BorderLayout(0, 0));
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setBackground(new Color(242, 234, 225));
		btnUsuarios.setBorderPainted(false); 
		panel7.add(btnUsuarios);
		
		JPanel panel8 = new JPanel();
		sidebar.add(panel8);
		panel8.setLayout(new BorderLayout(0, 0));
		
		JButton btnCerrar = new JButton("Cerrar Sesion");
		btnCerrar.setBackground(new Color(242, 234, 225));
		btnCerrar.setBorderPainted(false); 
		panel8.add(btnCerrar);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		splitPane.setRightComponent(desktopPane);
	}
	
	

}
