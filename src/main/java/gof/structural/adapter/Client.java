package gof.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new FootAdapter(new MeterService());
        System.out.println(adapter.getLength(10));
    }
}
