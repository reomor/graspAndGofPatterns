package gof.behavioral.strategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public String paymentDetails() {
        return null;
    }

    @Override
    public boolean pay(int price) {
        System.out.println("Paid: + $" + price + "");
        return true;
    }
}
