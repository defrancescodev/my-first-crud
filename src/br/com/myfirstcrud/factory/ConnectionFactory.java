package br.com.myfirstcrud.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //Conexão do tipo JDBC

    private static final String USERNAME = "root";
    private static final String PASSWORD= "1234";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/games";

    /**
     * Conexão com o banco de dados
     */

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM

        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection connection = createConnection();

            if (connection != null) {
                System.out.println("Conexão obetida com sucesso");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
