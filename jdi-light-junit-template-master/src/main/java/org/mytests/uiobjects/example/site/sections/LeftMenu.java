package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Link;

public class LeftMenu extends Section{
    private final static String baseXPath = "*[contains(@class, 'nav-side')]//";
    @XPath("a[@data-l='t,userPage']")
    public Link profile;
    @XPath(baseXPath + "a[@data-l='t,userMain']")
    public Link feed;
    @XPath(baseXPath + "a[@data-l='t,hobby']")
    public Link hobby;
    @XPath(baseXPath + "a[@data-l='t,userFriend']")
    public Link friends;
    @XPath(baseXPath + "a[@data-l='t,userPhotos']")
    public Link photos;
    @XPath(baseXPath + "a[@data-l='t,userAltGroup']")
    public Link groups;
    @XPath(baseXPath + "a[@data-l='t,appsShowcaseHD']")
    public Link games;
    @XPath(baseXPath + "a[@data-l='t,giftsFront']")
    public Link gifts;
    @XPath(baseXPath + "a[@data-l='t,discovery']")
    public Link recommendations;
    @XPath(baseXPath + "a[@data-l='t,bizApps]'")
    public Link apps;
    @XPath(baseXPath + "a[@data-l=t,appsDating]")
    public Link dating;
}
