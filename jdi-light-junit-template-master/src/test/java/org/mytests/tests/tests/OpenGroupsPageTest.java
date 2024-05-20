package org.mytests.tests.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.*;

public class OpenGroupsPageTest extends BaseTest {
    String name = "technopol66";
    String password = "technopolisPassword";
    long id = 576417343743L;
    User user = new User(name, password, id);
    @Test
    public void openGroupsPageTest(){
        loginPage.open();
        loginPage.login.input(user.name);
        loginPage.password.input(user.password);
        loginPage.submit.click();
        leftMenu.profile.click();
        //groupsPage.checkOpened();
    }
}
