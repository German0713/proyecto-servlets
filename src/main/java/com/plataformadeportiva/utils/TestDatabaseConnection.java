package com.plataformadeportiva.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            if (conn != null) {
                System.out.println("✅ Conexión exitosa a la base de datos");
            } else {
                System.out.println("❌ Fallo en la conexión");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
