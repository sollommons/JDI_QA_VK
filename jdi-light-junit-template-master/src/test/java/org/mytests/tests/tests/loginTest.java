package org.mytests.tests.tests;

import org.junit.jupiter.api.Test;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.loginPage;

public class loginTest {
    User user = new User();

    @Test
    public void loginTest() {
        loginPage.open();
        loginPage.login.input(user.name);
        loginPage.password.input(user.password);
        loginPage.submit.click();
    }
}
