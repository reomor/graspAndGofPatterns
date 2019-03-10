package gof.behavioral.command;

public class DevelopCommand implements Command {
    private CodeRepository codeRepository;

    public DevelopCommand(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
    }

    @Override
    public void execute() {
        codeRepository.commit();
    }
}
