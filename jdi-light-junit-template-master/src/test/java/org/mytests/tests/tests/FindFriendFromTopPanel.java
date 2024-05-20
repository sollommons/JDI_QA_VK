package org.mytests.tests.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.*;

public class FindFriendFromTopPanel extends BaseTest {
    String friendName = "technopol60";
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
    public void findFriendFromTopPanel(){
        feedPage
                .topPanel
                .guests
                .click();
        guestsPage
                .search
                .sendKeys(friendName + '\n');
        Assertions.assertTrue(guestsPage.myFriendsSection.hasClass("hookBlock"),
                "MyFriendsSection does not have hookBlock class");

    }
}
