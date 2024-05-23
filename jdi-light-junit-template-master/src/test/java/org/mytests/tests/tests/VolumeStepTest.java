package org.mytests.tests.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mytests.tests.example.BaseTest;
import org.mytests.uiobjects.example.entities.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.mytests.uiobjects.example.site.pages.MusicPage.volume;

public class VolumeStepTest extends BaseTest {
    User user = new User();

    @BeforeEach
    public void setUpTest() {
        loginPage.open();
        loginPage.login.input(user.name);
        loginPage.password.input(user.password);
        loginPage.submit.click();
    }

    @Test
    public void volumeStepTest() {
        feedPage.topPanel.music.click();
        musicPage.checkOpened();
        assertEquals( volume.step(), 5);
    }

    @AfterEach
    public void close(){
        feedPage.profileSettings.click();
        feedPage.toolBar.logoutBtn.click();
        exitPage.confirmBtn.click();
    }
}
