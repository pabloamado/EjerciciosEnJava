package com.company.actividades;

import java.util.ArrayList;

public class Property {

    private String province;
    private String neightbourhood;
    private String street;
    private int streetNumber;
    private int postalCode;

    private boolean privateNeightbourhood;
    private boolean hasGas;
    private boolean hasSewer;

    private ArrayList<Room> rooms;
    private Contact contact;
    
    public Property (String province, String neightbourhood, String street, int streetNumber, int postalCode,
                     boolean privateNeighbourhood, boolean hasGas,boolean hasSewer, Contact contact){

        this.province =province;
        this.neightbourhood =neightbourhood;
        this.street =street;
        this.streetNumber =streetNumber;
        this.postalCode =postalCode;
        this.privateNeightbourhood = privateNeighbourhood;
        this.hasGas = hasGas;
        this.hasSewer = hasSewer;
        this.contact=contact;

    }

    public String getProvince(){
        return province;
    }

    public String getNeightbourhood(){
        return neightbourhood;
    }

    public String getStreet(){
        return street;
    }

    public int getStreetNumber(){
        return streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public boolean getPrivateNeightbourhood() {
        return privateNeightbourhood;
    }

    public boolean getHasGas() {
        return hasGas;
    }

    public boolean getHasSewer() {
        return hasSewer;
    }

    public Contact getContact() {
        return contact;
    }

    public ArrayList<Room> getRooms() {

        if(rooms==null){
            rooms =new ArrayList<>();
        }

        return rooms;
    }

    public void addRoom(Room room){

        getRooms().add(room);

    }

    public void setRooms(ArrayList<Room> rooms){

        getRooms().addAll(rooms);

    }


    public String getDescription(){

        String msg="Propiedad: \n"+ "Provincia: "+ getProvince()+ "\n Barrio: "+ getNeightbourhood() +
                "\n Calle: "+ getStreet() + "\n Numero de calle: " + getStreetNumber() +
                "\n CodigoPostal: "+ getPostalCode() + "\n";
        msg+= extraData() + getContact().getDescription();
        msg+="Habitaciones: Posee "+ getRooms().size() +".\n";

        if(!getRooms().isEmpty()){

            for(int i=0; i<getRooms().size();i++){
                msg+= getRooms().get(i).getDescription();
            }
        }

        return msg;
    }


    public String extraData(){
        String data="Datos extra: ";
        if(getPrivateNeightbourhood()) data+="Se encuentra en un barrio privado. \n";

        if(getHasGas()) data+="Tiene conexion de gas natural. \n ";

        if(getHasSewer()) data+="Posee cloaca. \n";

        return data;
    }

}
