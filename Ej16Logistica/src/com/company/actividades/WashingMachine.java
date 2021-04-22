package com.company.actividades;

public class WashingMachine extends HomeAppliance{

    private int rpm;
    private float load;

    public void setRpm(int rpm){
        this.rpm=rpm;
    }

    public int getRpm(){
        return rpm;
    }

    public void setLoad(float load){
        this.load=load;
    }

    public float getLoad(){
        return load;
    }

}
