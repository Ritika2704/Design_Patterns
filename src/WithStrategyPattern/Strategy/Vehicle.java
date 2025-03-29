package WithStrategyPattern.Strategy;

public class Vehicle {
    DriveStrategy driveObj;   // we are making it dynamic
                                // agar hum new kr k object bnate to huma sub object ek ek baar bnani pdti

    // this id known as constructor injection
    Vehicle(DriveStrategy driveObject){
        this.driveObj = driveObject;
    }

    public void drive(){
        driveObj.drive();
    }
}
