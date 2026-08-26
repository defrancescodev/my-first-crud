package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.Soulsborne;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class SoulsborneDAO {

    public void save(Soulsborne soulsborne) {
        String sql = "INSERT INTO soulsborne(title, release_year, developer, own_parry_mechanic, visual_themaic) VALUES (?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, soulsborne.getTitle());
            pstm.setDate(2, new Date(soulsborne.getRelease_year().getTime()));
            pstm.setString(3, soulsborne.getDeveloper());
            pstm.setBoolean(4, soulsborne.isOwn_parry_echanic());
            pstm.setString(5, soulsborne.getVisual_themaic());

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
