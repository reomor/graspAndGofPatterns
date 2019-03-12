package gof.behavioral.visitor;

public class Shaman implements Visitor {
    @Override
    public void visit(Air air) {
        System.out.println("Take air");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Take earth");
    }

    @Override
    public void visit(Fire fire) {
        System.out.println("Take fire");
    }

    @Override
    public void visit(Water water) {
        System.out.println("Take water");
    }
}
