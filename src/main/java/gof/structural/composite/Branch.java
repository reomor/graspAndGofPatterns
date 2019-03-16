package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Composite {
    private String name;
    private List<Composite> leafs;

    public Branch(String name) {
        this.name = name;
        leafs = new ArrayList<>();
    }

    @Override
    public void execute() {
        System.out.println(name);
        leafs.forEach(Composite::execute);
    }

    public void addLeaf(Composite composite) {
        leafs.add(composite);
    }
}
