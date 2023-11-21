interface PaymentProcessor {
    void processPayment(double orderTotal);
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double orderTotal) {
        System.out.println("Processing payment through PayPal: $" + orderTotal);
        // Implement PayPal payment processing logic here
    }
}

class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double orderTotal) {
        System.out.println("Processing payment through Stripe: $" + orderTotal);
        // Implement Stripe payment processing logic here
    }
}

class Order {
    private final PaymentProcessor paymentProcessor;

    public Order(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double orderTotal) {
        System.out.println("Calculating order total: $" + orderTotal);
        paymentProcessor.processPayment(orderTotal);
    }
}
public class Main {
    public static void main(String[] args) {
        
    }
}

