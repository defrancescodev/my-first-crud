package br.com.myfirstcrud.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Indies extends Game{
    private boolean solo_developer;
    private String art_style;

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



    public boolean isSolo_developer() {
        return solo_developer;
    }

    public void setSolo_developer(boolean solo_developer) {
        this.solo_developer = solo_developer;
    }

    public String getArt_style() {
        return art_style;
    }

    public void setArt_style(String art_style) {
        this.art_style = art_style;
    }
}
