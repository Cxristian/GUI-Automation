/*
 * @(#) FactoryBrowser.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

public class FactoryBrowser {

    public static WebDriver getManager(TypeBrowser type) {
        WebDriver driverManager;

        switch (type) {
            case CHROME:
                driverManager = new Chrome().initDriver();
                break;
            case FIREFOX:
                driverManager = new FireFox().initDriver();
                break;
            default:
                driverManager = new Chrome().initDriver();
                break;
        }
        return driverManager;
    }
}
