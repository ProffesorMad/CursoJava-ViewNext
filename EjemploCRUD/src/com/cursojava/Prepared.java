package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared {
       
		// Valores dependientes del entorno
        static String url = "jdbc:mysql://localhost:3306/bdpersonas";
        static String user = "root";
        static String pwd = "root";
        static String query = "select * from personas where edad > ?";
        static int valor = 25;
     
        public static void main(String[] args) {
            try (Connection conexion = DriverManager.getConnection(url, user, pwd);
                 PreparedStatement psSentencia = generarConsultaParametrizada(query, valor, conexion)
                ) {
     
                try (ResultSet rs = psSentencia.executeQuery()) {
                    while (rs.next()) {
                        System.out.print(rs.getString("nombre"));
                        System.out.print(" ");
                        System.out.print(rs.getString("apellido"));
                        System.out.print(" ");
                        System.out.print(rs.getInt("edad"));
                        System.out.println();
                    }
                }
     
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
     
        
        public static PreparedStatement generarConsultaParametrizada(String sql, int valor, Connection conexion) throws SQLException {
            PreparedStatement psSentencia = null;
     
            psSentencia = conexion.prepareStatement(sql);
            psSentencia.setInt(1, valor);
            
            return psSentencia;
        }
    }