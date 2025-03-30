package DRY;

public class WithoutDRYImp {

    public double calculateBurger(double quantity){
        double priceBurger = 25.5;
        double total = quantity* priceBurger;
        double tax = total* 0.1;
        return total+tax;
    }

    public double calculatePizza(double quantity){
        double pricePizza = 30;
        double total = quantity* pricePizza;
        double tax = total* 0.1;
        return total+tax;
    }

    public static void main(String[] args) {
        WithoutDRYImp order = new WithoutDRYImp();
        System.out.println(order.calculateBurger(2));
        System.out.println(order.calculatePizza(4));
    }
}
