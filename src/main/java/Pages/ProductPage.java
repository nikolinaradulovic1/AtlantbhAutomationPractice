package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wdwait;

    public ProductPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    WebElement quantity;
    WebElement size;
    List<WebElement> sizeList;
    WebElement addToCartButton;
    WebElement proceedToCheckout;

    public WebElement getQuantity() {
        return driver.findElement(By.id("quantity_wanted"));
    }
    public void enterQuantity(String quantity){
        getQuantity().sendKeys(quantity);
    }

    public WebElement getSize() {
        return driver.findElement(By.id("group_1"));
    }
    public void clickOnSize(){
        getSize().click();
    }

    public List<WebElement> getSizeList() {
        return driver.findElements(By.xpath("//select[@id='group_1']//option"));
    }
    public void selectSize(String size){
        for (int i = 0; i < getSizeList().size(); i++) {
            if (getSizeList().get(i).getText().equalsIgnoreCase(size)) {
                getSizeList().get(i).click();
            }

        }
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.name("Submit"));
    }
    public void clickOnAddToCartButton(){
        getAddToCartButton().click();
    }
    public WebElement getProceedToCheckout() {
        return driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
    }
    public void clickOnProceedToCheckoutButton(){
        getProceedToCheckout().click();
    }
}

