package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.mytests.uiobjects.example.site.sections.TopPanel;
import org.mytests.uiobjects.example.site.sections.UserToolBar;

@Url("/groups")
public class GroupsPage extends WebPage {

    @UI("#hook_Block_SideNavigation " +
            "> #hook_Block_Navigation " +
            "> .navigation " +
            "> .nav-side " +
            "> .nav-side_i-w")
    public LeftMenu leftMenu;

    @UI("#user-dropdown-menu " +
            "> .toolbar_accounts-items " +
            "> div")
    public UserToolBar toolBar;

    @UI("#topPanel" +
            "> .toolbar" +
            "> .toolbar_decor > .toolbar_c")
    public TopPanel topPanel;

    @XPath("//button[@aria-label='Настройки профиля']")
    public Button profileSettings;

    @XPath(".//input[@placeholder='Поиск по группам']") @WaitAfterAction(2)
    public TextField search;
}
