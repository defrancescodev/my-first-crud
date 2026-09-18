package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String ROOT = "root";
    private static final String PASSWORD = "1234";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/my_stuff";

    public static Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(DB_URL, ROOT, PASSWORD);

    }

    public static void main(String[] args) {
        try {
            Connection connection = connection();

            if (connection != null) {
                System.out.println("Conexão obtida com sucesso");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
