package gof.behavioral.visitor;

public class Researcher implements Visitor {
    @Override
    public void visit(Air air) {
        System.out.println("suffocated");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("fall into a hole");
    }

    @Override
    public void visit(Fire fire) {
        System.out.println("burn out");
    }

    @Override
    public void visit(Water water) {
        System.out.println("drown");
    }
}
