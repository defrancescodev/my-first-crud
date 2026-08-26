package br.com.myfirstcrud;

public class Indies {
    private int id;
    private String title;
    private String developer;
    private int release_year;
    private boolean solo_developer;
    private String art_style;
    private double price;

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

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

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public boolean getSolo_developer() {
        return solo_developer;
    }

    public void setSolo_developer(boolean solo_developer) {
        this.solo_developer = solo_developer;
    }

    public String getArt_style() {
        return art_style;
    }

    public void setArt_style(String art_style) {
        this.art_style = art_style;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
