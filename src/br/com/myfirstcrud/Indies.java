package br.com.myfirstcrud;

public class Indies {
    private int id;
    private String title;
    private String developer;
    private int release_year;
    private String artstyle;
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

    public String getArtstyle() {
        return artstyle;
    }

    public void setArtstyle(String artstyle) {
        this.artstyle = artstyle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
