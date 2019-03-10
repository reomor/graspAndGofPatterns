package gof.behavioral.chain;

public class Client {
    public static void main(String[] args) {
        BlackList blackList = new BlackList();
        Middleware middleware = new BlackListMiddleware(blackList);
        middleware.setNext(new AuthorizationMiddleware());
        Server server = new Server(middleware);
        server.logIn("admin", "admin");
        server.logIn("admin", "admin2");
        server.logIn("admin2", "admin2");
    }
}
