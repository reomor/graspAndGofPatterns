package gof.structural.flyweight;

public class TreeType {
    private String name;
    private String otherTreeData;

    public TreeType(String name, String otherTreeData) {
        this.name = name;
        this.otherTreeData = otherTreeData;
    }

    public void draw(int x, int y) {
        System.out.println(String.format("Drawn a tree %s with x=%d y=%d", name, x, y));
    }
}
