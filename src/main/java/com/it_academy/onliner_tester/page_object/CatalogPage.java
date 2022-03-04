package com.it_academy.onliner_tester.page_object;

import com.it_academy.onliner_tester.drivers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage extends BasePage {

    private static final By CATALOG_LIST_OF_ELEMENTS_XPATH_PATTERN =
            By.xpath("//*[@class = 'catalog-navigation-classifier ']//*[@class = 'catalog-navigation-classifier__item ']");
    public static final By COMPUTERS_AND_NETS_SECTION=
            By.xpath("//*[contains(@class," +
                    "'catalog-navigation-classifier__item-title-wrapper') " +
                    "and contains(text(), 'Компьютеры и\u00A0сети')]");


    public CatalogPage() {
        super();
    }

    public List<String> getListOfCatalogElements() {
        List<String> catalogElementsTitles = new ArrayList<>();
        List<WebElement> catalogElements = findElements(CATALOG_LIST_OF_ELEMENTS_XPATH_PATTERN);
        catalogElements.stream().map(WebElement::getText).forEach(catalogElementsTitles::add);
        return catalogElementsTitles;
    }

    public ComputersAndNetsPage clickOnComputersAnsNetsSection(){
        waitForElementToBeClickable(findElement(COMPUTERS_AND_NETS_SECTION)).click();
        return new ComputersAndNetsPage();
    }

    @Override
    public void navigate(String url) {
        super.navigate(url);
    }
}
