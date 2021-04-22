package edu.utn.entity;

public class Locomotion {
    private int hpConsumption;
    private int replaceCycle;
    private String type;

    public Locomotion(String type) {
        setType(type);
    }

    public int getHpConsumption() {
        return hpConsumption;
    }

    public void setHpConsumption(int hpConsumption) {
        this.hpConsumption = hpConsumption;
    }

    public int getReplaceCycle() {
        return replaceCycle;
    }

    public void setReplaceCycle(int replaceCycle) {
        this.replaceCycle = replaceCycle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Devuelve una lista con todas las caracteristicas del sistema de locomocion.
 
    public String getFeatures() {
        String features =
            "\nHP consumption: " + getHpConsumption() +
            "\nKM between replacement: " +getReplaceCycle() +
            "\nType: " + getType();

        return features;
    }
}
