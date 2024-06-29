package com.example.demo;

public class Recipe {
    private long Recipeid;
    private String Recipe_name;
    private String description;
    private String type;

    public Recipe(long recipeid, String recipe_name, String description, String type) {
        Recipeid = recipeid;
        Recipe_name = recipe_name;
        this.description = description;
        this.type = type;
    }

    public long getRecipeid() {
        return Recipeid;
    }

    public void setRecipeid(long recipeid) {
        Recipeid = recipeid;
    }

    public String getRecipe_name() {
        return Recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        Recipe_name = recipe_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "Recipeid=" + Recipeid +
                ", Recipe_name='" + Recipe_name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
