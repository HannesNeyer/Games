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
    protected Engine engine;
    protected Wings wings;
    protected FuelTank fuelTank;
    protected Gear gear;

    public Plane(double length, double witdth, double height, double weight, int capacity, String model, String manufacturer, Engine engine1, Engine engine2, Wings wings1, Wings wings2, FuelTank fuelTank1, FuelTank fuelTank2, Gear gear) {
        this.length = length;
        this.width = witdth;
        this.height = height;
        this.weight = weight;
        this.capacity = capacity;
        this.model = model;
        this.manufacturer = manufacturer;
        this.engine = engine1;
        this.fuelTank = fuelTank1;
        this.gear = gear;
    }

    public void TakeOff(){
        this.wings.changeFlapsSetting();
        this.engine.changeEngineStatus();
        this.engine.changeThrust();
        if(this.wings.checkAirflow() >= 160)
        {altitude += 1;}
        if(altitude > 200){
            this.gear.GearSetting();
        }
    }

    public void LevelingOff(){
        this.wings.deIceWings();
        this.engine.TemperatureTooHigh();
        this.fuelTank.dropFuell();
        this.wings.checkHydrolicFluid();
        this.wings.checkAirflow();
    }

    public void Land(){
        this.wings.changeFlapsSetting();
        this.engine.changeThrust();
        this.wings.changeFlapsSetting();
        this.gear.GearSetting();
        if(altitude >= 0)
        {altitude -= 1;}
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
