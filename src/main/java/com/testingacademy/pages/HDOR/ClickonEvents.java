package com.testingacademy.pages.HDOR;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ClickonEvents extends CommonToAllPage {
    WebDriver driver;

    public ClickonEvents(WebDriver driver) {
        this.driver = driver;

    }

    By clickonButtonEvent = By.xpath("(//button[text()='Register'])[5]");
    By buyNow= By.xpath("(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-grid-xs-4 css-5l3xqz'])[3]");
    By applyCouponClick = By.xpath("(//div[text()='Apply Coupon'])[1]");
    By applyCoupon = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']");
    By clickOnApply = By.xpath("//button[text()='Apply']");
    By clickOnCancel = By.xpath("//div[@class='MuiGrid-root MuiGrid-container cursor-pointer css-hmrrot']//*[name()='svg']");
    By plusClick = By.xpath("(//div[@class='sc-dcJtft IuNTA'])[2]");


    public void Events() throws InterruptedException {
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "app-header-nav[data-currentapp='USER']";
        Thread.sleep(500);
        SearchContext shadow = driver.findElement(By.cssSelector("app-header-nav[data-currentapp='USER']")).getShadowRoot();
        Thread.sleep(500);
        shadow.findElement(By.cssSelector(" nav:nth-child(3) > div:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();

    }

    public void buttonEventClick() {
        presenceOfElement(clickonButtonEvent);
        Actions action = new Actions(driver);
        WebElement click = driver.findElement(clickonButtonEvent);
        action.moveToElement(click).click().perform();

    }
    public void buyNow(){
        presenceOfElement(buyNow);
        driver.findElement(buyNow).click();
    }
    public void applyCouponClick(){
        presenceOfElement(applyCouponClick);
        Actions action = new Actions(driver);
        WebElement clickApply= driver.findElement(applyCouponClick);
        action.moveToElement(clickApply).click().perform();

    }
    public void applyCoupon(){
        presenceOfElement(applyCoupon);
        driver.findElement(applyCoupon).click();
        presenceOfElement(applyCoupon);
        driver.findElement(applyCoupon).sendKeys("TEST0001");

    }
    public void clickOnApply(){
        presenceOfElement(clickOnApply);
        driver.findElement(clickOnApply).click();
    }
    public void clickOnCancel(){
        presenceOfElement(clickOnCancel);
        driver.findElement(clickOnCancel).click();
    }
    public void plusClick(){
        driver.findElement(plusClick).click();
    }
}
