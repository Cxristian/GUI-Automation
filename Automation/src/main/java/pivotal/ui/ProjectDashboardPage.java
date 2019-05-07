/*
 * @(#) ProjectDashboardPage.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package pivotal.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectDashboardPage {

    @FindBy(id="login_type_check_form")
    private WebElement dashboardForm;

    @FindBy(id="credentials_username")
    private WebElement userNameTextBox;

    @FindBy(css="input[class='app_signin_action_button']")
    private WebElement nextSignInBtn;

}
