package WithStrategyPattern.Strategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
