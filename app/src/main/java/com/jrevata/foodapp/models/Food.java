package com.jrevata.foodapp.models;

/**
 * Created by Alumno on 27/03/2018.
 */

public class Food {

    private String name;
    private String time;
    private Double precio;
    private String picture;

    public Food(){

    }

    public Food(String name, String time, Double precio, String picture) {
        this.name = name;
        this.time = time;
        this.precio = precio;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
