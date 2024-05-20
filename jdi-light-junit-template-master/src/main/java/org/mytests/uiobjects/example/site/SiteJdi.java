package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.FeedPage;
import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.pages.MusicPage;


@JSite("https://ok.ru/")
public class SiteJdi {
    public static LoginPage loginPage;
    public static FeedPage feedPage;
    public static MusicPage musicPage;

}
