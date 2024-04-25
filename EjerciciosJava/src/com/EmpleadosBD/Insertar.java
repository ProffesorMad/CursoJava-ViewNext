package com.EmpleadosBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar {
	
	static String url = "jdbc:mysql://localhost:3306/bdpersonas";
    static String user = "root";
    static String pwd = "root";

public static void main(String[] args) {
    	
        try {
            // Establecer conexión con la base de datos
        	
            Connection conn = DriverManager.getConnection(url, user, pwd);

            // Datos del empleado a insertar
            String nombre = "BeniAmin";
            String apellido = "Gutierrez";
            Date fechaNacimiento = Date.valueOf("2010-12-13");
            double salario = 80040.50;

            // Consulta preparada para insertar empleado
            String insertQuery = "INSERT INTO empleados (nombre, apellido, fecha_nacimiento, salario) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setString(1, nombre);
            insertStatement.setString(2, apellido);
            insertStatement.setDate(3, fechaNacimiento); // Fecha de nacimiento
            insertStatement.setDouble(4, salario); // Salario
            insertStatement.executeUpdate();
            System.out.println("Registro insertado");
            
         // Cerrar la conexión
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
