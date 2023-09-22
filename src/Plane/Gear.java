package Plane;

import java.util.Scanner;

public class Gear {
    private enum gearSetting{Down, Up};
    private gearSetting actualSetting = gearSetting.Down;
    Scanner scannerChoseGearSetting;

    public Gear() {
         scannerChoseGearSetting = new Scanner(System.in);
    }

    void GearSetting(){
        int choosenGearSetting;
        System.out.println("1 Um das Fahrgestell herabzulassen. \n 2 Um es hochzufahren");
        choosenGearSetting = scannerChoseGearSetting.nextInt();
        if(choosenGearSetting == 1){
            this.actualSetting = gearSetting.Down;
            System.out.println("Gear setting down");
        }
        else {
            this.actualSetting = gearSetting.Up;
            System.out.println("Gear setting up");
        }
    }

    public gearSetting getActualSetting() {
        return actualSetting;
    }

    public void setActualSetting(gearSetting actualSetting) {
        this.actualSetting = actualSetting;
    }
}
