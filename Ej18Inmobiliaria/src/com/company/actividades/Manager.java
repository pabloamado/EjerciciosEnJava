package com.company.actividades;
import java.util.ArrayList;

public class Manager {

    private ArrayList<Property> properties;
    private Validator validator;

    public Manager(){
        validator=new Validator();
    }

    public ArrayList<Property> getProperties(){
        if(properties==null){
            properties=new ArrayList<>();
        }
        return properties;
    }

    private boolean addProperty(Property property){

        return validator.propertyIsValid(property);

    }

    public boolean registerProperty(Property property){
        boolean registered=false;

        if(addProperty(property)){

            getProperties().add(property);
            registered=true;
        }

        return registered;
    }

    public String getInfoProperties(){
        String info="";
        for(int i=0;i<getProperties().size();i++){
            info+=getProperties().get(i).getDescription();
        }

        return info;
    }


}
