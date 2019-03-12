package gof.behavioral.command;

public class ReviewCommitsCommand implements Command {
    private CodeRepository codeRepository;
    private Integer priority;

    public ReviewCommitsCommand(CodeRepository codeRepository, Integer priority) {
        this.codeRepository = codeRepository;
        this.priority = priority;
    }

    @Override
    public void execute() {
        codeRepository.review();
    }
}
