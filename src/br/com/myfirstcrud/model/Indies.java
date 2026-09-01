package br.com.myfirstcrud.model;

public class Indies extends Game{
    private boolean solo_developer;
    private String art_style;



    public boolean isSolo_developer() {
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
}
