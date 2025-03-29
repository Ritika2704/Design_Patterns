package WithoutStrategyPattern;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        //different drive logic
        System.out.println("sports drive capability");
    }


}
//offRoad and sports vehicle me same drive functionality copy ho rhi h
//to yeh redundancy htane k liye hume Strategy Pattern use krna pdega