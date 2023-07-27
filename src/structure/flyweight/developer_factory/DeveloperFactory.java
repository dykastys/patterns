package structure.flyweight.developer_factory;

import structure.flyweight.developer.CppDeveloper;
import structure.flyweight.developer.Developer;
import structure.flyweight.developer.JavaDeveloper;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private final Map<Speciality, Developer> developers;

    public DeveloperFactory() {
        developers = new HashMap<>();
    }

    public Developer getDeveloperBySpeciality(Speciality speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            System.out.println("Developer hired...");
            developer = createDeveloperBySpeciality(speciality);
            developers.put(speciality, developer);
        }
        return developer;
    }

    private Developer createDeveloperBySpeciality(Speciality speciality) {
        Developer developer = null;

        switch (speciality) {
            case CPP -> developer = new CppDeveloper();
            case JAVA -> developer = new JavaDeveloper();
        }
        return developer;
    }
}
