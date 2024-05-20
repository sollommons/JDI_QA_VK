 package org.mytests.tests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.Keys;

import static org.mytests.uiobjects.example.site.SiteJdi.*;

 public class FindFriendFromTopPanelTest extends BaseTest {
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
     }
     @Test
     public void loginTest() {
         feedPage
                 .topPanel
                 .guests
                 .click();
         guestsPage.checkOpened();
         guestsPage.search.sendKeys(friendName);
         guestsPage.search.press(Keys.ENTER);
         guestsPage.myFriendsSection.show();
         Assertions.assertTrue(guestsPage.myFriendsSection.isVisible(),
                 "MyFriendsSection is not visible");
    }
}