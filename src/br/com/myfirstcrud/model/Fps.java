package br.com.myfirstcrud.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fps extends Game {

    private String background;

    @Override
    public String saveGame() {
        return "INSERT INTO fps VALUES (title, price, developer, release_year) VALUES (?, ?, ?, ?)";
    }

    @Override
    public String updateGame() {
        return "UPDATE fps SET title = ?, price = ?, developer = ?, release_year = ? WHERE id = ?";
    }

    @Override
    public String getTableName() {
        return "return fps";
    }

    @Override
    public void fillPreparedStatement(PreparedStatement pstm, Boolean isUpdate) {


    }

    @Override
    public void fillFromResutset(ResultSet rset) {

    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
