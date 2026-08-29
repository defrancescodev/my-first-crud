package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.ResidentEvilDAO;
import br.com.myfirstcrud.model.ResidentEvil;

public class Main2 {
    public static void main(String[] args) {
        ResidentEvilDAO residentEvilDAO = new ResidentEvilDAO();

//        ResidentEvil residentEvil1 = new ResidentEvil();
//        residentEvil1.setTitle("Resident Evil 4 Remake");
//        residentEvil1.setPrice(169.00);
//        residentEvil1.setRelease_year(2023);
//        residentEvil1.setMain_characte("Leon S. Kennedy");
//        residentEvilDAO.save(residentEvil1);

        for (ResidentEvil residentEvil : residentEvilDAO.getResidentEvilS()) {
            System.out.println(residentEvil.getTitle());
            System.out.println(residentEvil.getPrice());
            System.out.println(residentEvil.getDeveloper());
            System.out.println(residentEvil.getRelease_year());
            System.out.println(residentEvil.getMain_character());
            System.out.println();
        }
    }
}
