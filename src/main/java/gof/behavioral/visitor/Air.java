package gof.behavioral.visitor;

public class Air implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
