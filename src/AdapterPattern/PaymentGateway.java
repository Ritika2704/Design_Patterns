package AdapterPattern;

//Your e-commerce platform initially supported PayPal payments with a standard interface. Now, you need to integrate a new payment provider, Stripe, which has a different API structure. However, you don’t want to modify your existing system heavily.
//
//Solution Using Adapter Pattern
//We create an adapter that translates the requests from the e-commerce platform into a format that Stripe understands.

public interface PaymentGateway {
    void processPayment(double amount);

}
