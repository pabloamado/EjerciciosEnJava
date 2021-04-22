package com.company.actividades;

public class Item {
    private String description;
    private float height;
    private float width;
    private float lenght;
    private int id;

    public String getDescription() {
        return description + " Id: "+ getId() +" Largo: "+ getLenght()+ " Ancho: "+getWidth() +" Alto: "+ getHeight();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
