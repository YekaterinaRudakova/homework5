package com.it_academy.onliner_tester.drivers;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverCreator<T extends RemoteWebDriver> {
    T create();
}
