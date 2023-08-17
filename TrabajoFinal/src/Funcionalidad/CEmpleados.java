package Funcionalidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import conexion.mysqlConexion;

public class CEmpleados implements CrudMetodos {
	
	int ID;
	String Nombre;
	String Correo;
	String telefono;
	String fecha_Admision;
	int Salario;
	String Puesto;
	String Turno;
	String Horario;
	JTable table;
	
	mysqlConexion conexionDB = new mysqlConexion();
	Connection connection = conexionDB.estableceConexion();
	
	public CEmpleados (int ID, String Nombre, String Correo, String telefono, String fecha_Admision, int Salario,String Puesto, String Turno, String Horario, JTable table){
		
		this.Nombre = Nombre;
		this.Correo = Correo;
		this.telefono = telefono;
		this.ID = ID;
		this.fecha_Admision = fecha_Admision;
		this.Salario = Salario;
		this.Puesto = Puesto;
		this.Turno = Turno;
		this.Horario = Horario;
		this.table = table;
	}
	
	public CEmpleados(Connection connection2) {
		// TODO Auto-generated constructor stub
	}
	
	public CEmpleados(DefaultTableModel model) {
        // Initialize attributes
    }

	public CEmpleados(JTable table2) {
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
	
	public String gettelefono() {
		return telefono;
	}
	
	public void settelefono(String telefono) {
		this.telefono= telefono;
	}
	
	public int getID() {
		return  ID;
	}
	
	public void setID(int ID) {
		this.ID= ID;
	}
	
	public String getfecha_Admision() {
		return  fecha_Admision;
	}
	
	public void setfecha_Admision(String fecha_Admision) {
		this.fecha_Admision= fecha_Admision;
	}
	
	public int getSalario() {
		return  Salario;
	}
	
	public void setSalario(int Salario) {
		this.Salario= Salario;
	}

	public String getPuesto() {
		return  Puesto;
	}
	
	public void setPuesto( String Puesto) {
		this.Puesto= Puesto;
	}

	public String getTurno() {
		return Turno;
	}
	
	public void setTurno( String Turno) {
		this.Turno= Turno;
	}

	public String getHorario() {
		return  Horario;
	}
	public void setHorario(String Horario) {
		this.Horario= Horario;
	}
	
	

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		String query = "INSERT INTO Empleado ( ID,Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        	 preparedStatement.setInt(1, ID);
        	preparedStatement.setString(2, Nombre);
            preparedStatement.setString(3, Correo);
            preparedStatement.setString(4, telefono);
            preparedStatement.setString(5, fecha_Admision);
            preparedStatement.setInt(6, Salario);
            preparedStatement.setString(7, Puesto);
            preparedStatement.setString(8, Turno);
            preparedStatement.setString(9, Horario);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
            actualizarTabla();
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el registro, error: " + e.toString());
        }
        //actualizarTabla();
       
	}
	
	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		String query = "DELETE FROM Empleado WHERE ID = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, ID);

            int result = preparedStatement.executeUpdate();
	        if (result > 0) {
	        	JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
	            actualizarTabla();
	            
	            
	        } else {
	            JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro para eliminar.");
	        }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro, error: " + e.toString());
        }
        //actualizarTabla();
        
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		String query = "UPDATE Empleado SET Nombre=?, Correo=?, telefono=?, fecha_Admision=?, Salario=?, Puesto=?, Turno=?, Horario=? WHERE ID=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
           
        	preparedStatement.setString(1, Nombre);
            preparedStatement.setString(2, Correo);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, fecha_Admision);
            preparedStatement.setInt(5, Salario);
            preparedStatement.setString(6, Puesto);
            preparedStatement.setString(7, Turno);
            preparedStatement.setString(8, Horario);
            preparedStatement.setInt(9, ID);

            int result = preparedStatement.executeUpdate();
	        if (result > 0) {
	            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
	            
	        } else {
	        	JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
	            actualizarTabla();
	        }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro, error: " + e.toString());
        }
        //actualizarTabla(); 
        
	}

	
	@Override
	public void actualizarTabla() {
		// TODO Auto-generated method stub
		
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

        String query = "SELECT ID, Nombre, Correo, telefono,  fecha_Admision, Salario, Puesto, Turno, Horario FROM Empleado";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
            	int ID = resultSet.getInt("ID");
                String Nombre = resultSet.getString("Nombre");
                String Correo = resultSet.getString("Correo");
                String telefono = resultSet.getString("telefono");
                
                String fecha_Admision = resultSet.getString("fecha_Admision");
                int Salario = resultSet.getInt("Salario");
                String Puesto = resultSet.getString("Puesto");
                String Turno = resultSet.getString("Turno");
                String Horario = resultSet.getString("Horario");

                model.addRow(new Object[]{ID,Nombre, Correo, telefono, fecha_Admision, Salario, Puesto, Turno, Horario});
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
        
    

}