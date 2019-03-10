package gof.behavioral.command;

public class Client {
    public static void main(String[] args) {
        GitLab gitLab = new GitLab();
        Command commit = new DevelopCommand(gitLab.getRepository());
        Command review = new ReviewCommitsCommand(gitLab.getRepository(), 100);
        gitLab.storeAndExecute(commit);
        gitLab.storeAndExecute(review);
        gitLab.storeAndExecute(commit);
        gitLab.storeAndExecute(commit);
        gitLab.storeAndExecute(review);
    }
}
