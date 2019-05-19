/*
 * @(#) ProjectStep.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package steps;

import cucumber.api.java.en.Given;
import pivotal.api.ProjectApi;
import pivotal.entities.Context;


public class ProjectStep {

    private final Context context;

    public ProjectStep (Context context) {
        this.context = context;
    }

    @Given("^I create a project with the name \"([^\"]*)\"$")
    public void createAProjectWithTheName(String projectName) {
        context.getProject().setNameProject(projectName);
        ProjectApi.getInstance().createAProject(context.getProject());
    }
}
