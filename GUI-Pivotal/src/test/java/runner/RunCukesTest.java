/*
 * @(#) RunCukesTest.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package runner;

import core.selenium.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue={"steps"},
        features = {"src/test/resources/features/workspace.feature"},
        monochrome = true)

public class RunCukesTest extends AbstractTestNGCucumberTests {


    @AfterTest
    public void afterExecution() {

        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("D:\\Fundacion-Jala\\GUI_Repositorio\\GUI-Automation\\GUI-Pivotal\\target\\cucumber.json");

        String buildNumber = "1";
        String projectName = "Pivotel tracker Accounts";
        boolean runWithJenkins = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);
// addidtional metadata presented on main page
        configuration.addClassifications("Platform", "Windows");
        configuration.addClassifications("Browser", "Chrome");
        configuration.addClassifications("Branch", "release/1.0");


        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();

        WebDriverManager.getInstance().getWebDriver().close();
    }
}