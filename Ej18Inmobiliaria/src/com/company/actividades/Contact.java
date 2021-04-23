package com.company.actividades;

public class Contact {

    private String name;
    private String lastName;
    private String mail;
    private int phoneNumber;
    private String observation;

    public Contact(String name, String lastName, String mail, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setObservation(String observation){
        this.observation=observation;
    }

    public String getObservation() {
        return observation;
    }

    public String getDescription() {
        String data="Contacto: \n";
        data+="Nombre: "+ name + "\n";
        data+="Apellido: "+ lastName + "\n";
        data+="Email: " + mail + "\n";

        if(phoneNumber>10000000){
        data+="Telefono: "+ phoneNumber + "\n";
        }

        if(observation!=null) {
            data+="Observacion: "+ observation + "\n";
        }

        return data;
    }
}
