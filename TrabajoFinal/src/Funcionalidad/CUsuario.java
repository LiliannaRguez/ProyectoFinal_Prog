package Funcionalidad;

import java.sql.Connection;
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
import conexion.mysqlConexion;

public class CUsuario implements CrudMetodos{

	int ID;
	String Usuario;
	String Clave;
	JTable table;
	
	
	mysqlConexion conexionDB = new mysqlConexion();
	Connection connection = conexionDB.estableceConexion();
	
	public CUsuario (int ID, String Usuario, String Clave,JTable table){
		this.ID = ID;
		this.Usuario = Usuario;
		this.Clave = Clave;
		this.table = table;
	
	}
	
	
	public CUsuario(JTable table2) {
		// TODO Auto-generated constructor stub
	}

	public CUsuario() {
		// TODO Auto-generated constructor stub
	}


	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID= ID;
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
		String query = "INSERT INTO Usuario (ID, Usuario, Clave) VALUES ( ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, ID);
            preparedStatement.setString(2, Usuario);
            preparedStatement.setString(3, Clave);
        

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el registro, error: " + e.toString());
        }
        actualizarTabla();
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		String query = "DELETE FROM Usuario WHERE ID = ?";

	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setInt(1, this.ID); // Make sure "this.ID" refers to the ID of the user

	        int result = preparedStatement.executeUpdate();
	        if (result > 0) {
	            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
	            actualizarTabla();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se pudo encontrar el usuario para eliminar.");
	        }
	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario, error: " + e.toString());
	    }
	}
	
	

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		String query = "UPDATE Usuario SET Usuario=?, Clave=? WHERE ID=?";

	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, Usuario);
	        preparedStatement.setString(2, Clave);
	        preparedStatement.setInt(3, ID);

	        int result = preparedStatement.executeUpdate();
	        if (result > 0) {
	            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
	            
	        } else {
	            JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro para editar.");
	        }

	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro, error: " + e.toString());
	    }
	    actualizarTabla();
	}

	@Override
	public void actualizarTabla() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);

	    
	    String query = "SELECT ID, Usuario, Clave FROM Usuario";

	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            int ID = resultSet.getInt("ID");
	            String Usuario = resultSet.getString("Usuario");
	            String Clave = resultSet.getString("Clave");
	          

	            model.addRow(new Object[]{ID, Usuario, Clave});
	        }

	        
	        table.setModel(model);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
    }
}