package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.mytests.uiobjects.example.site.pages.FeedPage;
import org.mytests.uiobjects.example.site.pages.GroupsPage;
import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.sections.LeftMenu;

@JSite("https://ok.ru/")
public class SiteJdi {
    public static LoginPage loginPage;
    public static FeedPage feedPage;
    public static GroupsPage groupsPage;

    @UI("#hook_Block_SideNavigation > #hook_Block_Navigation > .navigation > .nav-side > .nav-side_i-w") public static LeftMenu leftMenu;
}
