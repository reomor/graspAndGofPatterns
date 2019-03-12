package gof.behavioral.templateMethod;

public class PostgresDatabase extends AbstractDatabase {

    public PostgresDatabase(String connectionString) {
        super(connectionString);
    }

    @Override
    public void connect() {
        System.out.println("Connect Postgres db: " + super.getConnectionString());
    }
}
