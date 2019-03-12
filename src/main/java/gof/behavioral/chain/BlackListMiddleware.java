package gof.behavioral.chain;

public class BlackListMiddleware extends BaseMiddleware {
    private BlackList blackList;

    public BlackListMiddleware(BlackList blackList) {
        this.blackList = blackList;
    }

    @Override
    public boolean check(String email, String password) {
        if(blackList.isBlacklisted(email)) {
            System.out.println("Blacklisted");
            return false;
        }
        return checkNext(email, password);
    }
}
