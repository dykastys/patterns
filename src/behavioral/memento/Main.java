package behavioral.memento;

/**
 * Хранитель используется для сохранения, фиксирования и восстановления внутреннего состояние объекта не нарушая инкапсуляцию.
 * */
public class Main {

    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo repo = new GitHubRepo();

        System.out.println("Creating project version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to gitHub...");
        repo.setSaver(project.save());

        System.out.println("Updating project... Version 1.1");
        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Rollback project version...");

        project.load(repo.getSaver());

        System.out.println(project);
    }
}
