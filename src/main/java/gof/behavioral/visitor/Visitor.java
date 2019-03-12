package gof.behavioral.visitor;

public interface Visitor {
    void visit(Air air);
    void visit(Earth earth);
    void visit(Fire fire);
    void visit(Water water);
}
