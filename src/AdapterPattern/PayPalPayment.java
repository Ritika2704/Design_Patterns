package AdapterPattern;

public class PayPalPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
