package org.example.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection = null;

    private ConnectionFactory(){

    }

    public static Connection getConnection() {
        if(connection == null){

            System.out.println("Connection is being created");

            String url = "jdbc:postgresql://localhost:5432/Project1";
            String user = "postgres";
            String password = ".Adlez123";
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url,user,password);
            } catch(SQLException e) {
                System.out.println("Connection error");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
