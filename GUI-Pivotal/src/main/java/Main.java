/*
 * @(#) Main.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

import core.selenium.WebDriverConfig;
import pivotal.api.WorkspaceApi;


public class Main {


    public static void main(String[] args) {
        System.out.println(WebDriverConfig.getInstance().getExplicitWaitTime());
    }
}
