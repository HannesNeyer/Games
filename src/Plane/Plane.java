package Plane;

import java.util.Scanner;

public class Plane {
    private double length;
    private double width;
    private double height;
    private double weight;
    private int altitude;
    private int capacity;
    private String model;
    private String manufacturer;
    protected Engine e1;
    protected Engine e2;
    protected Wings wl;
    protected Wings wr;
    protected FuelTank fl;
    protected FuelTank fr;
    protected Gear gear;

    public Plane(double length, double witdth, double height, double weight, int capacity, String model, String manufacturer, Engine e1, Engine e2, Wings wl, Wings wr, FuelTank fl, FuelTank fr, Gear gear) {
        this.length = length;
        this.width = witdth;
        this.height = height;
        this.weight = weight;
        this.capacity = capacity;
        this.model = model;
        this.manufacturer = manufacturer;
        this.e1 = e1;
        this.e2 = e2;
        this.fl = fl;
        this.fr = fr;
        this.gear = gear;
        this.wl = wl;
        this.wr = wr;
    }

    public void TakeOff(){
        this.wl.changeFlapsSetting();
        this.wr.setFlapsSetting(this.wl.getFlapsSetting());
        this.e1.changeEngineStatus();
        this.e2.changeEngineStatus();
        this.e1.changeThrust();
        this.e2.changeThrust();
        if(this.wl.checkAirflow() >= 160 && this.wr.checkAirflow() >= 160)
        {altitude = 200;}
        this.gear.GearSetting();

    }

    public void LevelingOff(){
        this.wl.deIceWings();
        this.wr.setHeat(this.wl.getHeat());
        this.e1.TemperatureTooHigh();
        this.e2.TemperatureTooHigh();
        this.fl.dropFuell();
        this.fr.dropFuell();
        this.wl.checkHydrolicFluid();
        this.wr.checkHydrolicFluid();
        this.wl.checkAirflow();
        this.wr.checkAirflow();
    }

    public void Land(){
        this.wl.changeFlapsSetting();
        this.wr.setFlapsSetting(this.wl.getFlapsSetting());
        this.e1.changeThrust();
        this.e2.changeThrust();
        this.wl.changeFlapsSetting();
        this.wr.setFlapsSetting(this.wl.getFlapsSetting());
        this.gear.GearSetting();

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
