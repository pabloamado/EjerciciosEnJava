package com.company.actividades;

public class BattleShip extends CombatShip{

    private String armor;

    public BattleShip(String name, float flotage, float stability, float speed, String engine, float firePower, float solidity, String armor){

        super(name,flotage,stability,speed,engine,firePower,solidity);
        this.armor=armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getArmor(){
        return armor;
    }

    public String getShipDescription() {
        String description=super.getShipDescription();
        return description + " La armadura es: "+ armor;
    }
}
