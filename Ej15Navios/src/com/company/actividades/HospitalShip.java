package com.company.actividades;

public class HospitalShip extends Ship{

    private float loadCapacity;

    public HospitalShip(String name, float flotage, float stability,float speed, String engine, float loadCapacity){

        super(name,flotage,stability,speed,engine);
        this.loadCapacity=loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity){
        this.loadCapacity=loadCapacity;
    }

    public float getLoadCapacity(){
        return loadCapacity;
    }

    public String getShipDescription(){
        String description=super.getShipDescription();
        description+= " \n Capacidad de carga: " + loadCapacity;
        return description;
    }

}
