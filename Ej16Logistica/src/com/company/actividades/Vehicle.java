package com.company.actividades;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private int maxLoad;
    private ArrayList<Item> items;

    protected void load(Item item) {
        getItems().add(item);
    }

    public List<Item> getItems() {
        if(items==null){
            items=new ArrayList<>();
        }
        return items;
    }

    public Item getItemAt(int pos) {
        return getItems().get(pos);
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}

