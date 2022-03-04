package com.it_academy.onliner_tester.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final int DRIVER_WAIT_TIME=20;
    private final WebDriver driver;
    protected WebDriverOpening webDriverOpening;

    public BasePage() {
        webDriverOpening = new WebDriverOpening();
        driver = webDriverOpening.getWebDriver();
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public WebElement waitForElementToBeClickable(WebElement webElement){
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(DRIVER_WAIT_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
