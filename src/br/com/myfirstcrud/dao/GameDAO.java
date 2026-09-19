package dao;

import br.com.myfirstcrud.model.Game;
import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public List<Game> getGames() {
        List<Game> gameList = new ArrayList<Game>();
        String sql = "SELECT * FROM games";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.connection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Game game = new Game();
                game.setId(resultSet.getInt("id"));
                game.setName(resultSet.getString("title"));
                game.setPrice(resultSet.getDouble("price"));
                game.setId(resultSet.getInt("release_year"));
                game.setDeveloper(resultSet.getString("developer"));
                game.setSoloDeveloper(resultSet.getBoolean("solo_developer"));
                game.setVisualThema(resultSet.getString("visual_thema"));
                gameList.add(game);


            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (resultSet != null) {
                    resultSet.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return gameList;
    }

    public void updateGame(Game game, int id) {
        String sql = "UPDATE games SET title = ?, price = ?, release_year = ?, developer = ?, solo_developer = ?, visual_thema = ? WHERE id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try  {
            connection = ConnectionFactory.connection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, game.getName());
            preparedStatement.setDouble(3, game.getPrice());
            preparedStatement.setInt(4, game.getReleaseYear());
            preparedStatement.setString(5, game.getDeveloper());
            preparedStatement.setBoolean(6, game.isSoloDeveloper());
            preparedStatement.setString(7, game.getVisualThema());
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

    public void deleteById(int id) {
        String sql = "DELETE FROM games WHERE id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try {
            connection = ConnectionFactory.connection();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
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
