package com.company;

import com.company.actividades.*;

public class Main {

    public static void main(String[] args) {

        Contact contact1=new Contact("Juan","Galileo", "JGalileo@gmail.com",47561582);
        Contact contact2=new Contact("Maira","Falcon","@MFalcon@hotmail.com",45875416);
        contact2.setObservation("Vive a 25 km");

        House house=new House("Buenos aires","Vicente Lopez","Francia",
                2222,1647,false,true,false,contact1);
        house.setPool(true);
        house.setShed(true);

        Department depto=new Department("Cordoba", "Capital","Brasil",7154,
                158,true,false,true,contact2);
        depto.setNumber("485b");
        depto.setFloor(10);
        depto.setPetsAllowed(true);

        Room room1=new Room("Grande",260,300,500,true);
        Room room2=new Room("Living",250,500,400,false);
        Room room3=new Room("Cocina",300,400,450,true);
        Room room4=new Room("Sala de juegos",220,450,420,true);

        house.addRoom(room1);
        house.addRoom(room2);

        depto.addRoom(room3);
        depto.addRoom(room4);
        Manager manager=new Manager();
        boolean registered=manager.registerProperty(house);
        System.out.println(registered);
        registered=manager.registerProperty(depto);
        System.out.println(registered);

       System.out.println(manager.getInfoProperties());
    }
}
