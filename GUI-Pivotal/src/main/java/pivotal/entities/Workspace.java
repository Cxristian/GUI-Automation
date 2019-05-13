package pivotal.entities;

public class Workspace {
    private String workspaceName;
    private String urlWorkspace;
    private String urlWorkspaceSettings;

    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getUrlWorkspace() {
        return urlWorkspace;
    }

    public void setUrlWorkspace(String urlWorkspace) {
        this.urlWorkspace = urlWorkspace;
    }

    public String getUrlWorkspaceSettings() {
        return urlWorkspaceSettings;
    }

    public void setUrlWorkspaceSettings(String urlWorkspaceSettings) {
        this.urlWorkspaceSettings = urlWorkspaceSettings;
    }
}
