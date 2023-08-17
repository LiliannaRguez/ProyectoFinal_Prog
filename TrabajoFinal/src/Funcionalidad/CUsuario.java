package Funcionalidad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import VentanasGraficas.VentanaPrincipal;
import com.mysql.cj.protocol.Resultset;

import conexion.mysqlConexion;

public class CUsuario implements CrudMetodos{

	int Usuario_id;
	String Usuario;
	String Clave;
	String Tipo;
	JTable table;
	
	
	mysqlConexion conexionDB = new mysqlConexion();
	Connection connection = conexionDB.estableceConexion();
	
	public CUsuario (int Usuario_id, String Usuario, String Clave, String Tipo){
		this.Usuario_id = Usuario_id;
		this.Usuario = Usuario;
		this.Clave = Clave;
		this.Tipo = Tipo;
	
	}
	
	public CUsuario (){
		
	}
	
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
				ventana.dispose(); 
				newmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				newmenu.setVisible(true);	
				
			} else {
				JOptionPane.showMessageDialog(null,"Debe Ingresar Usuarios Validos");
			
			}
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null," ERROR "+e.toString());
		}
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		String query = "INSERT INTO Usuario (Usuario_id, Usuario, Clave, Tipo) VALUES (?, ?, ?, ?)";
	    
	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setInt(1, Usuario_id);
	        preparedStatement.setString(2, Usuario);
	        preparedStatement.setString(3, Clave);
	        preparedStatement.setString(4, Tipo);
	        preparedStatement.executeUpdate();
	        
	        JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	        
	        actualizarTabla();
	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		int selectedRow = table.getSelectedRow();
	    if (selectedRow != -1) {
	        int usuarioId = (int) table.getValueAt(selectedRow, 0); 
	        
	        
	        String query = "DELETE FROM Usuario WHERE Usuario_id = ?";
	        
	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setInt(1, usuarioId);
	            preparedStatement.executeUpdate();
	            
	           
	            actualizarTabla();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        
	        JOptionPane.showMessageDialog(null, "Selecciona un usuario para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		String query = "UPDATE Usuario SET Usuario = ?, Clave = ?, Tipo = ? WHERE Usuario_id = ?";
	    
	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, Usuario); 
	        preparedStatement.setString(2, Clave);  
	        preparedStatement.setString(3, Tipo);  
	        preparedStatement.setInt(4, Usuario_id); 
	        preparedStatement.executeUpdate();
	        
	        actualizarTabla();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	
	}

	@Override
	public void actualizarTabla() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);

	    String query = "SELECT Usuario_id, Usuario, Clave, Tipo FROM Usuario";

	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            int usuarioId = resultSet.getInt("Usuario_id");
	            String usuario = resultSet.getString("Usuario");
	            String clave = resultSet.getString("Clave");
	            String tipo = resultSet.getString("Tipo");

	            model.addRow(new Object[]{usuarioId, usuario, clave, tipo});
	        }

	        resultSet.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}