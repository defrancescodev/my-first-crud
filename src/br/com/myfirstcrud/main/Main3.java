package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.FpsGamesDAO;
import br.com.myfirstcrud.model.FpsGames;

public class Main3 {
    public static void main(String[] args) {
        FpsGamesDAO fpsGamesDAO = new FpsGamesDAO();
        FpsGames fpsGames1 = new FpsGames();

        fpsGames1.setId(1);
        fpsGames1.setTitle("GTA V");
        fpsGames1.setPrice(224.90);
        fpsGames1.setDeveloper("Rockstar North");
        fpsGames1.setBackground("Los Santos City;");
        //fpsGamesDAO.saveFps(fpsGames1);

        for (FpsGames fpsGames : fpsGamesDAO.getFpsGames()) {
            System.out.println(fpsGames.getId());
            System.out.println(fpsGames.getTitle());
            System.out.println(fpsGames.getPrice());
            System.out.println(fpsGames.getDeveloper());
            System.out.println(fpsGames.getBackground());
        }
    }
}
