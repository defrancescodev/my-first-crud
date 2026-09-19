package main;

import br.com.myfirstcrud.model.Game;
import dao.GameDAO;

public class Main {
    public static void main(String[] args) {
        GameDAO gameDAO = new GameDAO();
        //Game game1 = new Game(1, "Elden Ring", 274.50, 2022, "FromSoftware", false, "Ruined World");
        ;

        gameDAO.deleteById(1);

        for (Game game : gameDAO.getGames()) {
            System.out.println(game.getName());
        }

    }
}
