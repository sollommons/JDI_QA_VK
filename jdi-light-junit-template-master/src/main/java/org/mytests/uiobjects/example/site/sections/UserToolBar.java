package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;

public class UserToolBar extends Section {
    @XPath("//a[@data-l='t,logout']")
    public Button logoutBtn;
}
