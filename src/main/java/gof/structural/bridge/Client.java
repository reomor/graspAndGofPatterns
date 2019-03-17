package gof.structural.bridge;

public class Client {
    public static void main(String[] args) {
        final Tv device = new Tv();
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
        basicRemote.channelDown();
        basicRemote.channelDown();
        basicRemote.volumeUp();
        basicRemote.volumeUp();
        device.printStatus();
    }
}
