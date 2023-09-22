package Plane;

public class FuelTank {
    private double currentFuelAmount;
    private int capacity;

    private double currentFuelWeight;

    public FuelTank(double currentFuelAmount, int capacity, double currentFuelWeight) {
        this.currentFuelAmount = currentFuelAmount;
        this.capacity = capacity;
        this.currentFuelWeight = currentFuelWeight;
    }

    void dropFuell(){
        this.currentFuelAmount -= 5;
        this.currentFuelWeight -= 5;
    }

    void FuelUsage(){
        this.currentFuelAmount -= 5;
        this.currentFuelWeight -= 5;
    }

    public double getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void setCurrentFuelAmount(double currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCurrentFuelWeight() {
        return currentFuelWeight;
    }

    public void setCurrentFuelWeight(double currentFuelWeight) {
        this.currentFuelWeight = currentFuelWeight;
    }
}
