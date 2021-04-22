package com.company.actividades;

public class Fridge extends HomeAppliance {

    private boolean freezer;

    public void setFreezer(boolean freezer){
        this.freezer=freezer;
    }

    public boolean getFreezer(){
        return freezer;
    }

}
