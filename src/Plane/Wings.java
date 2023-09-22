package Plane;

import org.newdawn.slick.tests.SoundTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Wings {
    private int flapsSetting = 0;
    private double hydrolicLevels = 200.00;
    private double length;
    private double width;
    private double heigth;
    private double heat;
    private double airFlow = 800;
    ArrayList<Integer> PossibleFlapSettings;
    Scanner scannerChoseFlaps;
    Scanner ActivateDeIce;

    public Wings(int flapsSetting, double length, double width, double heigth) {
        this.flapsSetting = flapsSetting;
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        PossibleFlapSettings = new ArrayList<Integer>();
        scannerChoseFlaps = new Scanner(System.in);
        ActivateDeIce = new Scanner(System.in);
    }

    void changeFlapsSetting(){
        int chosenFlaps = 0;
        int ArrayFill = 0;

        for(int i = 0; i < 9; i++){
            PossibleFlapSettings.add(ArrayFill);
            ArrayFill =+ 5;
        }

        System.out.println("Geben Sie eine der folgenden Einstellungen ein. (Nur diese werden angenommen)" + PossibleFlapSettings.toString());
        for(int i = 0; i < 9; i++) {
            if (scannerChoseFlaps.nextInt() == PossibleFlapSettings.get(i))
                chosenFlaps = scannerChoseFlaps.nextInt();
                System.out.println("New flap setting is: " + chosenFlaps);
        }
    }

    void deIceWings(){
        int AnswerDeIce;
        System.out.println("Do you want to activate Deice on the wings? \n 1 for Yes \n 2 for no");
        AnswerDeIce = ActivateDeIce.nextInt();
        if(AnswerDeIce == 1) {
            this.heat = 20;
        }
    }

    void checkHydrolicFluid(){
        System.out.println(hydrolicLevels);
        if(this.hydrolicLevels < 50){
            System.out.println("Hydrolic fluid is dangerously low. Land as soon as possible");
        }
    }

    double checkAirflow(){
        System.out.println(airFlow);
        if(this.airFlow < 200){
            System.out.println("Stall warning!!!");
        }
        return this.airFlow;
    }

    public int getFlapsSetting() {
        return flapsSetting;
    }

    public void setFlapsSetting(int flapsSetting) {
        this.flapsSetting = flapsSetting;
    }

    public double getHydrolicLevels() {
        return hydrolicLevels;
    }

    public void setHydrolicLevels(double hydrolicLevels) {
        this.hydrolicLevels = hydrolicLevels;
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

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
    }

    public double getAirFlow() {
        return airFlow;
    }

    public void setAirFlow(double airFlow) {
        this.airFlow = airFlow;
    }
}