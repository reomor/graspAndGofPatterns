package gof.behavioral.visitor;

public class Water implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
