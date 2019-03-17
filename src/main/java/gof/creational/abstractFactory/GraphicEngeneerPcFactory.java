package gof.creational.abstractFactory;

public class GraphicEngeneerPcFactory implements PcFactory {
    @Override
    public Accelerator getAccelerator() {
        return new CudaCluster();
    }

    @Override
    public SystemUnit getSystemUnit() {
        return new GraphicStation();
    }
}
