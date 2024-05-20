package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Link;

public class TopPanel extends Section {
    private static final String toolbarBaseXpath = ".//nav[@role='navigation']//ul//";
    @XPath(toolbarBaseXpath + "li[@data-l='t,messages']")
    public Link messages;
    @XPath(toolbarBaseXpath + "li[@data-l='t,discussions']")
    public Link discussions;
    @XPath(toolbarBaseXpath + "li[@data-l='t,notifications']")
    public Link notifications;
    @XPath(toolbarBaseXpath + "li[@data-l='t,guests']")
    public Link guests;
    @XPath(toolbarBaseXpath + "li[@data-l='t,marks']")
    public Link marks;
    @XPath(toolbarBaseXpath + "li[@data-l='t,video']")
    public Link video;
    @XPath(toolbarBaseXpath + "li[@data-l='t,music']")
    public Link music;


}
