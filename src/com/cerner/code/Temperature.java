package com.cerner.code;

public class Temperature {

    private double fTemp;

    public Temperature() {
    }

    public Temperature(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getfTemp() {
        return fTemp;
    }

    public void setfTemp(double fTemp) {
        this.fTemp = fTemp;
    }
    public double getCelcius() {
        return fTemp;
    }
    public double getKelvin() {
        return fTemp;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "fTemp=" + fTemp +
                '}';
    }
}
