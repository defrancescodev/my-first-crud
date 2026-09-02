package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.Game;
import br.com.myfirstcrud.model.ResidentEvil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GameDAO {
    public void saveGame(Game game) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.createConnection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(game.saveGame());
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

    public void updateGame() {

    }

    public <T extends Game> List<T> getGames(Supplier<T> gameSupplier) {
        List<T> gameList = new ArrayList<>();
        T dummyInstance = gameSupplier.get();
        String sql = "SELECT * FROM " + dummyInstance;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = ConnectionFactory.createConnection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);

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

                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return gameList;
    }
}
