package com.example.demo;

public class Rating {
    private long Ratingid;
    private  float stars;
    private String Recipe_name;
    private String comment;

    public Rating(long ratingid, float stars, String recipe_name, String comment) {
        Ratingid = ratingid;
        this.stars = stars;
        Recipe_name = recipe_name;
        this.comment = comment;
    }

    public long getRatingid() {
        return Ratingid;
    }

    public void setRatingid(long ratingid) {
        Ratingid = ratingid;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRecipe_name() {
        return Recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        Recipe_name = recipe_name;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "Ratingid=" + Ratingid +
                ", stars=" + stars +
                ", Recipe_name='" + Recipe_name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
