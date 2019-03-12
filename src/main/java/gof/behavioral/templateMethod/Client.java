package gof.behavioral.templateMethod;

public class Client {
    public static void main(String[] args) {
        AbstractDatabase postgresDatabase = new PostgresDatabase("postgres:user:password:db");
        postgresDatabase.doGeneral();
        AbstractDatabase mongodbDatabase = new MongodbDatabase("mongodb:user:password:db");
        mongodbDatabase.doGeneral();
    }
}
