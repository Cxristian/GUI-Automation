/*
 * @(#) WorkspaceApi.java Copyright (c) 2019. Jala Foundation.
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


import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class WorkspaceApi {

    public void deleteAWorkspace(int workspaceId) {
        String url =  "https://www.pivotaltracker.com/services/v5/my/workspaces/";
        Response response = given().headers("X-TrackerToken","fa8b8b2d9fd0a6b5beea1c8e232daa67",
                "Content-Type", "application/json").
                auth().basic("user","pass").
                when().
                request("DELETE", url + workspaceId);
    }

    public static WorkspaceApi getInstance () {
        return new WorkspaceApi();
    }
}
