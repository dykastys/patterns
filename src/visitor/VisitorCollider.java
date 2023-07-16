package visitor;

import visitor.managers.BackendManager;
import visitor.managers.FrontendManager;
import visitor.managers.Manager;
import visitor.visit_entities.ManagerVisitor;
import visitor.visit_entities.ManagerVisitorImpl;

import java.util.Arrays;
import java.util.List;

/**
* Шаблон Visitor используется для посещения классом Visitor группы объектов без их изменения
* */
public class VisitorCollider {

    public static void main(String[] args) {
        Manager backManager = new BackendManager();
        Manager frontManager = new FrontendManager();

        ManagerVisitor visitor = new ManagerVisitorImpl(addManagersToList(backManager, frontManager));

        createManagerThreadsAndStart(backManager, frontManager);

        Helper.sleepRandomFiveSecond();

        System.out.println(visitor.getDataForManagers());
    }

    private static List<Manager> addManagersToList(Manager...managers) {
        return Arrays.stream(managers).toList();
    }

    private static void createManagerThreadsAndStart(Manager...managers) {
        for (Manager manager : managers) {
            Thread managerThread = new Thread((Runnable) manager);
            managerThread.start();
        }
    }
}
