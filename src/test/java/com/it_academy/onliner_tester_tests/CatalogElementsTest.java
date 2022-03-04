package com.it_academy.onliner_tester_tests;

import com.it_academy.onliner_tester.navigation.OnlinerNavigation;
import com.it_academy.onliner_tester.page_object.OnlinerHomePage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

public class CatalogElementsTest {
    private static final OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @BeforeAll
    public static void navigateToOnlinerSite() {
        OnlinerNavigation.navigateToOnlinerHomePage();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("Presence elements in Catalog test")
    @Test
    public void testIfElements_PresentInCatalog() {
        List<String> catalogElements = onlinerHomePage.clickOnCatalogLink()
                .getListOfCatalogElements();
        Iterator<String> catalogElementsIterator = catalogElements.iterator();
        assertThat(catalogElementsIterator)
                .as("Catalog elements are not presented")
                .isNotNull()
                .hasNext();
    }

    @AfterAll
    public static void closeBrowser() {
        onlinerHomePage.closeBrowser();
    }
}
