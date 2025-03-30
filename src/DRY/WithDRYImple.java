package DRY;

public class WithDRYImple {

    public double calculatePrice(int quantity, double pricePerItem){
        double total = quantity* pricePerItem;
        double tax = total* 0.5;
        return total+tax;
    }

    public static void main(String[] args) {
        WithDRYImple foodOrder = new WithDRYImple();
        System.out.println("Burger Prize: "+ foodOrder.calculatePrice(2, 34.7));
        System.out.println("Pizza Prize: "+ foodOrder.calculatePrice(4, 89.9));
    }

}
