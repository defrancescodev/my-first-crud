package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.model.Indies;
import br.com.myfirstcrud.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class IndiesDAO {
    public void save(Indies indies) {
        String sql = "INSERT INTO indies(title, price, developer, release_year, solo_developer, art_style) VALUES (?, ?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);

            pstm.setString(1, indies.getTitle());
            pstm.setDouble(2, indies.getPrice());
            pstm.setString(3, indies.getDeveloper());
            pstm.setInt(4, indies.getRelease_year());
            pstm.setBoolean(5, indies.getSolo_developer());
            pstm.setString(6, indies.getArt_style());

            pstm.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pstm != null)
                    pstm.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Indies> getIndies() {
        String sql = "SELECT * FROM indies";
        List<Indies> indiesList = new ArrayList<Indies>();

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Indies indies = new Indies();
                indies.setId(rset.getInt("id"));
                indies.setTitle(rset.getString("title"));
                indies.setPrice(rset.getDouble("price"));
                indies.setDeveloper(rset.getString("developer"));
                indies.setRelease_year(rset.getInt("release_year"));
                indies.setSolo_developer(rset.getBoolean("solo_developer"));
                indies.setArt_style(rset.getString("art_style"));

                indiesList.add(indies);

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
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return indiesList;
    }
}
