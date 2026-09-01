package br.com.myfirstcrud.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Soulsborne extends Game{

    private boolean own_parry_mechanic;
    private String visual_thema;

    @Override
    public String saveGame() {
        return "INSERT INTO soulsborne VALUES (title, price, developer, release_year) VALUES (?, ?, ?, ?)";
    }

    @Override
    public String updateGame() {
        return "UPDATE soulsborne SET title = ?, price = ?, developer = ?, release_year = ? WHERE id = ?";
    }

    @Override
    public String getTableName() {
        return "return soulsborne";
    }

    @Override
    public void fillPreparedStatement(PreparedStatement pstm, Boolean isUpdate) {


    }

    @Override
    public void fillFromResutset(ResultSet rset) {

    }

    public boolean isOwn_parry_mechanic() {
        return own_parry_mechanic;
    }

    public void setOwn_parry_mechanic(boolean own_parry_mechanic) {
        this.own_parry_mechanic = own_parry_mechanic;
    }

    public String getVisual_thema() {
        return visual_thema;
    }

    public void setVisual_thema(String visual_thema) {
        this.visual_thema = visual_thema;
    }
}
