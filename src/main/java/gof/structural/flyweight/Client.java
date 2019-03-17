package gof.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();
        final int MAX_TREE_AMOUNT = 10;
        for (int i = 0; i < MAX_TREE_AMOUNT; i++) {
            for (int j = i; j < MAX_TREE_AMOUNT; j++) {
                if ((i + j) % 2 == 0) {
                    forest.plantTree(i, j, "Oak", "Other tree data");
                } else {
                    forest.plantTree(i, j, "Birch tree", "Another one tree data");
                }
            }
        }
        forest.draw();
    }
}
