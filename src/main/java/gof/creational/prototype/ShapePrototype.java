package gof.creational.prototype;

public abstract class ShapePrototype {
    protected int x;
    protected int y;

    public ShapePrototype() {
    }

    public ShapePrototype(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ShapePrototype(ShapePrototype target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
        }
    }

    public abstract ShapePrototype clone();
}
