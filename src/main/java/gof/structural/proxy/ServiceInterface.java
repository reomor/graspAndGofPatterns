package gof.structural.proxy;

public interface ServiceInterface {
    void putObject(DataObject object);
    DataObject getObject(int id);
}
