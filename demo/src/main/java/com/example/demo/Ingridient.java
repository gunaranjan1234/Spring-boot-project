package com.example.demo;

public class Ingridient {
    private long Ingridientid;
    private String Ingridient_name;
    private String Nutrition_value;

    public Ingridient(long ingridientid, String ingridient_name, String nutrition_value) {
        Ingridientid = ingridientid;
        Ingridient_name = ingridient_name;
        Nutrition_value = nutrition_value;
    }

    public long getIngridientid() {
        return Ingridientid;
    }

    public void setIngridientid(long ingridientid) {
        Ingridientid = ingridientid;
    }

    public String getIngridient_name() {
        return Ingridient_name;
    }

    public void setIngridient_name(String ingridient_name) {
        Ingridient_name = ingridient_name;
    }

    public String getNutrition_value() {
        return Nutrition_value;
    }

    public void setNutrition_value(String nutrition_value) {
        Nutrition_value = nutrition_value;
    }

    @Override
    public String toString() {
        return "Ingridient{" +
                "Ingridientid=" + Ingridientid +
                ", Ingridient_name='" + Ingridient_name + '\'' +
                ", Nutrition_value='" + Nutrition_value + '\'' +
                '}';
    }
}
