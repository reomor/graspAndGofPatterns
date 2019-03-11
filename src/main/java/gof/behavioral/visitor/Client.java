package gof.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Universe universe = new Universe(new Researcher());
        universe.actLikeATiger();
        universe.setVisitor(new Shaman());
        universe.actLikeATiger();
    }
}
