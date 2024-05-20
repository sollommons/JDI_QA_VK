package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.mytests.uiobjects.example.site.sections.TopPanel;
import org.openqa.selenium.WebElement;

@Url("/feed")
public class FeedPage extends WebPage{

    @UI("#hook_Block_SideNavigation" +
            "> #hook_Block_Navigation" +
            "> .navigation" +
            "> .nav-side")
    public LeftMenu leftMenu;
    @UI("#topPanel" +
            "> .toolbar" +
            "> .toolbar_decor")
    public TopPanel topPanel;
    @UI("[id=topPanelLeftCorner]")
    public Button homeBtn;

    @UI("#hook_Block_MainFeedsContent")
    public WebElement mainFeedsContent;

    public void checkPage(){
        mainFeedsContent.isDisplayed();
    }
}
