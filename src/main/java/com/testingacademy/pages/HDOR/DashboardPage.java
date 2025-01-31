package com.testingacademy.pages.HDOR;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends CommonToAllPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }
        //Page Locator
        By clickOnTDH = By.xpath("(//div[@class='MuiCardContent-root css-sq4f3k'])[1]");
        By divToScroll = By.xpath("//h6[text()='Finisher Level']");

        //Page Actions
        public void setClickOnTDH(){
            driver.findElement(clickOnTDH).click();
        }
        public  void scrollScreen(){
            presenceOfElement(divToScroll);
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            WebElement div = driver.findElement(divToScroll);
//            js.executeScript("arguments[0].scrollIntoView(true);",div);
        }


}
