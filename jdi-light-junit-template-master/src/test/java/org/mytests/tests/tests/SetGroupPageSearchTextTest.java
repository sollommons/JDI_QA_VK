package org.mytests.tests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.junit.Assert.assertTrue;
import static org.mytests.uiobjects.example.site.SiteJdi.*;

public class SetGroupPageSearchTextTest extends BaseTest {
    String name = "technopol66";
    String password = "technopolisPassword";
    long id = 576417343743L;
    User user = new User(name, password, id);

    @BeforeEach
    public void init(){
        loginPage.open();
        loginPage.login.input(user.name);
        loginPage.password.input(user.password);
        loginPage.submit.click();
        feedPage.checkPage();
    }
    @Test
    public void setGroupPageSearchTextTest(){
        feedPage
                .leftMenu
                .groups
                .click();
        groupsPage.checkUrl("profile/" + user.id + "/groups");
        groupsPage
                .search
                .setText("Text");
        Assertions.assertEquals(groupsPage.search.getText(), "Text",
                "Text in search textField does not match entered text.");
    }
}
