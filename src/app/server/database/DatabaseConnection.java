package app.server.database;

import java.sql.*;



public class DatabaseConnection {

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        //Creating an instance
        return new DatabaseConnection();
    }

    public Connection getConnection() throws SQLException {
        //Connect to the database: host 127.0.0.1 & port 3306 & database dcoms_db
        String url = "jdbc:mysql://127.0.0.1:3306/dcoms_db";
        String user = "root";
        String password = "root";


        Connection databaseConnection = DriverManager.getConnection(url,user,password);

        return databaseConnection;
    }
}
