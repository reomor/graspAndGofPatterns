package gof.behavioral.visitor;

public class Earth implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
