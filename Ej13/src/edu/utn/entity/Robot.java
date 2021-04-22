package edu.utn.entity;

public class Robot {
    private String serial;
    private int hp;
    private Locomotion locomotion;

    public Robot(String serial, Locomotion locomotion, int hp) {
        this.serial = serial;
        this.locomotion = locomotion;
        this.hp = hp;
    }

    public String getFeatures() {
        int finalHp = hp - locomotion.getHpConsumption();

        String info =
                "Serial: " + serial +
                "\nHP final: " +finalHp;

        info += locomotion.getFeatures();
        return info;
    }

    public void setLocomotion(Locomotion locomotion) {
        this.locomotion = locomotion;
    }
}
