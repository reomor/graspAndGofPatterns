package gof.behavioral.templateMethod;

public class MongodbDatabase extends AbstractDatabase {

    public MongodbDatabase(String connectionString) {
        super(connectionString);
    }

    @Override
    public void connect() {
        System.out.println("Connect Mongo db: " + super.getConnectionString());
    }
}
