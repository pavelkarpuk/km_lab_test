package web.pages;

import com.codeborne.selenide.Selenide;

public class HomePage {

    private static final String URL = "https://www.onliner.by/";

    private final String pageHeaderButtons = "//span[contains(text(), '%s')]/parent::a[@class = 'b-main-navigation__link']";

    public void navigateToPage() {
        Selenide.open(URL);
    }

    public void clickCatalogButton() {
        Selenide.$x(String.format(pageHeaderButtons, "Каталог")).click();
    }
}
