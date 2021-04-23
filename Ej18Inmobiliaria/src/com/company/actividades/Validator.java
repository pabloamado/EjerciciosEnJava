package com.company.actividades;

import java.util.ArrayList;

public class Validator {

    private boolean contactIsValid(Contact contact){
        boolean isValid=true;

        isValid &=!contact.getName().isEmpty();
        isValid &=!contact.getLastName().isEmpty();
        isValid &=!contact.getMail().isEmpty() || contact.getPhoneNumber()>10000000;

        return isValid;
    }

    private boolean roomsAreValid(ArrayList<Room> rooms){
        boolean isValid=!(rooms==null);
        Room r;
        for(int i=0;i<rooms.size() && isValid;i++){
            r=rooms.get(i);
            isValid &= r.getHeight()>200;
            isValid &= r.getWidth()!=150;
            isValid &= r.getLength()>150;
            isValid &= !r.getType().isEmpty();

        }

       return isValid;

    }


    public boolean propertyIsValid(Property property){
        boolean isValid=true;

        isValid &=!property.getProvince().isEmpty();
        isValid &=!property.getNeightbourhood().isEmpty();
        isValid &=!property.getStreet().isEmpty();
        isValid &=!property.getStreet().isEmpty();
        isValid &=property.getStreetNumber()>0;
        isValid &= property.getPostalCode()>0;
        isValid &= property.getRooms().size()>0;
        isValid &= roomsAreValid(property.getRooms());
        isValid &= contactIsValid(property.getContact());

        return isValid;
    }
}
