package com.company.actividades;

import com.sun.deploy.panel.IProperty;

public class House extends Property{

    private boolean shed; //cobertizo
    private boolean pool;

    public House(String province, String neightbourhood, String street, int streetNumber, int postalCode,
                 boolean privateNeighbourhood, boolean hasGas, boolean hasSewer, Contact contact) {
        super(province, neightbourhood, street, streetNumber, postalCode, privateNeighbourhood, hasGas, hasSewer, contact);
    }

    public boolean isShed() {
        return shed;
    }

    public void setShed(boolean shed) {
        this.shed = shed;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public String getDescription(){
        String msg="";
        if(shed) msg+="La casa tiene ademas un cobertizo. ";

        if(pool) msg+="La casa tiene pileta.\n";

        return super.getDescription() + msg;
    }

}
