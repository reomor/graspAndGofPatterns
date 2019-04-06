package gof.creational.prototype;

public class Circle extends ShapePrototype {
    private int radius;

    public Circle() {
        super();
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public ShapePrototype clone() {
        return new Circle(this.x, this.y, this.radius);
    }
}
