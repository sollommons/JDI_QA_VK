package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.mytests.uiobjects.example.site.sections.TopPanel;
import org.mytests.uiobjects.example.site.sections.UserToolBar;
import org.openqa.selenium.WebElement;

@Url("/feed")
public class FeedPage extends WebPage{
    @XPath("//button[@aria-label='Настройки профиля']")
    public Button profileSettings;

    @UI("#user-dropdown-menu " +
            "> .toolbar_accounts-items " +
            "> div")
    public UserToolBar toolBar;

    @UI("#hook_Block_SideNavigation" +
            "> #hook_Block_Navigation" +
            "> .navigation" +
            "> .nav-side")
    public LeftMenu leftMenu;

    @UI("#topPanel" +
            "> .toolbar" +
            "> .toolbar_decor > .toolbar_c")
    public TopPanel topPanel;

    @UI("[id=topPanelLeftCorner]")
    public Button homeBtn;

    @UI("#hook_Block_MainFeedsContent")
    public WebElement mainFeedsContent;

    public void checkPage(){
        mainFeedsContent.isDisplayed();
    }
}
