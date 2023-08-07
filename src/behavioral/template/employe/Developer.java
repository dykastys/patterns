package behavioral.template.employe;

public class Developer extends EmployeeTemplate {

    @Override
    protected void doWork() {
        System.out.println("Developer writes code...");
    }
}
