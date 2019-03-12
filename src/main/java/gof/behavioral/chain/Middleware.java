package gof.behavioral.chain;

// Handler
public interface Middleware {
    Middleware setNext(Middleware middleware);

    boolean check(String email, String password);

    boolean checkNext(String email, String password);
}
