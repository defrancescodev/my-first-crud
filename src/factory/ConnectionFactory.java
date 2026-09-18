package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String ROOT = "root";
    private static final String PASSWORD = "1234";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/games";

    public static Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(DB_URL, ROOT, PASSWORD);

    }

}
