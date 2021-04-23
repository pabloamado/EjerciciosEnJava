package com.company.actividades;

import java.time.LocalDate;
import java.util.ArrayList;

public class List {

    private String name;
    private boolean wholeSailer;
    private LocalDate date;
    private ArrayList<Item> itemsToSell;

    public List(String name, boolean wholeSailer,int year, int month,int day) {
        this.name = name;
        this.wholeSailer = wholeSailer;
        date=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public boolean isWholeSailer() {
        return wholeSailer;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Item> getItemsToSell() {
        if(itemsToSell==null){
            itemsToSell=new ArrayList<>();
        }
        return itemsToSell;
    }

    public void addItem(Item item) {

        getItemsToSell().add(item);
    }
}
