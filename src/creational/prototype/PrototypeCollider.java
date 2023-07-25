package creational.prototype;

/**
* Для создания копий заданного объекта.
* Данный шаблон так же реализует интерфейс Cloneable
* */
public class PrototypeCollider {

    public static void main(String[] args) {
        Project project = new Project(1, "ProjectName", "ProjectSourceCode");

        System.out.println(project);

        System.out.println("\n====================================\n");

        Project projectCopy = project.copy();

        System.out.println(projectCopy);
    }
}
