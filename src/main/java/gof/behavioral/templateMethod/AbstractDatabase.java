package gof.behavioral.templateMethod;

public abstract class AbstractDatabase {
    private final String connectionString;

    protected AbstractDatabase(String connectionString) {
        this.connectionString = connectionString;
    }

    public abstract void connect();

    public void doGeneral() {
        connect();
        System.out.println("Do general method");
    }

    public String getConnectionString() {
        return connectionString;
    }
}
