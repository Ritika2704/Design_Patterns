package ExampleOfAbstractClassesAndInterfaces.AbstractExample;

//Imagine we are designing a payment processing system that supports different payment methods:
//💳 Credit Card
//📱 UPI (Unified Payments Interface)
//
//Abstract Class Approach
//An abstract class is useful when different payment methods share some common behavior but also have specific implementations.


abstract class Payment{
    double amount;

    public Payment(double amount){
        this.amount = amount;
    }
    abstract void makePayment();

    public void showAmount(){
        System.out.println(" Payment amount: "+ amount);
    }
}

class CreditCardPayment extends Payment{
    String cardNumber;

    public CreditCardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment() {
        System.out.println("Processing Credit card "+ amount +" with card number "+ cardNumber );

    }
}

class UpiPayment extends Payment{
    String UpiId;

    public UpiPayment(double amount, String upiId){
        super(amount);
        this.UpiId = upiId;
    }

    @Override
    void makePayment() {
        System.out.println("Processing Upi Id of "+ amount + "Upi Id "+ UpiId);
    }
}
public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(500.0, "2347-789-6789");
        p1.makePayment();
        p1.showAmount();

        Payment p2 = new UpiPayment(860.0, "ritika@ybl");
        p2.makePayment();
        p2.showAmount();
    }
}

// Why Use Abstract Class Here?
//  Common functionality (showAmount()) is defined in the abstract class.
//✅ Different payment methods (CreditCardPayment & UpiPayment) have their own implementations of makePayment().
//✅ Code reusability is achieved while keeping flexibility.