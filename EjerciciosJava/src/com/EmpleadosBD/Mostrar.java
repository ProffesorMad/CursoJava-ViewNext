package com.EmpleadosBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mostrar {
    
    static String url = "jdbc:mysql://localhost:3306/bdpersonas";
    static String user = "root";
    static String pwd = "root";

    public static void main(String[] args) {
        
        try {
        	
            // Establecer conexión con la base de datos
        	
            Connection conn = DriverManager.getConnection(url, user, pwd);

            // Consulta preparada para seleccionar todos los empleados
            
            String selectQuery = "SELECT * FROM empleados WHERE apellido = 'Gutierrez'";
            // String selectQuery = "SELECT * FROM empleados";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);

            // Ejecutar la consulta
            
            ResultSet resultSet = selectStatement.executeQuery();

            // Mostrar los resultados
            
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                java.sql.Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");
                double salario = resultSet.getDouble("salario");
                
                System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaNacimiento + ", Salario: " + salario);
            }

            // Cerrar la conexión
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

