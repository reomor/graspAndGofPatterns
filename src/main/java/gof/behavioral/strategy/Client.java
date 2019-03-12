package gof.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Please, select payment method:" + "\n"
                    + "1 - Y Money" + "\n"
                    + "2 - Card" + "\n");
            try {
                int choice = Integer.parseInt(reader.readLine());
                switch (choice % 2) {
                    case 0:
                        order.setStrategy(new PayByCreditCard());
                        break;
                    case 1:
                        order.setStrategy(new PayByYMoney());
                        break;
                }
                break;
            } catch (IOException | NumberFormatException ignore) {
                //e.printStackTrace();
            }
        } while (true);
        order.getPaymentInformationAndPay(999);
    }
}
