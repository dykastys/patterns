package structure.flyweight;

import structure.flyweight.developer.Developer;
import structure.flyweight.developer_factory.DeveloperFactory;
import structure.flyweight.developer_factory.Speciality;

import java.util.ArrayList;
import java.util.List;

/**
 * Нужен для поддержки множества мелких объектов.
 * Большую часть состояния можно вынести наружу.
 * Объект с определённым состоянием создаётся 1 раз и используется много раз.
 * */
public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.JAVA));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.JAVA));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.JAVA));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.JAVA));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));
        developers.add(developerFactory.getDeveloperBySpeciality(Speciality.CPP));

        developers.forEach(Developer::writeCode);
    }
}
