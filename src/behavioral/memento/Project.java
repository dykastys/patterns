package behavioral.memento;

import java.util.Date;

public class Project {

    private String version;

    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public ProjectSaver save() {
        return new ProjectSaver(this.version);
    }

    public void load(ProjectSaver saver) {
        this.version = saver.getVersion();
        this.date = saver.getDate();
    }

    @Override
    public String toString() {
        return "Project: " +
                "version='" + version + '\'' +
                ", date=" + date;
    }
}
