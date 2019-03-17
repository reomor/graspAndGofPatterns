package gof.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
       Application application = new Application(new ProgrammerPcFactory());
       application.assemblePc();
    }
}

class Application {
    private Accelerator accelerator;
    private SystemUnit systemUnit;

    public Application(PcFactory factory) {
        this.accelerator = factory.getAccelerator();
        this.systemUnit = factory.getSystemUnit();
    }

    public void assemblePc() {
        accelerator.assemble();
        systemUnit.assemble();
    }
}