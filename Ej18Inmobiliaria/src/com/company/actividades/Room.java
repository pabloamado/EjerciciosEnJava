package com.company.actividades;

public class Room {

    private String type;
    private float height;
    private float width;
    private float length;
    private boolean hasNaturalLight;

    public Room( String type, float height, float width, float length, boolean hasNaturalLight) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
        this.hasNaturalLight = hasNaturalLight;
    }

    public String getType() {
        return type;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public boolean isHasNaturalLight() {
        return hasNaturalLight;
    }

    public String getDescription (){
        String msg=" ";
        msg+="Tipo: "+ getType() + "\n";
        msg+="Altura: "+ getHeight() + " cm.\n";
        msg+="Ancho: " + getWidth() + " cm.\n";
        msg+="Largo: "+ getLength() + " cm.\n";
        if(hasNaturalLight)  msg+="Ademas tiene luz natural.\n";

        return msg;
    }
}
