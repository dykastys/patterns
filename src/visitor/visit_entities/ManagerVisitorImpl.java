package visitor.visit_entities;

import visitor.managers.Manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerVisitorImpl implements ManagerVisitor {

    private final List<Manager> managers;

    public ManagerVisitorImpl(List<Manager> managers) {
        this.managers = managers;
    }

    @Override
    public Map<String,String> getDataForManagers() {
        Map<String,String> dataMap = new HashMap<>();

        for(Manager manager : managers) {
            dataMap.put(manager.getClass().getName(), manager.getManageString());
        }

        return dataMap;
    }
}
