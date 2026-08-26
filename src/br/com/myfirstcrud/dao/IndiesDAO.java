package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.Indies;
import br.com.myfirstcrud.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IndiesDAO {
    public void save(Indies indies) {
        String sql = "INSERT INTO indies VALUES (title, price, developer, release_year, solo_developer, art_style) VALUES (?, ?, ?, ?, ?, ?)";

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
            pstm.setString(6, indies.getArtstyle());

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
}
