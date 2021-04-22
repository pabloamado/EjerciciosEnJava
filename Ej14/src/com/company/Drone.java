package com.company;

public class Drone {

    private static final float weightLimit=200;
    private Tool tool;
    private float heightLimit;
    private float speedLimit;
    private float newSpeedLimit;
    private float newHeightLimit;

    public Drone(Tool tool, float heightLimit,float speedLimit){
        this.tool=tool;
        this.heightLimit =heightLimit;
        this.speedLimit =speedLimit;

        update();
    }

    public float getHeightLimit(){
        return heightLimit;
    }

    public float getSpeedLimit(){
        return speedLimit;
    }

    public float getNewSpeedLimit() {
        return newSpeedLimit;
    }

    public float getNewHeightLimit() {
        return newHeightLimit;
    }

    private void setNewSpeedLimit(float newSpeedLimit) {
        this.newSpeedLimit = newSpeedLimit;
    }

    private void setNewHeightLimit(float newHeightLimit) {
        this.newHeightLimit = newHeightLimit;
    }

    private boolean isPenalized(){
        boolean penalized=true;
        penalized&=tool!=null;
        penalized&=tool.getWeight()>weightLimit;
        return penalized;
    }

    public void modifiedSpeed(float weightExceeded){
        int porcentPenalization=2;
        int multiplier=(int)weightExceeded/50; // asi sabemos cuantas veces hay 50 gramos de exceso
        float speedPenalization= multiplier * porcentPenalization * speedLimit /100;
        setNewSpeedLimit(speedLimit-speedPenalization);


    }

    private void modifiedHeight(float weightExceeded){
        int porcentPenalization=5;
        int multiplier=(int)weightExceeded/50;
        float heightPenalization= multiplier * porcentPenalization * heightLimit / 100;
        setNewHeightLimit(heightLimit-heightPenalization);


    }
    private void update (){

        if(isPenalized()){
            float weightExceeded =tool.getWeight()-weightLimit;
            modifiedSpeed(weightExceeded);
            modifiedHeight(weightExceeded);

        }









    }
}
