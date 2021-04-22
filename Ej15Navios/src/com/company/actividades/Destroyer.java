package com.company.actividades;

public class Destroyer extends CombatShip{

    private float maneuverability;

    public Destroyer(String name, float flotage, float stability, float speed,String engine, float firePower, float solidity,float maneuverability){

        super(name,flotage,stability,speed,engine,firePower,solidity);
        this.maneuverability=maneuverability;
    }

    public float getManeuverability(){
        return maneuverability;
    }

    public void setManeuverability(float maneuverability){
        this.maneuverability=maneuverability;
    }

    public String getShipDescription() {
        String description=super.getShipDescription();
        return description + " La maniobrabilidad es de: "+ maneuverability;

    }
}

