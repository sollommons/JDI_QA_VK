package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.FeedPage;
import org.mytests.uiobjects.example.site.pages.GroupsPage;
import org.mytests.uiobjects.example.site.pages.GuestsPage;
import org.mytests.uiobjects.example.site.pages.LoginPage;

@JSite("https://ok.ru/")
public class SiteJdi {
    public static LoginPage loginPage;
    public static FeedPage feedPage;
    public static GroupsPage groupsPage;
    public static GuestsPage guestsPage;

}
