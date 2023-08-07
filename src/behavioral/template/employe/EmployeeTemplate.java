package behavioral.template.employe;

public abstract class EmployeeTemplate {

    public void doAllWork() {
        startWorkDay();
        doWork();
        writeProgressReportToChat();
    }

    private void startWorkDay() {
        System.out.println("Employee going to work...");
    }

    protected abstract void doWork();

    private void writeProgressReportToChat() {
        System.out.println("Employee writes a report to a chat.");
    }
}
