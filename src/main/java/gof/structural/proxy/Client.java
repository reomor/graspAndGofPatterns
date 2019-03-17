package gof.structural.proxy;

public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new Service();
        ServiceInterface proxyService = new ProxyCacheService(service);
        final DataObject object = proxyService.getObject(1);
        final DataObject object1 = proxyService.getObject(object.getId());
    }
}
