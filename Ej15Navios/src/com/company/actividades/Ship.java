package com.company.actividades;

public abstract class Ship {
    private String shipName;
    private float flotage;
    private float stability;
    private float speed;
    private String engine;

    public Ship(){}

    public Ship(String name, float flotage, float stability, float speed,String engine){
        shipName=name;
        this.flotage=flotage;
        this.stability=stability;
        this.speed=speed;
        this.engine=engine;

    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public float getFlotage() {
        return flotage;
    }

    public void setFlotage(float flotage) {
        this.flotage = flotage;
    }

    public float getStability() {
        return stability;
    }

    public void setStability(float stability) {
        this.stability = stability;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getShipDescription(){
        return " Nombre del barco: "+ shipName+
                "\n flotabilidad:"+ flotage+
                "\n estabilidad: "+stability+
                "\n velocidad: "+speed+
                "\n motor: "+ engine;
    }

}
