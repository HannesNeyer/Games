package Plane;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    private double thrust;
    private String manufacturerEngine;
    private double weightEngine;
    private double lengthEngine;
    private double heightEngine;
    private String modelEngine;
    private double heatInsideEngine;
    private boolean EngineON;
    private int EngineIdentification;
    Scanner scannerEngineThrust;
    Scanner scannerQuestionEngineThrust;

    public Engine(double thrust, String manufacturerEngine, double weightEngine, double lengthEngine, double heightEngine, String modelEngine, boolean engineON, int engineIdentification) {
        this.thrust = thrust;
        this.manufacturerEngine = manufacturerEngine;
        this.weightEngine = weightEngine;
        this.lengthEngine = lengthEngine;
        this.heightEngine = heightEngine;
        this.modelEngine = modelEngine;
        this.EngineON = engineON;
        this.EngineIdentification = engineIdentification;
        scannerEngineThrust = new Scanner(System.in);
        scannerQuestionEngineThrust = new Scanner(System.in);
    }

    void changeEngineStatus(){
        if(this.EngineON == true) {
            this.EngineON = false;
            this.thrust = 0;
        }
        else
        {
            this.EngineON = true;
            this.thrust = 20;
        }
    }

    double changeThrust(){
        System.out.println("Current thrust setting is: " + this.thrust);
        System.out.print("Enter new thrust setting: ");
        this.thrust = scannerEngineThrust.nextInt();
        System.out.println("Current thrust setting is: " + this.thrust);
        scannerEngineThrust.nextLine(); //empty Buffer
        return this.thrust;
    }

    void TemperatureTooHigh(){
        Random doesA_FireBreakOut = new Random(50);
        String AnswerPilot = "";
        int fire = doesA_FireBreakOut.nextInt();

        if(fire == 25){
            this.heatInsideEngine = 2000;
            String Warning = String.format("Engine number %d is experiencing extensive heat of %f C°. \n Recommending lower thrust setting",this.EngineIdentification, heatInsideEngine);
            System.out.print(Warning);
            System.out.println("Do you want to change the thrust setting?(Yes/No)");
            AnswerPilot = scannerQuestionEngineThrust.nextLine();

            if(AnswerPilot == "Yes")
            changeThrust();
        }
        scannerQuestionEngineThrust.nextLine();
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public String getManufacturerEngine() {
        return manufacturerEngine;
    }

    public void setManufacturerEngine(String manufacturerEngine) {
        this.manufacturerEngine = manufacturerEngine;
    }

    public double getWeightEngine() {
        return weightEngine;
    }

    public void setWeightEngine(double weightEngine) {
        this.weightEngine = weightEngine;
    }

    public double getLengthEngine() {
        return lengthEngine;
    }

    public void setLengthEngine(double lengthEngine) {
        this.lengthEngine = lengthEngine;
    }

    public double getHeightEngine() {
        return heightEngine;
    }

    public void setHeightEngine(double heightEngine) {
        this.heightEngine = heightEngine;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public double getHeatInsideEngine() {
        return heatInsideEngine;
    }

    public void setHeatInsideEngine(double heatInsideEngine) {
        this.heatInsideEngine = heatInsideEngine;
    }

    public boolean isEngineON() {
        return EngineON;
    }

    public void setEngineON(boolean engineON) {
        EngineON = engineON;
    }

    public int getEngineIdentification() {
        return EngineIdentification;
    }

    public void setEngineIdentification(int engineIdentification) {
        EngineIdentification = engineIdentification;
    }
}
