 package org.mytests.tests.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.mytests.uiobjects.example.site.SiteJdi.*;

 public class GuestsPageDropdownMenuTest extends BaseTest {
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
     public void guestsPageDropdownMenuTest() {
         feedPage.topPanel.guests.click();
         guestsPage.checkOpened();
         guestsPage.friendsMenuMoreBtn.click();
         Assertions.assertTrue(guestsPage.friendsMenuDropdown.isVisible());
    }

     @AfterEach
     public void close(){
         guestsPage.profileSettings.click();
         guestsPage.toolBar.logoutBtn.click();
         exitPage.confirmBtn.click();
     }
}