package org.mytests.tests.tests;

import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.feedPage;
import static org.mytests.uiobjects.example.site.SiteJdi.loginPage;

public class LoginTest extends BaseTest {
    User user = new User();

    @Test
    public void loginTest() {
        loginPage.open();
        loginPage.login.input(user.name);
        loginPage.password.input(user.password);
        loginPage.submit.click();
        feedPage.homeBtn.click();
        feedPage.checkOpened();
    }
}