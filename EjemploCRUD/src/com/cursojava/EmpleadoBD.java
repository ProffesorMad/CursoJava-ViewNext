package com.cursojava;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoBD {
	
    static String url = "jdbc:mysql://localhost:3306/bdpersonas";
    static String user = "root";
    static String pwd = "root";

    public static void main(String[] args) {
    	
        try {
            // Establecer conexión con la base de datos
        	
            Connection conn = DriverManager.getConnection(url, user, pwd);

            // Insertar datos usando una sentencia preparada
            
            String insertQuery = "INSERT INTO empleados (id, nombre, apellido, fecha_nacimiento, salario) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setInt(1, 1); // ID del empleado
            insertStatement.setString(2, "Juan");
            insertStatement.setString(3, "Pérez");
            insertStatement.setDate(4, Date.valueOf("1990-05-15")); // Fecha de nacimiento
            insertStatement.setDouble(5, 30000.00); // Salario
            insertStatement.executeUpdate();

            // Actualizar datos usando más de un valor parametrizado
            
            String updateQuery = "UPDATE empleados SET salario = ? WHERE apellido = ?";
            PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
            updateStatement.setDouble(1, 35000.00); // Nuevo salario
            updateStatement.setString(2, "Pérez"); // Apellido
            updateStatement.executeUpdate();

            // Mostrar todos los empleados cuyo apellido sea uno concreto
            
            String selectQuery = "SELECT * FROM empleados WHERE apellido = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setString(1, "Pérez"); // Apellido a buscar
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                                   ", Nombre: " + resultSet.getString("nombre") +
                                   ", Apellido: " + resultSet.getString("apellido") +
                                   ", Fecha de nacimiento: " + resultSet.getDate("fecha_nacimiento") +
                                   ", Salario: " + resultSet.getDouble("salario"));
            }

            // Cerrar la conexión
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
