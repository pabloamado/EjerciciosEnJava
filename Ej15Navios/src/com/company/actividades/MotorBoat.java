package com.company.actividades;

public class MotorBoat extends Ship{

    private int quantityCrane;

    public MotorBoat(String name,float flotage, float stability,float speed,String engine, int quantityCrane){

        super(name,flotage,stability,speed,engine);
        this.quantityCrane=quantityCrane;

    }

    public void setQuantityCrane(int quantityCrane){
        this.quantityCrane=quantityCrane;
    }

    public int getQuantityCrane(){
        return quantityCrane;
    }

    public String getShipDescription(){
        String description=super.getShipDescription();
        return description+ " \n Cantidad de gruas: "+ quantityCrane;
    }

}
