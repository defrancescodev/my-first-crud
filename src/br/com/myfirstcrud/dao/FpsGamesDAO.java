package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.FpsGames;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FpsGamesDAO {
    public void saveFps(FpsGames fpsGames) {
        String slq = "INSERT INTO fps_games (title, price, developer, background) VALUES (?, ?, ?, ?)";
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionFactory.createConnection();
            preparedStatement = con.prepareStatement(slq);
            preparedStatement.setString(1, fpsGames.getTitle());
            preparedStatement.setDouble(2, fpsGames.getPrice());
            preparedStatement.setString(3, fpsGames.getDeveloper());
            preparedStatement.setString(4, fpsGames.getBackground());
            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
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
