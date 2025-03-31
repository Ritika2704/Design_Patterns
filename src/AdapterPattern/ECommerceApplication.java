package AdapterPattern;

public class ECommerceApplication {
    public static void main(String[] args) {
        PaymentGateway paypalPayment  = new PayPalPayment();
        paypalPayment.processPayment(100.67);

        PaymentGateway stripePayment = new StripePaymentAdapter(new StripeAPI());
        stripePayment.processPayment(456.89);
    }
}

//PaymentGateway - The target interface expected by the system.
//
//PayPalPayment - Implements the expected interface.
//
//StripeAPI - Incompatible API that needs adaptation.
//
//StripePaymentAdapter - Converts Stripe's API to the PaymentGateway interface.
//
//Client (ECommerceApplication) uses both PayPal and Stripe payments seamlessly.