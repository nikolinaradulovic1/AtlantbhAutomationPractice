package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage {

    WebDriver driver;
    WebDriverWait wdwait;

    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    WebElement proceedToCheckoutSummary;
    WebElement proceedToCheckOutAddress;
    WebElement proceedToCheckOutShipping;
    WebElement termsOfService;
    WebElement payByBankWire;
    WebElement iConfirmMyOrderButton;
    WebElement confirmationPayment;

    public WebElement getProceedToCheckoutSummary() {
        return driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
    }
    public void clickOnProceedToCheckOut(){
        getProceedToCheckoutSummary().click();
    }

    public WebElement getProceedToCheckOutAddress() {
        return driver.findElement(By.name("processAddress"));
    }
    public void clickOnProceedToCheckOutinAddress(){
        getProceedToCheckOutAddress().click();
    }

    public WebElement getProceedToCheckOutShipping() {
        return driver.findElement(By.name("processCarrier"));
    }
    public void clickOnProceedToCheckOutinShipping(){
        getProceedToCheckOutShipping().click();
    }

    public WebElement getTermsOfService() {
        return driver.findElement(By.id("cgv"));
    }

    public void selectTermsOfService(){
        getTermsOfService().click();
    }

    public WebElement getPayByBankWire() {
        return driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
    }

    public void clickPayByBankWire(){
        getPayByBankWire().click();
    }

    public WebElement getiConfirmMyOrderButton() {
        return driver.findElement(By.cssSelector("button.btn.btn-default.button-medium"));
    }
    ////button[@type='submit']
    public void clickOnIConfirmMyOrderButton(){
        getiConfirmMyOrderButton().click();
    }

    public WebElement getConfirmationPayment() {
        return driver.findElement(By.className("cheque-indent"));
    }
}
