package br.com.myfirstcrud.model;

import java.util.Date;

public class Soulsborne {
    private int id;
    private String title;
    private Date releaseYear;
    private String developer;
    private boolean ownParryMechanic;
    private String VisualThemaic;

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

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isOwnParryMechanic() {
        return ownParryMechanic;
    }

    public void setOwnParryMechanic(boolean ownParryMechanic) {
        this.ownParryMechanic = ownParryMechanic;
    }

    public String getVisualThemaic() {
        return VisualThemaic;
    }

    public void setVisualThemaic(String visualThemaic) {
        VisualThemaic = visualThemaic;
    }
}
