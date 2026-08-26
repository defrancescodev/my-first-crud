package br.com.myfirstcrud.model;

public class Soulsborne {
    private int id;
    private String title;
    private double price;
    private String developer;
    private int release_year;
    private boolean own_parry_mechanic;
    private String visual_thema;

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public boolean isOwn_parry_mechanic() {
        return own_parry_mechanic;
    }

    public void setOwn_parry_mechanic(boolean own_parry_mechanic) {
        this.own_parry_mechanic = own_parry_mechanic;
    }

    public String getVisual_thema() {
        return visual_thema;
    }

    public void setVisual_thema(String visual_thema) {
        this.visual_thema = visual_thema;
    }
}
