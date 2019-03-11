package gof.behavioral.strategy;

// Context
public class Order {
    PayStrategy strategy;

    public Order() {
    }

    public Order(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean getPaymentInformationAndPay(int price) {
        if (this.strategy.paymentDetails() != null) {
            System.out.println("Paying...");
            return this.strategy.pay(price);
        } else {
            System.out.println("Smth wrong with payment");
        }
        return false;
    }
}
