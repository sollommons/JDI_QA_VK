package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;

import java.awt.*;

@Url("https://ok.ru/") @Title("Login Page")
public class LoginPage extends WebPage {
    @UI("[id=field_email]")
    public TextField login;
    @UI("[id=field_password]")
    public TextField password;

    @XPath("//*[@value='Войти в Одноклассники']")
    public Button submit;
}
