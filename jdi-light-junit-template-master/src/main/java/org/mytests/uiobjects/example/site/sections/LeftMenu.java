package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;

public class LeftMenu extends Section{
    @UI("a[data-l=t,userPage]")
    public Link profile;
    @UI("a[data-l=t,userMain]")
    public Link feed;
    @UI("a[data-l=t,hobby]")
    public Link hobby;
    @UI("a[data-l=t,userFriend]")
    public Link friends;
    @UI("a[data-l=t,userPhotos]")
    public Link photos;
    @UI("a[data-l=t,userAltGroup]")
    public Link groups;
    @UI("a[data-l=t,appsShowcaseHD]")
    public Link games;
    @UI("a[data-l=t,giftsFront]")
    public Link gifts;
    @UI("a[data-l=t,discovery]")
    public Link recommendations;
    @UI("a[data-l=t,bizApps]")
    public Link apps;
    @UI("a[data-l=t,appsDating]")
    public Link dating;
}
