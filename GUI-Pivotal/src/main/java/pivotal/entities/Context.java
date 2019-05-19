package pivotal.entities;

public class Context {
    private Workspace workspace;
    private Project project;

    public Context() {
        this.workspace = new Workspace();
        this.project= new Project();
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public Project getProject() {
        return project;
    }

}
