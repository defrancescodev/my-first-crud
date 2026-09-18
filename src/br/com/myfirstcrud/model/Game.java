package br.com.myfirstcrud.model;

public class Game {
    private String name;
    private double price;
    private int releaseYear;
    private String developer;
    private boolean isSoloDeveloper;
    private String visualThema;



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
