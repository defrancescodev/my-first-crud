package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.Soulsborne;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SoulsborneDAO {

    public void save(Soulsborne soulsborne) {
        String sql = "INSERT INTO soulsborne(title, price,  developer, release_year, own_parry_mechanic, visual_thema) VALUES (?,?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, soulsborne.getTitle());
            pstm.setDouble(2, soulsborne.getPrice());
            pstm.setString(3, soulsborne.getDeveloper());
            pstm.setInt(4, soulsborne.getRelease_year());
            pstm.setBoolean(5, soulsborne.isOwn_parry_mechanic());
            pstm.setString(6, soulsborne.getVisual_thema());
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (con != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Soulsborne> getSoulsbornes() {
        String sql = "SELECT * FROM soulsborne";

        List<Soulsborne> soulsbornes = new ArrayList<Soulsborne>();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null; //Classe que vai recuperar os dandos do banco ***SELECT***

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Soulsborne soulsborne = new Soulsborne();
                soulsborne.setId(rset.getInt("id"));
                soulsborne.setTitle(rset.getString("title"));
                soulsborne.setPrice(rset.getDouble("price"));
                soulsborne.setDeveloper(rset.getString("developer"));
                soulsborne.setRelease_year(rset.getInt("release_year"));
                soulsborne.setOwn_parry_mechanic(rset.getBoolean("own_parry_mechanic"));
                soulsborne.setVisual_thema(rset.getString("visual_thema"));

                soulsbornes.add(soulsborne);
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

        return soulsbornes;
    }

    public void updateSoulsborne(Soulsborne soulsborne) {
        String sql = "UPDATE soulsborne SET title = ?, price = ?, developer = ?, release_year = ?, own_parry_mechanic = ?, visual_thema = ?  WHERE id = ? ";

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionFactory.createConnection();
            preparedStatement = (PreparedStatement) con.prepareStatement(sql);

            //Adicionar os valores para atualizar
            preparedStatement.setString(1, soulsborne.getTitle());
            preparedStatement.setDouble(2, soulsborne.getPrice());
            preparedStatement.setString(3, soulsborne.getDeveloper());
            preparedStatement.setInt(4, soulsborne.getRelease_year());
            preparedStatement.setBoolean(5, soulsborne.isOwn_parry_mechanic());
            preparedStatement.setString(6, soulsborne.getVisual_thema());

            //Qual ID do registro que deseja atualizar
            preparedStatement.setInt(7, soulsborne.getId());


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

    public void deleteById(int id) {
        String sql = "DELETE FROM soulsborne WHERE id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.createConnection();
            preparedStatement = connection.prepareStatement(sql);
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
