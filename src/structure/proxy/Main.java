package structure.proxy;

import structure.proxy.project.Project;
import structure.proxy.proxy_project.ProxyProject;

/**
 * Решает проблемы связанные с контролируемым доступом к объекту.
 * Позволяет изменять/дополнять логику работы объекта, не изменяя сам объект.
 * В нашем случае делаем с помощью прокси отложенную загрузку.
 * */
public class Main {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com");

        project.run();
    }
}
