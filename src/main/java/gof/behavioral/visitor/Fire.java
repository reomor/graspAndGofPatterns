package gof.behavioral.visitor;

public class Fire implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
