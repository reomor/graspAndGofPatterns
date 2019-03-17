package gof.structural.composite;

public class Client {
    public static void main(String[] args) {
        Branch root = new Branch("root");
        Branch branch1 = new Branch("branch1");
        Branch branch2 = new Branch("branch2");
        branch1.addLeaf(new Branch("branch11"));
        branch2.addLeaf(new Leaf("leaf21"));
        Branch branch22 = new Branch("branch21");
        branch2.addLeaf(branch22);
        root.addLeaf(branch1);
        root.addLeaf(branch2);

        root.execute();
    }
}
