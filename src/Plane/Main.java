package Plane;

public class Main {
    public static void main(String[] argv){
        Engine e1 = new Engine(0,"EngineAlliance", 4,0.845,0.2,"GP7200",false,1);
        Engine e2 = new Engine(0,"EngineAlliance", 4,0.845,0.2,"GP7200",false,2);
        Wings wl = new Wings(0,40,2,0.5,"Wing Left");
        Wings wr = new Wings(0,40,2,0.5, "Wing Right");
        FuelTank fl = new FuelTank(10000,12000,20);
        FuelTank fr = new FuelTank(9000,12000,18);
        Gear gear = new Gear();

        Plane A380 = new Plane(73,80,24,560,520,"A380","Airbus",
                e1,e2,wl,wr,fl,fr,gear);

        A380.TakeOff();
        A380.LevelingOff();
        A380.Land();
    }
}
