package br.com.myfirstcrud.model;

public class Game {
    private int id;
    private String name;
    private double price;
    private int releaseYear;
    private String developer;
    private boolean isSoloDeveloper;
    private String visualThema;

    public Game() {

    }

    public Game(int id, String name, double price, int releaseYear, String developer, boolean isSoloDeveloper, String visualThema) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
        this.developer = developer;
        this.isSoloDeveloper = isSoloDeveloper;
        this.visualThema = visualThema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isSoloDeveloper() {
        return isSoloDeveloper;
    }

    public void setSoloDeveloper(boolean soloDeveloper) {
        isSoloDeveloper = soloDeveloper;
    }

    public String getVisualThema() {
        return visualThema;
    }

    public void setVisualThema(String visualThema) {
        this.visualThema = visualThema;
    }
}
