package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.mytests.uiobjects.example.site.sections.TopPanel;
import org.mytests.uiobjects.example.site.sections.UserToolBar;

@Url("/guests")
public class GuestsPage extends WebPage {
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

    @UI("#user-dropdown-menu " +
            "> .toolbar_accounts-items " +
            "> div")
    public UserToolBar toolBar;

    @XPath("//button[@aria-label='Настройки профиля']")
    public Button profileSettings;

    @XPath(".//input[@placeholder='Искать друзей']") @WaitAfterAction(2)
    public TextField search;

    @UI("#hook_Block_MyFriendsFriendSearchPagingB > .stub-empty > .stub-empty_t")
    @WaitAfterAction
    public Text noFriendsText;

    @UI("#hook_Block_UserFriendsMenu > .friends-menu > nav[role=navigation] > .mctc_navMenuDropdownSec")
    public Button friendsMenuMoreBtn;

    @UI("#mctc_navMenuDDC_popup_userFriendMenuMore > .mctc_navMenuDDL")
    public Dropdown friendsMenuDropdown;

}
