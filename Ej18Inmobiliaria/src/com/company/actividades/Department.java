package com.company.actividades;

public class Department extends Property{

    private int floor;
    private String number;
    private boolean petsAllowed;

    public Department(String province, String neightbourhood, String street, int streetNumber, int postalCode,
                      boolean privateNeighbourhood, boolean hasGas, boolean hasSewer, Contact contact) {

        super(province, neightbourhood, street, streetNumber, postalCode, privateNeighbourhood, hasGas, hasSewer, contact);
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public String getDescription(){
        String msg="";
        msg+="Datos del departamento: \n"+  "Numero del dpto: "+ number + "\n Piso de dpto: "+ floor +"\n";
        if(petsAllowed) msg+="Estan permitidas las mascotas. \n ";

        return super.getDescription() + msg;
    }
}
