package gof.creational.abstractFactory;

public class CudaCluster implements Accelerator {
    @Override
    public void assemble() {
        System.out.println("Add Cuda cluster");
    }
}
