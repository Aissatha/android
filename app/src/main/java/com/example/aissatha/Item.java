package com.example.aissatha;

public class Item {
    String nom;
    String desc;
    int image;

    public Item(String nom, String desc, int image) {
        this.nom = nom;
        this.desc = desc;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean getDescription() {
        return false;
    }

}
