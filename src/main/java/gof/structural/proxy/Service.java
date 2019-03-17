package gof.structural.proxy;

public class Service implements ServiceInterface {
    @Override
    public void putObject(DataObject object) {
        System.out.println("Put object(id=" + object.getId() + ") in DB");
    }

    @Override
    public DataObject getObject(int id) {
        System.out.println("Get object(id=" + id + ") from DB");
        return new DataObject(id, new Object());
    }
}
