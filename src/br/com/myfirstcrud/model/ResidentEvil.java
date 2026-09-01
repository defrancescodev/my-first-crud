package br.com.myfirstcrud.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResidentEvil extends Game {

    private String main_character;

    @Override
    public String saveGame() {
        return "INSERT INTO resident_evil VALUES (title, price, developer, release_year) VALUES (?, ?, ?, ?)";
    }

    @Override
    public String updateGame() {
        return "UPDATE resident_evil SET title = ?, price = ?, developer = ?, release_year = ? WHERE id = ?";
    }

    @Override
    public String getTableName() {
        return "return resident_evil";
    }

    @Override
    public void fillPreparedStatement(PreparedStatement pstm, Boolean isUpdate) {


    }

    @Override
    public void fillFromResutset(ResultSet rset) {

    }
}
