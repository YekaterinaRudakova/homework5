package com.it_academy.onliner_tester.navigation;

import com.it_academy.onliner_tester.page_object.CatalogPage;
import com.it_academy.onliner_tester.page_object.OnlinerHomePage;

public class OnlinerNavigation {
    public static void navigateToOnlinerHomePage() {
        new OnlinerHomePage().navigate("https://www.onliner.by/");
    }

    public static void navigateToCatalogPage(){
        new CatalogPage().navigate("https://catalog.onliner.by/");
    }
}
