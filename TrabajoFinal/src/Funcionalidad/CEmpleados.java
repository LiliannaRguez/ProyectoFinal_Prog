package Funcionalidad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import VentanasGraficas.VentanaEmpleados;
import conexion.mysqlConexion;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class CEmpleados implements CrudMetodos {
	
	String Nombre;
	String Correo;
	int telefono;
	int Empleado_id;
	String fecha_admision;
	int Salario;
	String Nomb_puesto;
	String Tipo;
	String Horario;
	private JTable table;
	
	mysqlConexion conexionDB = new mysqlConexion();
	Connection connection = conexionDB.estableceConexion();
	
	public CEmpleados (String Nombre,String Correo,int telefono,int Empleado_id,String fecha_admision,int Salario,String Nomb_puesto,String Tipo, String Horario,JTable table){
		this.Nombre = Nombre;
		this.Correo = Correo;
		this.telefono = telefono;
		this.Empleado_id = Empleado_id;
		this.fecha_admision = fecha_admision;
		this.Salario = Salario;
		this.Nomb_puesto = Nomb_puesto;
		this.Tipo = Tipo;
		this.Horario = Horario;
		this.table = table;
	}
	
	public CEmpleados() {
       
    }
	
	
	
	
	public CEmpleados(int empleado_id2) {
		// TODO Auto-generated constructor stub
	}

	public String Nombre () {
		return Nombre;
	}
	public void setNombre(String Nombre) {
		this.Nombre= Nombre;
	}
	
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String Correo) {
		this.Correo= Correo;
	}
	
	public int telefono() {
		return telefono;
	}
	public void settelefono(int telefono) {
		this.telefono= telefono;
	}
	public int getEmpleado_id() {
		return  Empleado_id;
	}
	public void setEmpleado_id(int Empleado_id) {
		this.Empleado_id= Empleado_id;
	}
	
	public String getfecha_admision() {
		return  fecha_admision;
	}
	public void setfecha_admision(String fecha_admision) {
		this.fecha_admision= fecha_admision;
	}
	
	public int getSalario() {
		return  Salario;
	}
	public void setSalario(int Salario) {
		this.Salario= Salario;
	}

	public String getNomb_puesto() {
		return  Nomb_puesto;
	}
	public void setNomb_puesto( String Nomb_puesto) {
		this.Nomb_puesto= Nomb_puesto;
	}

	public String getTipo() {
		return  Tipo;
	}
	public void setTipo( String Tipo) {
		this.Tipo= Tipo;
	}

	public String getHorario() {
		return  Horario;
	}
	public void setHorario(String Horario) {
		this.Horario= Horario;
	}


	public void guardar(String Nombre, String Correo, String telefono, int Empleado_id, String fecha_admision, int Salario, String Nomb_puesto, String Tipo, String Horario) {
	    mysqlConexion conexionDB = new mysqlConexion();

	    String[] queries = {
	        "INSERT INTO empleado (Nombre, Correo, telefono, Empleado_id, fecha_admision) VALUES (?, ?, ?, ?, ?)",
	        "INSERT INTO puesto (Salario, Nomb_puesto) VALUES (?, ?)",
	        "INSERT INTO turnos (Tipo, Horario) VALUES (?, ?)"
	    };

	    try {
	        Connection connection = conexionDB.estableceConexion();

	        for (String query : queries) {
	            PreparedStatement preparedStatement = connection.prepareStatement(query);

	            if (query.equals(queries[0])) {
	                preparedStatement.setString(1, Nombre);
	                preparedStatement.setString(2, Correo);
	                preparedStatement.setInt(3, Integer.parseInt(telefono));
	                preparedStatement.setInt(4, Empleado_id);
	                preparedStatement.setString(5, fecha_admision);
	            } else if (query.equals(queries[1])) {
	                preparedStatement.setInt(1, Salario); 
	                preparedStatement.setString(2, Nomb_puesto);
	            } else if (query.equals(queries[2])) {
	                preparedStatement.setString(1, Tipo);
	                preparedStatement.setString(2, Horario);  
	            }

	            preparedStatement.executeUpdate();
	        }
	        cargarDatosDesdeBaseDeDatos();

	        JOptionPane.showMessageDialog(null, "Se guardó correctamente.");

	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "No se pudo guardar correctamente, error: " + e.toString());
	    }
	}



	private void cargarDatosDesdeBaseDeDatos() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);

	    if (connection != null) {
	        try {
	            String sql = "SELECT Nombre, Correo, telefono, Empleado_id, fecha_admision, Salario, Nomb_puesto, Tipo, Horario FROM empleado, puesto, turnos WHERE empleado.Empleado_id = puesto.Empleado_id AND empleado.Empleado_id = turnos.Empleado_id";
	            PreparedStatement statement = connection.prepareStatement(sql);
	            ResultSet resultSet = statement.executeQuery();

	            while (resultSet.next()) {
	                String Nombre = resultSet.getString("Nombre");
	                String Correo = resultSet.getString("Correo");
	                String telefono = resultSet.getString("telefono");
	                int Empleado_id = resultSet.getInt("Empleado_id");
	                String fecha_admision = resultSet.getString("fecha_admision");
	                int Salario = resultSet.getInt("Salario");
	                String Nomb_puesto = resultSet.getString("Nomb_puesto");
	                String Tipo = resultSet.getString("Tipo");
	                String Horario = resultSet.getString("Horario");

	                model.addRow(new Object[]{Nombre, Correo, telefono, Empleado_id, fecha_admision, Salario, Nomb_puesto, Tipo, Horario});
	            }
	        } catch (SQLException ex) {
	            System.err.println("Error al cargar datos desde la base de datos: " + ex.getMessage());
	        }
	    } else {
	        System.err.println("La conexión a la base de datos no ha sido establecida.");
	    }
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		String queryEmpleado = "INSERT INTO empleado (Nombre, Correo, telefono, Empleado_id, fecha_admision) VALUES (?, ?, ?, ?, ?)";
	    String queryPuesto = "INSERT INTO puesto (Salario, Nomb_puesto) VALUES (?, ?)";
	    String queryTurno = "INSERT INTO turnos (Tipo, Horario) VALUES (?, ?)";

	    try {
	        PreparedStatement preparedStatementEmpleado = connection.prepareStatement(queryEmpleado);
	        preparedStatementEmpleado.setString(1, Nombre);
	        preparedStatementEmpleado.setString(2, Correo);
	        preparedStatementEmpleado.setInt(3,(telefono));
	        preparedStatementEmpleado.setInt(4, Empleado_id);
	        preparedStatementEmpleado.setString(5, fecha_admision);
	        preparedStatementEmpleado.executeUpdate();

	        PreparedStatement preparedStatementPuesto = connection.prepareStatement(queryPuesto);
	        preparedStatementPuesto.setInt(1, Salario);
	        preparedStatementPuesto.setString(2, Nomb_puesto);
	        preparedStatementPuesto.executeUpdate();

	        PreparedStatement preparedStatementTurno = connection.prepareStatement(queryTurno);
	        preparedStatementTurno.setString(1, Tipo);
	        preparedStatementTurno.setString(2, Horario);
	        preparedStatementTurno.executeUpdate();

	        cargarDatosDesdeBaseDeDatos();
	    } catch (SQLException e) {
	    	System.err.println("Error al cargar datos desde la base de datos: " + e.getMessage());
	        e.printStackTrace();
	        
	    }
	    
	    
	}

	public void eliminar() {
		// TODO Auto-generated method stub
		String queryEmpleado = "DELETE FROM empleado WHERE Empleado_id=?";
	    String queryPuesto = "DELETE FROM puesto WHERE Empleado_id=?";
	    String queryTurno = "DELETE FROM turnos WHERE Empleado_id=?";
	    
	    try {
	        PreparedStatement preparedStatementEmpleado = connection.prepareStatement(queryEmpleado);
	        preparedStatementEmpleado.setInt(1, Empleado_id);
	        preparedStatementEmpleado.executeUpdate();

	        PreparedStatement preparedStatementPuesto = connection.prepareStatement(queryPuesto);
	        preparedStatementPuesto.setInt(1, Empleado_id);
	        preparedStatementPuesto.executeUpdate();

	        PreparedStatement preparedStatementTurno = connection.prepareStatement(queryTurno);
	        preparedStatementTurno.setInt(1, Empleado_id);
	        preparedStatementTurno.executeUpdate();

	        cargarDatosDesdeBaseDeDatos();
	    } catch (SQLException e) {
	    	System.err.println("Error al eliminar datos de la base de datos: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


	public void editar() {
		// TODO Auto-generated method stub
		String queryEmpleado = "UPDATE empleado SET Nombre=?, Correo=?, telefono=? WHERE Empleado_id=?";
	    String queryPuesto = "UPDATE puesto SET Salario=?, Nomb_puesto=? WHERE Empleado_id=?";
	    String queryTurno = "UPDATE turnos SET Tipo=?, Horario=? WHERE Empleado_id=?";
	    
	    try {
	        PreparedStatement preparedStatementEmpleado = connection.prepareStatement(queryEmpleado);
	        preparedStatementEmpleado.setString(1, Nombre);
	        preparedStatementEmpleado.setString(2, Correo);
	        preparedStatementEmpleado.setInt(3,(telefono));
	        preparedStatementEmpleado.setInt(4, Empleado_id);
	        preparedStatementEmpleado.executeUpdate();

	        PreparedStatement preparedStatementPuesto = connection.prepareStatement(queryPuesto);
	        preparedStatementPuesto.setInt(1, Salario);
	        preparedStatementPuesto.setString(2, Nomb_puesto);
	        preparedStatementPuesto.setInt(3, Empleado_id);
	        preparedStatementPuesto.executeUpdate();

	        PreparedStatement preparedStatementTurno = connection.prepareStatement(queryTurno);
	        preparedStatementTurno.setString(1, Tipo);
	        preparedStatementTurno.setString(2, Horario);
	        preparedStatementTurno.setInt(3, Empleado_id);
	        preparedStatementTurno.executeUpdate();

	        cargarDatosDesdeBaseDeDatos();
	        
	        System.out.println("Datos actualizados en la base de datos.");
	    } catch (SQLException e) {
	    	System.err.println("Error al actualizar datos en la base de datos: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


	@Override
	public void actualizarTabla() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);

	    String query = "SELECT Nombre, Correo, telefono, Empleado_id, fecha_admision, Salario, Nomb_puesto, Tipo, Horario FROM empleado, puesto, turnos WHERE empleado.Empleado_id = puesto.Empleado_id AND empleado.Empleado_id = turnos.Empleado_id";

	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            String Nombre = resultSet.getString("Nombre");
	            String Correo = resultSet.getString("Correo");
	            String telefono = resultSet.getString("telefono");
	            int Empleado_id = resultSet.getInt("Empleado_id");
	            String fecha_admision = resultSet.getString("fecha_admision");
	            int Salario = resultSet.getInt("Salario");
	            String Nomb_puesto = resultSet.getString("Nomb_puesto");
	            String Tipo = resultSet.getString("Tipo");
	            String Horario = resultSet.getString("Horario");

	            model.addRow(new Object[]{Nombre, Correo, telefono, Empleado_id, fecha_admision, Salario, Nomb_puesto, Tipo, Horario});
	            
	            cargarDatosDesdeBaseDeDatos();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}