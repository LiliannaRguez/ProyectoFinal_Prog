package Funcionalidad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import VentanasGraficas.VentanaPrincipal;
import com.mysql.cj.protocol.Resultset;

import conexion.mysqlConexion;

public class CUsuario {

	int Usuario_id;
	String Usuario;
	String Clave;
	String Tipo;
	
	public int getUsuario_id() {
		return Usuario_id;
	}
	public void setUsuario_id(int Usuario_id) {
		this.Usuario_id= Usuario_id;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String Usuario) {
		this.Usuario= Usuario;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String Clave) {
		this.Clave= Clave;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String Tipo) {
		this.Tipo= Tipo;
	}

	
	public void ValidarUsuario (JTextField Usuario,JPasswordField Clave, JFrame ventana) {
				
		try {
			ResultSet rs = null;
			PreparedStatement ps = null;
			mysqlConexion objetoConexion = new mysqlConexion();
			
			String consulta ="SELECT * FROM Usuario WHERE Usuario =? AND Clave =?;";
			ps=objetoConexion.estableceConexion().prepareStatement(consulta);
			
			String contra = String.valueOf(Clave.getPassword());
			
			ps.setString(1, Usuario.getText());
			ps.setString(2,contra );
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				JOptionPane.showMessageDialog(null," El Usuario es Correcto ");
				VentanaPrincipal newmenu = new VentanaPrincipal();
				ventana.dispose(); // Cierra la ventana actual
				newmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				newmenu.setVisible(true);	
				
			} else {
				JOptionPane.showMessageDialog(null,"Debe Ingrasar Usuarios Validos");
			
			}
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null," ERROR "+e.toString());
		}
	}	
	
}
