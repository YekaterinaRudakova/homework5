package com.it_academy.onliner_tester.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverOpening {
    private static ThreadLocal<RemoteWebDriver> remoteWebDriverThreadLocal =
            new ThreadLocal<>();

    public WebDriverOpening() {
        if (remoteWebDriverThreadLocal.get() == null) {
            startBrowser();
        }
    }

    private void startBrowser() {
        setWebDriver(Driver.getByDriverType(System.getProperty("driverType"))
                .getWebDriverCreator().create());
    }

    private static void setWebDriver(RemoteWebDriver driver) {
        remoteWebDriverThreadLocal.set(driver);
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    public WebDriver getWebDriver() {
        return remoteWebDriverThreadLocal.get();
    }
}
