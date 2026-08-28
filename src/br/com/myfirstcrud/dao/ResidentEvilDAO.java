package br.com.myfirstcrud.dao;

import br.com.myfirstcrud.factory.ConnectionFactory;
import br.com.myfirstcrud.model.ResidentEvil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ResidentEvilDAO {

    public void save(ResidentEvil residentEvil) {
        String sql = "INSERT INTO resident_evil(title, price, developer, release_year, main_character) VALUES (?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnection();
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, residentEvil.getTitle());
            pstm.setDouble(2, residentEvil.getPrice());
            pstm.setString(3, residentEvil.getDeveloper());
            pstm.setInt(4, residentEvil.getRelease_year());
            pstm.setString(5, residentEvil.getMain_character());
            pstm.execute();
            System.out.println("Jogo salvo com sucesso");



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

    public List<ResidentEvil> getResidentEvilS() {
        String sql = "SELECT * FROM ";
    }
}
