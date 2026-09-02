package br.com.myfirstcrud.main;

import br.com.myfirstcrud.dao.GameDAO;
import br.com.myfirstcrud.model.Soulsborne;

public class Main {
    public static void main(String[] args) {
        GameDAO gameDAO = new GameDAO();
        Soulsborne soulsborne = new Soulsborne();
        soulsborne.setId(1);
        soulsborne.setPrice();
    }
}
