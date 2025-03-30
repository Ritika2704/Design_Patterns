package ExampleOfAbstractClassesAndInterfaces.InterfaceExample;

//Now, let’s assume our system requires more flexibility, and payments might involve multiple unrelated classes (e.g., Digital Wallets, PayPal, etc.).
//Since Java supports multiple interface implementations, an interface is a better choice.

interface Payment{
    void makePayment();
}

class CreditCard implements Payment {
    double amount;
    String cardNumber;

    public CreditCard(double amount, String cardNumber){
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card: " + cardNumber);
    }
}

// UPI Payment Implementation
class UpiPayment implements Payment {
    double amount;
    String upiId;

    public UpiPayment(double amount, String upiId) {
        this.amount = amount;
        this.upiId = upiId;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing UPI Payment of $" + amount + " using UPI ID: " + upiId);
    }
}

// Digital Wallet Payment Implementation
class DigitalWalletPayment implements Payment {
    double amount;
    String walletName;

    public DigitalWalletPayment(double amount, String walletName) {
        this.amount = amount;
        this.walletName = walletName;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing Digital Wallet Payment of $" + amount + " using Wallet: " + walletName);
    }
}

// Main Class to Test the Implementation

public class PaymentDemoInterface {
    public static void main(String[] args) {
    Payment payment1 = new CreditCard(500.0, "1234-5678-9012-3456");
        payment1.makePayment();

    Payment payment2 = new UpiPayment(300.0, "alice@upi");
        payment2.makePayment();

    Payment payment3 = new DigitalWalletPayment(200.0, "PayPal");
        payment3.makePayment();
}
}

//Why Use Interface Here?
//✅ Allows multiple payment types (CreditCard, UPI, Digital Wallet, etc.)
//✅ Supports multiple inheritance (e.g., a class can implement both Payment and Refundable)
//✅ Better for future extensions (e.g., adding Cryptocurrency payments)

