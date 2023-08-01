package behavioral.memento;

public class GitHubRepo {

    private ProjectSaver saver;

    public ProjectSaver getSaver() {
        return saver;
    }

    public void setSaver(ProjectSaver saver) {
        this.saver = saver;
    }
}
