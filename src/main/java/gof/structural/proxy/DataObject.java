package gof.structural.proxy;

public class DataObject {
    private final int id;
    private final Object payload;

    public DataObject(int id, Object payload) {
        this.id = id;
        this.payload = payload;
    }

    public int getId() {
        return id;
    }

    public Object getPayload() {
        return payload;
    }
}
