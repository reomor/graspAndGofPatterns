package gof.creational.abstractFactory;

public class XeonPhyCluster implements Accelerator {
    @Override
    public void assemble() {
        System.out.println("Add Xeon-Phi cluster");
    }
}
