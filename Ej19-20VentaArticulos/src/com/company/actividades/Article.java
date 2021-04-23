package com.company.actividades;

public class Article {

    private String name;
    private float cost;
    private String observation;


    public Article(String name, float cost, String observation) {
        this.name = name;
        this.cost = cost;
        this.observation = observation;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getObservation() {
        return observation;
    }
}
