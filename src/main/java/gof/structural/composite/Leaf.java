package gof.structural.composite;

public class Leaf implements Composite {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(name);
    }
}
