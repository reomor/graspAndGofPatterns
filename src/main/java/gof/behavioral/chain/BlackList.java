package gof.behavioral.chain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackList {
    private Map<String, Boolean> blackList = new HashMap<>();

    public Map<String, Boolean> get() {
        return Collections.unmodifiableMap(blackList);
    }

    public void addTo(String email) {
        this.blackList.put(email, true);
    }

    public void removeFrom(String email) {
        this.blackList.remove(email);
    }

    public boolean isBlacklisted(String email) {
        return blackList.getOrDefault(email, false);
    }
}
