package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class mysqlConexion {
	
	Connection conectar = null;
	
	String usuario = "root";
	String contrasenia = "root1";
	String bd = "tf_restaurante";
	String ip = "localhost";
	String puerto = "3306";
	
	String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
	
	public Connection estableceConexion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
			JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito ");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos, error: "+e.toString());
		}
		return conectar;
	}

}
