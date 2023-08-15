
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



@SuppressWarnings("serial")
public class iniciar extends JFrame {

	private JPanel contentPane;


	public iniciar() {
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1551, 830);
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
		sidebar.add(lbllogo);
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
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.setBackground(new Color(242, 234, 225));
		btnVentas.setBorderPainted(false); 
		panel3.add(btnVentas);
		
		JPanel panel4 = new JPanel();
		sidebar.add(panel4);
		panel4.setLayout(new BorderLayout(0, 0));
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setBackground(new Color(242, 234, 225));
		btnInventario.setBorderPainted(false); 
		panel4.add(btnInventario);
		
		JPanel panel5 = new JPanel();
		sidebar.add(panel5);
		panel5.setLayout(new BorderLayout(0, 0));
		
		JButton btnContabilidad = new JButton("Contabilidad");
		btnContabilidad.setBackground(new Color(242, 234, 225));
		btnContabilidad.setBorderPainted(false); 
		panel5.add(btnContabilidad);
		
		JPanel panel6 = new JPanel();
		sidebar.add(panel6);
		panel6.setLayout(new BorderLayout(0, 0));
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.setBackground(new Color(242, 234, 225));
		btnEmpleados.setBorderPainted(false); 
		panel6.add(btnEmpleados);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1061, 781);
		desktopPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 0, 1072, 781);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 0, 1072, 781);
		desktopPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(0, 0, 1061, 781);
		desktopPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(0, 0, 1061, 781);
		desktopPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(0, 0, 1072, 781);
		desktopPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(0, 0, 1061, 781);
		desktopPane.add(panel_7);
		
		
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				btnInicio.setBackground((new Color(255, 175, 0)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				
				VentanaInicio inicio = new VentanaInicio();
				inicio.setVisible(true);
				panel_1.add(inicio);
				
			}
		});
		
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			panel_2.setVisible(true);
			panel_1.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			panel_7.setVisible(false);
			btnProducto.setBackground((new Color(255, 175, 0)));
			btnInicio.setBackground((new Color(242, 234, 225)));
			btnEmpleados.setBackground((new Color(242, 234, 225)));
			btnVentas.setBackground((new Color(242, 234, 225)));
			btnInventario.setBackground((new Color(242, 234, 225)));
			btnContabilidad.setBackground((new Color(242, 234, 225)));
			btnUsuarios.setBackground((new Color(242, 234, 225)));
			btnCerrar.setBackground((new Color(242, 234, 225)));
			
			Producto ventanaProducto = new Producto();
			ventanaProducto.setVisible(true);
			panel_2.add(ventanaProducto);
			}
		});
	
		
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				btnVentas.setBackground((new Color(255, 175, 0)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				
				puntoDeVentas ventas = new puntoDeVentas();
				ventas.setVisible(true);
				panel_3.add(ventas);
			}
		});
		
		
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				btnInventario.setBackground((new Color(255, 175, 0)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				
				Inventario nuevoinventario = new Inventario();
				nuevoinventario.setVisible(true);
				panel_4.add(nuevoinventario); 
			}
		});
		
		btnContabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				btnContabilidad.setBackground((new Color(255, 175, 0)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				VentanaContabilidad contabilidad = new VentanaContabilidad();
				contabilidad.setVisible(true);
				panel_5.add(contabilidad);
			}
		});
		
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_6.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_7.setVisible(false);
				btnEmpleados.setBackground((new Color(255, 175, 0)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				
				VentanaEmpleados nuevoEmpleado = new VentanaEmpleados();
				nuevoEmpleado.setVisible(true);
				panel_6.add(nuevoEmpleado);
			
				
			}
		});
		
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_7.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				btnUsuarios.setBackground((new Color(255, 175, 0)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));
				btnCerrar.setBackground((new Color(242, 234, 225)));
				
				VentanaUsuaio nuevoUsuario = new VentanaUsuaio();
				nuevoUsuario.setVisible(true);
				panel_7.add(nuevoUsuario);
				//desktopPane.add(nuevoUsuario);
				
				
				
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//panel8.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				
				dispose();
				
				LoginApp login = new LoginApp();
				login.setExtendedState(JFrame.MAXIMIZED_BOTH);
				login.setVisible(true);
				//panel_8.add(login);
				
				//System.exit(EXIT_ON_CLOSE);
				
				/*btnCerrar.setBackground((new Color(255, 175, 0)));
				btnUsuarios.setBackground((new Color(242, 234, 225)));
				btnInicio.setBackground((new Color(242, 234, 225)));
				btnProducto.setBackground((new Color(242, 234, 225)));
				btnEmpleados.setBackground((new Color(242, 234, 225)));
				btnVentas.setBackground((new Color(242, 234, 225)));
				btnInventario.setBackground((new Color(242, 234, 225)));
				btnContabilidad.setBackground((new Color(242, 234, 225)));*/
			}
		});
	}

}
