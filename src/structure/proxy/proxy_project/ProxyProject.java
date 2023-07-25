package structure.proxy.proxy_project;

import structure.proxy.project.Project;
import structure.proxy.project.RealProject;

public class ProxyProject implements Project {

    private final String url;

    private Project realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
