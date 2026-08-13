nterface Payment {
    void pay();
}

// UPI Payment implementation
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

// Card Payment implementation
class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Card.");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.pay();
        p2.pay();
    }
}