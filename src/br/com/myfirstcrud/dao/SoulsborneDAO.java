package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.Soulsborne;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class SoulsborneDAO {

    public void save(Soulsborne soulsborne) {
        String sql = "INSERT INTO soulsborne(title, developer, release_year, own_parry_mechanic, visual_thema) VALUES (?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, soulsborne.getTitle());
            pstm.setString(2, soulsborne.getDeveloper());
            pstm.setInt(3, soulsborne.getRelease_year());
            pstm.setBoolean(4, soulsborne.isOwn_parry_mechanic());
            pstm.setString(5, soulsborne.getVisual_thema());

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

}
