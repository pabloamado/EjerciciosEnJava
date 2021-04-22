package com.company.actividades;

public class CombatShip extends Ship{

    private float firePower;
    private float solidity;

    public CombatShip (String name, float flotage, float stability, float speed,String engine, float firePower, float solidity){

        super(name,flotage,stability,speed,engine);
        this.firePower=firePower;
        this.solidity=solidity;
    }

    public void setFirePower(float firePower) {
        this.firePower = firePower;
    }

    public float getFirePower() {
        return firePower;
    }

    public void setSolidity(float solidity) {
        this.solidity = solidity;
    }
    public float getSolidity(){
        return solidity;
    }

    public String getShipDescription() {
        String description=super.getShipDescription();
        return  description + " El poder de fuego es de: "+ firePower+ " y la solidez es de: " + solidity;
    }
}
