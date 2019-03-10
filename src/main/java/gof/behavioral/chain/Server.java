package gof.behavioral.chain;

public class Server {
    private Middleware middleware;

    public Server(Middleware middleware) {
        this.middleware = middleware;
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization successful");
            return true;
        }
        return false;
    }
}
