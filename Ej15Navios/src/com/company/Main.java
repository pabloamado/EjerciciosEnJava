package com.company;

import com.company.actividades.BattleShip;
import com.company.actividades.Destroyer;
import com.company.actividades.HospitalShip;
import com.company.actividades.MotorBoat;

public class Main {

    public static void main(String[] args) {

        BattleShip acorazado=new BattleShip("Tortuga",2000,1500,50,"v8",50000,100,"titanio");
        Destroyer destructor=new Destroyer("Destructor",1000,750,60,"v10",100000,50,150);

        MotorBoat gaucho=new MotorBoat("El gaucho",100,100,80,"v1",2);
        MotorBoat gaucha=new MotorBoat("La gaucha",120,120,85,"v2",3);

        HospitalShip hospital=new HospitalShip("Ambulancia",500,500,70,"v5",4000);

        System.out.println(acorazado.getShipDescription());
        System.out.println(destructor.getShipDescription());
        System.out.println(gaucho.getShipDescription());
        System.out.println(gaucha.getShipDescription());
        System.out.println(hospital.getShipDescription());
    }
}
