package gof.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private Visitor visitor;
    private List<Element> elements = new ArrayList<>();

    public Universe(Visitor visitor) {
        this.visitor = visitor;
        elements.add(new Air());
        elements.add(new Earth());
        elements.add(new Fire());
        elements.add(new Water());
    }

    public void actLikeATiger() {
        elements.forEach(element ->
                element.accept(this.visitor));
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
