package gof.behavioral.command;

// Receiver
public class CodeRepository {
    public void commit() {
        System.out.println("committed");
    }
    public void review() {
        System.out.println("reviewed");
    }
}
