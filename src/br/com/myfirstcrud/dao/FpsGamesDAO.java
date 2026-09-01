package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.FpsGames;
import br.com.myfirstcrud.model.Soulsborne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class FpsGamesDAO {
    public void saveFps(FpsGames fpsGames) {
        String slq = "INSERT INTO fps_games (title, price, developer, background) VALUES (?, ?, ?, ?)";
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionFactory.createConnection();
            preparedStatement = (PreparedStatement) con.prepareStatement(slq);
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

    public List<FpsGames> getFpsGames() {
        List<FpsGames> fpsGamesList = new LinkedList<FpsGames>();
        String sql = "SELECT * FROM fps_games";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            FpsGames fpsGames = new FpsGames();
            con = ConnectionFactory.createConnection();
            pstm =  (PreparedStatement) con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while (rset.next()) {
                fpsGames.setId(rset.getInt("id"));
                fpsGames.setTitle(rset.getString("title"));
                fpsGames.setPrice(rset.getDouble("price"));
                fpsGames.setDeveloper(rset.getString("developer"));
                fpsGames.setBackground(rset.getString("background"));
                fpsGamesList.add(fpsGames);
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (rset != null) {
                    rset.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fpsGamesList;

    }

    public void updateFpsGame(FpsGames fpsGames) {
        String sql = "UPDATE fps_games SET title = ?, price = ?, developer = ?, background = ? WHERE id = ?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, fpsGames.getTitle());
            pstm.setDouble(2, fpsGames.getPrice());
            pstm.setString(3, fpsGames.getDeveloper());
            pstm.setString(4, fpsGames.getBackground());
            pstm.setInt(5, fpsGames.getId());
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM fps_games WHERE id = ?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pstm != null ) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
