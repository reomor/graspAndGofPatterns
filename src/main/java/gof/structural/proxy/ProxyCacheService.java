package gof.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCacheService implements ServiceInterface {
    private final ServiceInterface service;
    private final Map<Integer, DataObject> cache = new HashMap<>();

    public ProxyCacheService(ServiceInterface service) {
        this.service = service;
    }

    @Override
    public void putObject(DataObject object) {
        service.putObject(object);
    }

    @Override
    public DataObject getObject(int id) {
        if (cache.containsKey(id)) {
            System.out.println("Get object(id=" + id + ") from cache");
            return cache.get(id);
        }
        final DataObject object = service.getObject(id);
        System.out.println("Get object(id=" + id + ") from DB and put in cache");
        cache.put(object.getId(), object);
        return object;
    }
}
