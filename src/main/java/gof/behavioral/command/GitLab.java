package gof.behavioral.command;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

// Invoker
public class GitLab {
    private final Deque<Command> history;
    private final CodeRepository codeRepository;

    public GitLab() {
        history = new LinkedList<>();
        codeRepository = new CodeRepository();
    }

    public CodeRepository getRepository() {
        return codeRepository;
    }

    public void storeAndExecute(Command command) {
        this.history.add(command);
        command.execute();
    }

    public Collection<Command> getHistory() {
        return Collections.unmodifiableCollection(history);
    }

    public void clearHistory() {
        history.clear();
    }
}
