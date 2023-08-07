package behavioral.template;

import behavioral.template.employe.Developer;
import behavioral.template.employe.EmployeeTemplate;
import behavioral.template.employe.Tester;

/**
 * Шаблонный метод.
 * Определяет шаблонный алгоритм в суперклассе для того, чтобы не повторять один и тот же код в подклассах.
 * */
public class Main {

    public static void main(String[] args) {
        EmployeeTemplate developer = new Developer();
        EmployeeTemplate tester = new Tester();

        developer.doAllWork();

        System.out.println("\n===================================\n");

        tester.doAllWork();
    }
}
