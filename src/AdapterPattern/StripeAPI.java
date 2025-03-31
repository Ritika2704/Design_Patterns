package AdapterPattern;
//Third-Party Stripe API (Incompatible API)
public class StripeAPI {
    public void makePayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
