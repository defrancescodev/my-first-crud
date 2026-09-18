package dao;

import br.com.myfirstcrud.model.Game;
import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GameDAO {

    public void save(Game game) {
        String sql = "INSERT INTO games (title, price, release_year, developer, solo_developer, visual_thema) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.connection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);


            preparedStatement.setString(1, game.getName());
            preparedStatement.setDouble(2, game.getPrice());
            preparedStatement.setInt(3, game.getReleaseYear());
            preparedStatement.setString(4, game.getDeveloper());
            preparedStatement.setBoolean(5, game.isSoloDeveloper());
            preparedStatement.setString(6, game.getVisualThema());

            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
