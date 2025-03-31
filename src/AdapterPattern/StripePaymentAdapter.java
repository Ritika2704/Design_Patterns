package AdapterPattern;

public class StripePaymentAdapter implements PaymentGateway{
    StripeAPI stripeAPI;

    public StripePaymentAdapter(StripeAPI stripeAPI){
        this.stripeAPI = stripeAPI;
    }
    @Override
    public void processPayment(double amount) {
        // Adapting Stripe's method to match the PaymentGateway interface
        stripeAPI.makePayment(amount);
    }
}
