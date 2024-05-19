package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.LoginPage;

@JSite("https://ok.ru/")
public class SiteJdi {
    public static LoginPage loginPage = new LoginPage();
}
