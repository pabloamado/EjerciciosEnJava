package com.company.actividades;

public class Tv extends HomeAppliance{
    private boolean smart;
    private boolean led;
    private boolean lcd;


    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
        lcd=false;
        led=false;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
        lcd=false;
        smart=false;
    }

    public boolean isLcd() {
        return lcd;
    }

    public void setLcd(boolean lcd) {
        this.lcd = lcd;
        led=false;
        smart=false;
    }


}

