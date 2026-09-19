package main;

import br.com.myfirstcrud.model.Game;
import dao.GameDAO;

public class Main {
    public static void main(String[] args) {
        GameDAO gameDAO = new GameDAO();
        Game eldenring = new Game("Elden Ring", 274.50, 2022, "FromSoftware", false, "World in Ruins");



        //gameDAO.save(eldenring);


        gameDAO.updateGame(eldenring, 3);

        for (Game game : gameDAO.getGames()) {
            System.out.println(game.getName());
        }

    }
}
