package com.company.actividades;

import java.util.ArrayList;

public class Item {

    private Material materialType;
    private float volume;
    private ArrayList<Item> itemList;
    private boolean simple;
    private boolean contained;
    private boolean container;
    private boolean objectBetween;

    public Item(Material material, float volume){
        materialType=material;
        this.volume=volume;
    }

    public Material getMaterialType(){
        return materialType;
    }

    public void setMaterialType(Material material){
        materialType=material;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public boolean isContained() {
        return contained;
    }

    public void setContained(boolean contained) {
        this.contained = contained;
    }

    public boolean isContainer() {
        return container;
    }

    public void setContainer(boolean container) {
        this.container = container;
    }

    public boolean isBetween() {
        return objectBetween;
    }

    public void setObjectBetween(boolean objectBetween) {
        this.objectBetween = objectBetween;
    }

    public void addItem(Item item){

        getItemList().add(item);

    }

    public void addItem(ArrayList<Item> items){

        getItemList().addAll(items);
    }

    public ArrayList<Item> getItemList(){
        if(itemList ==null){

            itemList =new ArrayList<>();
        }
        return itemList;
    }


    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }
}
