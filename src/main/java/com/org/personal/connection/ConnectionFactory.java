package com.org.personal.connection;

import java.sql.*;

public class ConnectionFactory {
    private static final String USERNAME = "root";

    private static final String PASSWORD = "";

    private static final String URL = "jdbc:mysql://localhost:3306/midterm_exam";

    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER_CLASS_NAME);
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    protected void disconnect() throws SQLException, ClassNotFoundException {
        if (getConnection() != null && !getConnection().isClosed()) {
            getConnection().close();
        }
    }
}
