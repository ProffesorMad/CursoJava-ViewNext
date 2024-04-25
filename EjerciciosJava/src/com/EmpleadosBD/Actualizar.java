package com.EmpleadosBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar {
	
	static String url = "jdbc:mysql://localhost:3306/bdpersonas";
    static String user = "root";
    static String pwd = "root";

	public static void main(String[] args) {
		
		try {
			
            // Establecer conexión con la base de datos
        	
            Connection conn = DriverManager.getConnection(url, user, pwd);
            
            // Datos del empleado para actualizar
            
            String nombre = "Macarena";
            String apellido = "Gutierrez";
            Date fechaNacimiento = Date.valueOf("2002-09-13");
            double salario = 876.93;

            // Consulta preparada para actualizar empleado
            
            String updateQuery = "UPDATE empleados SET nombre = ?, apellido = ?, fecha_nacimiento = ?, salario = ? WHERE id = ?";
            PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
            updateStatement.setString(1, nombre);
            updateStatement.setString(2, apellido);
            updateStatement.setDate(3, fechaNacimiento); 
            updateStatement.setDouble(4, salario);
            updateStatement.setInt(5, 2);
            
            updateStatement.executeUpdate();
            System.out.println("Registro actualizado");
            
            
        // Cerrar la conexión
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

