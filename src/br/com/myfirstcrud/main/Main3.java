package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.FpsGamesDAO;
import br.com.myfirstcrud.model.FpsGames;

public class Main3 {
    public static void main(String[] args) {
        FpsGamesDAO fpsGamesDAO = new FpsGamesDAO();
        FpsGames fpsGames1 = new FpsGames();

        fpsGames1.setId(3);
        fpsGames1.setTitle("Call of Duty®: Modern Warfare® 4");
        fpsGames1.setPrice(299.99);
        fpsGames1.setDeveloper("Infinity Ward");
        fpsGames1.setBackground("The Korean War Front");
        fpsGamesDAO.saveFps(fpsGames1);
        fpsGamesDAO.updateFpsGame(fpsGames1);

        fpsGamesDAO.deleteById(1);
        fpsGamesDAO.deleteById(2);
        fpsGamesDAO.deleteById(3);

        for (FpsGames fpsGames : fpsGamesDAO.getFpsGames()) {
            System.out.println(fpsGames.getId());
            System.out.println(fpsGames.getTitle());
            System.out.println(fpsGames.getPrice());
            System.out.println(fpsGames.getDeveloper());
            System.out.println(fpsGames.getBackground());
            System.out.println();
        }
    }
}
