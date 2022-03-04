package com.it_academy.onliner_tester_tests;

import com.it_academy.onliner_tester.navigation.OnlinerNavigation;
import com.it_academy.onliner_tester.page_object.CatalogPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    public static final CatalogPage catalogPage = new CatalogPage();

    @BeforeAll
    public static void navigateToCatalogPage() {
        OnlinerNavigation.navigateToCatalogPage();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void closeBrowser() {
        catalogPage.closeBrowser();
    }
}
