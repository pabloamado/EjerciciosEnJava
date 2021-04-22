package edu.utn.entity;

public class Caterpillar extends Locomotion {

    private MekeM0 sensor;

    public Caterpillar(MekeM0 sensor, String type) {
        super(type);
        setSensor(sensor);
    }

    public MekeM0 getSensor() {
        return sensor;
    }

    public void setSensor(MekeM0 sensor) {
        this.sensor = sensor;
    }

    public String getFeatures() {
        String features = super.getFeatures();
        features += "\nSensor: " + getSensor().getModel();
        return features;
    }
}
