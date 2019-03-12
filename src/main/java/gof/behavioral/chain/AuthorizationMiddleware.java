package gof.behavioral.chain;

public class AuthorizationMiddleware extends BaseMiddleware {
    @Override
    public boolean check(String email, String password) {
        if (!("admin".equals(email) && "admin".equals(password))) {
            return false;
        }
        return checkNext(email, password);
    }
}
