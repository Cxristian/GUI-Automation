/*
 * @(#) ProjectApi.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package pivotal.api;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pivotal.entities.Project;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class ProjectApi {

    String url =  "https://www.pivotaltracker.com/services/v5/projects";


    public void createAProject(Project project) {

            Map<String,String> newProject = new HashMap<>();
            newProject.put("name", project.getNameProject());
            Response response = given().headers("X-TrackerToken","fa8b8b2d9fd0a6b5beea1c8e232daa67",
                    "Content-Type", "application/json").
                    auth().basic("user","pass").
                    body(newProject).
                    when().
                    request("POST", url);

        project.setId(response.body().jsonPath().getInt("id"));
    }

    public void deleteAProject(Project project) {

        String idProjectAsString = String.valueOf(project.getId());
        Response response = given().headers("X-TrackerToken","fa8b8b2d9fd0a6b5beea1c8e232daa67",
                "Content-Type", "application/json").
                auth().basic("user","pass").
                when().
                request("DELETE",url + "/" + idProjectAsString);
    }

    public static ProjectApi getInstance() {
        return new ProjectApi();
    }

}
