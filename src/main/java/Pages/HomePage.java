package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wdwait;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    WebElement signIn;
    WebElement homeLogo;
WebElement product;

    public WebElement getSignIn() {
        return driver.findElement(By.linkText("Sign in"));
    }
public void clickOnSignIn(){
        getSignIn().click();
}

    public WebElement getHomeLogo() {
        return driver.findElement(By.id("header_logo"));
    }
    public void clickOnHomeLogo(){
        getHomeLogo().click();
    }

    public WebElement getProduct() {
        return driver.findElement(By.className("product-container"));
    }
    public void clickOnProduct(){
        getProduct().click();
    }


}
