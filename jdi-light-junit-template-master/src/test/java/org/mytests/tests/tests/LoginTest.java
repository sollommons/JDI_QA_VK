package org.mytests.tests.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.*;

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

    @AfterEach
    public void close(){
        feedPage.profileSettings.click();
        feedPage.toolBar.logoutBtn.click();
        exitPage.confirmBtn.click();
    }
}