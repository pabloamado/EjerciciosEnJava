package edu.utn;

import edu.utn.entity.Caterpillar;
import edu.utn.entity.MekeM0;
import edu.utn.entity.Robot;
import edu.utn.entity.Tire;

public class Main {

    private final static int HP = 10;

    public static void main(String[] args) {

        // Rueda
        Tire tire = new Tire("Ruedita de goma");
        tire.setHpConsumption(1);
        tire.setReplaceCycle(100);

        //Oruga
        MekeM0 sensor = new MekeM0();
        sensor.setModel("Sensor loco");
        Caterpillar caterpillar = new Caterpillar(sensor, "Oruga loca");
        caterpillar.setHpConsumption(3);
        caterpillar.setReplaceCycle(400);

        Robot robot = new Robot("K0K0", tire, HP);
        System.out.println(robot.getFeatures());

        System.out.println("-----------------------");

        robot.setLocomotion(caterpillar);
        System.out.println(robot.getFeatures());

    }
}
