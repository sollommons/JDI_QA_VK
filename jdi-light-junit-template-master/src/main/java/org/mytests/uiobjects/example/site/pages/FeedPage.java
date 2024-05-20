package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;


@Url("/feed") @Title("Feed Page")
public class FeedPage extends WebPage{
    @UI("[id=topPanelLeftCorner]")
    public Button homeBtn;

    @XPath("//*[@aria-label='Музыка']")
    public Button musicBtn;
}
