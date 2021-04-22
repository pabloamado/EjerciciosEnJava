package com.company;

public class Main {

    public static void main(String[] args) {

        Tool tool=new Tool("superBrazo", 300);
        Drone drone=new Drone(tool,1000,500);

        System.out.println("limite de altura: " +drone.getHeightLimit());
        System.out.println("nuevo limite de altura: " +drone.getNewHeightLimit());
        System.out.println("limite de velocidad: " +drone.getSpeedLimit());
        System.out.println("nuevo limite de velocidad: " + drone.getNewSpeedLimit());
    }
}
