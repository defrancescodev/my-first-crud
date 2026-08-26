package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.SoulsborneDAO;
import br.com.myfirstcrud.model.Soulsborne;

public class Main {
    public static void main(String[] args) {
        SoulsborneDAO soulsborneDAO = new SoulsborneDAO();
        Soulsborne soulsborne1 = new Soulsborne();

        //soulsborne1.setId(3);
        //soulsborne1.setTitle("Dark Souls 3");
        //soulsborne1.setDeveloper("FromSoftware");
        //soulsborne1.setRelease_year(2016);
        //soulsborne1.setOwn_parry_mechanic(true);
        //soulsborne1.setVisual_thema("Ruined World");

        //soulsborneDAO.save(soulsborne);

       for (Soulsborne soulsborne : soulsborneDAO.getSoulsbornes()) {
           System.out.println(soulsborne.getTitle());
           System.out.println(soulsborne.getDeveloper());
           System.out.println(soulsborne.getRelease_year());
           System.out.println(soulsborne.getVisual_thema());
           System.out.println(soulsborne.isOwn_parry_mechanic());
           System.out.println();

       }





    }
}
