package gof.creational.abstractFactory;

public class HpcStation implements SystemUnit {
    @Override
    public void assemble() {
        System.out.println("Add hpc system unit");
    }
}
