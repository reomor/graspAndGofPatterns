package gof.behavioral.chain;

// Base Handler
public abstract class BaseMiddleware implements Middleware {
    private Middleware next;

    @Override
    public Middleware setNext(Middleware middleware) {
        this.next = middleware;
        return next;
    }

    @Override
    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
