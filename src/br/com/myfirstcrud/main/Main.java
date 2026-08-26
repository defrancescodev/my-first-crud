package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.SoulsborneDAO;
import br.com.myfirstcrud.model.Soulsborne;

public class Main {
    public static void main(String[] args) {
        SoulsborneDAO soulsborneDAO = new SoulsborneDAO();
        Soulsborne soulsborne = new Soulsborne();

        soulsborne.setId(2);
        soulsborne.setTitle("Dark Souls 2");
        soulsborne.setDeveloper("FromSoftware");
        soulsborne.setRelease_year(2014);
        soulsborne.setOwn_parry_mechanic(true);
        soulsborne.setVisual_thema("Dark Fantasy");

        soulsborneDAO.save(soulsborne);




    }
}
