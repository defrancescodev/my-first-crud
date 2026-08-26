package br.com.myfirstcrud.model;

import java.sql.Date;

public class Soulsborne {
    private int id;
    private String title;
    private java.util.Date release_year;
    private String developer;
    private boolean own_parry_echanic;
    private String visual_themaic;

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

    public java.util.Date getRelease_year() {
        return release_year;
    }

    public void setRelease_year(java.sql.Date release_year) {
        this.release_year = release_year;
    }

    public boolean isOwn_parry_echanic() {
        return own_parry_echanic;
    }

    public void setOwn_parry_echanic(boolean own_parry_echanic) {
        this.own_parry_echanic = own_parry_echanic;
    }

    public String getVisual_themaic() {
        return visual_themaic;
    }

    public void setVisual_themaic(String visual_themaic) {
        this.visual_themaic = visual_themaic;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isOwnParryMechanic() {
        return own_parry_echanic;
    }

    public void setOwnParryMechanic(boolean ownParryMechanic) {
        this.own_parry_echanic = ownParryMechanic;
    }

    public String getVisual_hemaic() {
        return visual_themaic;
    }

    public void setVisual_hemaic(String visual_hemaic) {
        this.visual_themaic = visual_hemaic;
    }
}
