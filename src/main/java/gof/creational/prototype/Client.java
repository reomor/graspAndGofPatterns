package gof.creational.prototype;

public class Client {
    public static void main(String[] args) {
        ShapePrototype shapePrototype = new Circle(1, 2, 3);
        final ShapePrototype clone = shapePrototype.clone();
        System.out.println(shapePrototype);
        System.out.println(clone);
    }
}
