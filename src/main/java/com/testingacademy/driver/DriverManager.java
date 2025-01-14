package com.testingacademy.driver;

import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.Locale;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static void init() {
        String browser = null;
        browser = PropertyReader.readKey("browser");
        browser = browser.toLowerCase();
        if (driver == null) {
            switch (browser) {
                case "edge":
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                default:
                    System.out.println("Browser not found!!");
            }
        }

    }

    public static void down() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}
