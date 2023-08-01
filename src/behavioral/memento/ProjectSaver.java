package behavioral.memento;

import java.util.Date;

public class ProjectSaver {

    private final String version;

    private final Date date;

    public ProjectSaver(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
