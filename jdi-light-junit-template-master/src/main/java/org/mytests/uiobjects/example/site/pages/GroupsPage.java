package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.mytests.uiobjects.example.site.sections.TopPanel;

@Url("/groups")
public class GroupsPage extends WebPage {

    @UI("#hook_Block_SideNavigation " +
            "> #hook_Block_Navigation " +
            "> .navigation " +
            "> .nav-side " +
            "> .nav-side_i-w")
    public LeftMenu leftMenu;
    @UI("#topPanel" +
            "> .toolbar" +
            "> .toolbar_decor" +
            "> [data-l=t,navigationToolbar]")
    public TopPanel topPanel;

    @XPath(".//input[@placeholder='Поиск по группам']") @WaitAfterAction(2)
    public TextField search;
}
