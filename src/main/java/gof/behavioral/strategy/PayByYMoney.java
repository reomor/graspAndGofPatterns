package gof.behavioral.strategy;

import java.util.Base64;

public class PayByYMoney implements PayStrategy {
    @Override
    public String paymentDetails() {
        return "richmanr@ya.ru:" + Base64.getEncoder().encodeToString("richmanr@ya.ru".getBytes());
    }

    @Override
    public boolean pay(int price) {
        if (price < 1000) {
            System.out.println("Paid: $" + price + "");
            return true;
        }
        return false;
    }
}
