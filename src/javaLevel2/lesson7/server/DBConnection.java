package javaLevel2.lesson7.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// возвращаем созданное соединение с базой данных

public class DBConnection {
    public static Connection getInstance() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost8899/USERS", "user", ""); // USER - data base
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
