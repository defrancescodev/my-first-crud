package main;

import br.com.myfirstcrud.model.Game;
import dao.GameDAO;

public class Main {
    public static void main(String[] args) {
        GameDAO gameDAO = new GameDAO();
        Game game1 = new Game("Elden Ring", 274.50, 2022, "FromSoftware", false, "Ruined World");
        gameDAO.save(game1);
    }
}
