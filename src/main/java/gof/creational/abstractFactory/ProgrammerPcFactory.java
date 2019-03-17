package gof.creational.abstractFactory;

public class ProgrammerPcFactory implements PcFactory {
    @Override
    public Accelerator getAccelerator() {
        return new XeonPhyCluster();
    }

    @Override
    public SystemUnit getSystemUnit() {
        return new HpcStation();
    }
}
