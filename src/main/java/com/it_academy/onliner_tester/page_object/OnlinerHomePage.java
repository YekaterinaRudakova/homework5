package com.it_academy.onliner_tester.page_object;

import com.it_academy.onliner_tester.drivers.BasePage;
import org.openqa.selenium.By;

public class OnlinerHomePage extends BasePage {

    private static final By CATALOG_LINK_XPATH_PATTERN =
            By.xpath("//*[contains(@class, 'b-main-page-blocks-header-2 cfix')]//a[contains(text(), 'Каталог')]");

    public OnlinerHomePage() {
        super();
    }

    public CatalogPage clickOnCatalogLink() {
        waitForElementToBeClickable(findElement(CATALOG_LINK_XPATH_PATTERN)).click();
        return new CatalogPage();
    }

    @Override
    public void navigate(String url) {
        super.navigate(url);
    }
}
