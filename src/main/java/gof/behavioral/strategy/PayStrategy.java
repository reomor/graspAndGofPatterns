package gof.behavioral.strategy;

public interface PayStrategy {
    String paymentDetails();

    boolean pay(int price);
}
