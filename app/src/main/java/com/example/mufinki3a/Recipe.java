package com.example.mufinki3a;

public class Recipe {

    private String name;
    private int category;
    private String ingredients;
    private int pictureID;

    public Recipe(String name, int category, String ingredients, int pictureID) {
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.pictureID = pictureID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
