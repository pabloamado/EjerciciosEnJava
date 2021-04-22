package com.company;

import com.company.actividades.*;

public class Main {

    public static void main(String[] args) {

        Truck truck=new Truck();
        Car car =new Car();

        Bicycle bicycle=new Bicycle();
        bicycle.setId(1);
        bicycle.setSize(300);
        bicycle.setHeight(500);
        bicycle.setLenght(200);
        bicycle.setWidth(150);
        bicycle.setGears(4);
        bicycle.setElectric(true);
        bicycle.setDescription("Una biciclet electrica");

        Dresser dresser=new Dresser();
        dresser.setId(2);
        dresser.setHeight(400);
        dresser.setWidth(200);
        dresser.setLenght(60);
        dresser.setArea(80000);
        dresser.setQuantityDrawes(8);
        dresser.setDescription("Una comoda de roble");

        Fridge fridge=new Fridge();
        fridge.setId(3);
        fridge.setHeight(300);
        fridge.setWidth(150);
        fridge.setFreezer(true);
        fridge.setVoltage(10);
        fridge.setLenght(50);
        fridge.setDescription("Un freezer muy grande");

        Tv tv=new Tv();
        tv.setId(4);
        tv.setVoltage(20);
        tv.setHeight(50);
        tv.setWidth(60);
        tv.setSmart(true);
        tv.setLenght(4);
        tv.setDescription("Una tele smart");

        WashingMachine washingMachine=new WashingMachine();
        washingMachine.setId(5);
        washingMachine.setHeight(150);
        washingMachine.setWidth(90);
        washingMachine.setVoltage(50);
        washingMachine.setRpm(5000);
        washingMachine.setLoad(5);
        washingMachine.setLenght(45);
        washingMachine.setDescription("Un lavarropas");

        truck.load(fridge);
        truck.load(dresser);
        truck.load(washingMachine);
        car.load(tv);
        car.load(bicycle);

        for(int i=0;i<truck.getItems().size();i++){
            System.out.println("Carga del camion: "+ truck.getItems().get(i).getDescription());
        }

        System.out.println("Item del autor en posicion 2 : "+ car.getItems().get(1).getDescription());
    }
}
