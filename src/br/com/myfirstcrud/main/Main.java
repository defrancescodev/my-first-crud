package br.com.myfirstcrud.main;

import br.com.myfirstcrud.Indies;
import br.com.myfirstcrud.dao.IndiesDAO;
import br.com.myfirstcrud.dao.SoulsborneDAO;
import br.com.myfirstcrud.model.Soulsborne;

public class Main {
    public static void main(String[] args) {
        SoulsborneDAO soulsborneDAO = new SoulsborneDAO();
        Soulsborne soulsborne1 = new Soulsborne();

        Indies indies1 = new Indies();
        IndiesDAO indiesDAO = new IndiesDAO();

//        soulsborne1.setTitle("Dark Souls Remastered");
//        soulsborne1.setPrice(154.90);
//        soulsborne1.setDeveloper("FromSoftware");
//        soulsborne1.setRelease_year(2011);
//        soulsborne1.setOwn_parry_mechanic(true);
//        soulsborne1.setVisual_thema("Ruined World");

        //soulsborneDAO.save(soulsborne1);


//        indies1.setTitle("Hollow Knight");
//        indies1.setPrice(46.99);
//        indies1.setDeveloper("TeamCherry");
//        indies1.setRelease_year(2017);
//        indies1.setSolo_developer(false);
//        indies1.setArt_style("hand-drawn 2D art style");
//
//        indiesDAO.save(indies1);







       for (Soulsborne soulsborne : soulsborneDAO.getSoulsbornes()) {
           System.out.println(soulsborne.getTitle());
           System.out.println(soulsborne.getDeveloper());
           System.out.println(soulsborne.getRelease_year());
           System.out.println(soulsborne.getVisual_thema());
           System.out.println(soulsborne.isOwn_parry_mechanic());
           System.out.println();

       }

       for (Indies indies : indiesDAO.getIndies()) {
           System.out.println(indies.getTitle());
           System.out.println(indies.getPrice());
           System.out.println(indies.getDeveloper());
           System.out.println(indies.getRelease_year());
           System.out.println(indies.getSolo_developer());
           System.out.println(indies.getArt_style());
           System.out.println();
       }
    }
}
