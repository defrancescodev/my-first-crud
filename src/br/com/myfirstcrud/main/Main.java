package br.com.myfirstcrud.main;

import br.com.myfirstcrud.model.Indies;
import br.com.myfirstcrud.dao.IndiesDAO;
import br.com.myfirstcrud.dao.SoulsborneDAO;
import br.com.myfirstcrud.model.Soulsborne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SoulsborneDAO soulsborneDAO = new SoulsborneDAO();
        Soulsborne soulsborne1 = new Soulsborne();

        Indies indies1 = new Indies();
        IndiesDAO indiesDAO = new IndiesDAO();

//        System.out.println("Name: ");
//        soulsborne1.setTitle(input.nextLine());
//
//        System.out.println("Price: ");
//        soulsborne1.setPrice(input.nextDouble());
//
//        System.out.println("Developer: ");
//        soulsborne1.setDeveloper(input.next());
//
//        System.out.println("Release Year: ");
//        soulsborne1.setRelease_year(input.nextInt());
//
//        System.out.println("Parry?");
//        soulsborne1.setOwn_parry_mechanic(input.nextBoolean());
//
//        input.nextLine();
//
//        System.out.println("Art style?");
//        soulsborne1.setVisual_thema(input.nextLine());

        //soulsborneDAO.save(soulsborne1);


//        indies1.setTitle("Dead Cells");
//        indies1.setPrice(47.49);
//        indies1.setDeveloper("MotionTwin");
//        indies1.setRelease_year(2018);
//        indies1.setSolo_developer(false);
//        indies1.setArt_style("hand-drawn 2D art style");

        //indiesDAO.save(indies1);
        
       for (Soulsborne soulsborne : soulsborneDAO.getSoulsbornes()) {
           System.out.println(soulsborne.getTitle());
           System.out.println(soulsborne.getDeveloper());
           System.out.println(soulsborne.getRelease_year());
           System.out.println(soulsborne.getVisual_thema());
           System.out.println(soulsborne.isOwn_parry_mechanic());
           System.out.println();

       }
//
//       for (Indies indies : indiesDAO.getIndies()) {
//           System.out.println(indies.getTitle());
//           System.out.println(indies.getPrice());
//           System.out.println(indies.getDeveloper());
//           System.out.println(indies.getRelease_year());
//           System.out.println(indies.getSolo_developer());
//           System.out.println(indies.getArt_style());
//           System.out.println();
//       }
    }
}
