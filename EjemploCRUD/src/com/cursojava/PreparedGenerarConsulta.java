package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedGenerarConsulta {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "root";
		String query = "select * from personas where edad < ?";
		int valor = 25;
		
		try(Connection conexion = DriverManager.getConnection(url, user, pwd);
				PreparedStatement preSentencia = conexion.prepareStatement(query);
			){
			
			preSentencia.setInt(1, valor);
			ResultSet rs = preSentencia.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("nombre"));
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
				System.out.print(" ");
				System.out.print(rs.getInt("edad"));
				System.out.print("\n");
			}
			rs.close();
			}catch (SQLException e) {
				e.printStackTrace();
		}
			
	}


}
