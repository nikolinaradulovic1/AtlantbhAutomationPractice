package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SignIn {

    WebDriver driver;
    WebDriverWait wdwait;

    public SignIn(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    WebElement email;
    WebElement createAccountButton;
    WebElement title;
    WebElement firstName;
    WebElement lastName;
    WebElement password;
    WebElement day;
    WebElement month;
    WebElement year;
    WebElement address;
    WebElement city;
    WebElement state;
    List<WebElement> stateList;
    WebElement zipCode;
    WebElement mobilePhone;
    WebElement registerButton;
    WebElement message;
    WebElement loginEmail;
    WebElement SignInButton;

    public WebElement getEmail() {
        return driver.findElement(By.id("email_create"));
    }

    public void enterEmail(String email) {
        getEmail().sendKeys(email);
    }

    public WebElement getCreateAccountButton() {
        return driver.findElement(By.id("SubmitCreate"));
    }

    public void clickOnCreateAnAccountButton() {
        getCreateAccountButton().click();
    }

    public WebElement getTitle() {
        return driver.findElement(By.id("id_gender1"));
    }

    public void clickOnMrTitle() {
        getTitle().click();
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public void enterName(String name) {
        getFirstName().sendKeys(name);
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("customer_lastname"));
    }

    public void enterLastName(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("passwd"));
    }

    public void enterPassword(String password) {
        getPassword().sendKeys(password);
    }

    public WebElement getDay() {
        return driver.findElement(By.id("days"));
    }

    public WebElement getMonth() {
        return driver.findElement(By.id("months"));
    }

    public WebElement getYear() {
        return driver.findElement(By.id("years"));
    }

    public void selectDayOfBirth(String day) {
        String xpathValue = "//select[@id='days']/option[@value='" + day + "']";
        getDay().click();
        driver.findElement(By.xpath(xpathValue)).click();
    }

    public void selectMonthOfBirth(String month) {
        String xpathValue = "//select[@id='months']/option[@value='" + month + "']";
        getMonth().click();
        driver.findElement(By.xpath(xpathValue)).click();
    }

    public void selectYearOfBirth(String year) {
        String xpathValue = "//select[@id='years']/option[@value='" + year + "']";
        getYear().click();
        driver.findElement(By.xpath(xpathValue)).click();

    }

    public WebElement getAddress() {
        return driver.findElement(By.id("address1"));
    }

    public void enterAddress(String address) {
        getAddress().sendKeys(address);
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }

    public void enterCity(String city) {
        getCity().sendKeys(city);
    }

    public WebElement getState() {
        return driver.findElement(By.id("id_state"));
    }

    public void clickOnStates() {
        getState().click();
    }

    public List<WebElement> getStateList() {
        return driver.findElements(By.xpath("//select[@id='id_state']//option"));
    }

    public void selectState(String state) {
        for (int i = 0; i < getStateList().size(); i++) {
            if (getStateList().get(i).getText().equals(state)) {
                getStateList().get(i).click();
            }

        }
    }

    public WebElement getZipCode() {
        return driver.findElement(By.id("postcode"));
    }

    public void enterZipCode(String zipCode) {
        getZipCode().sendKeys(zipCode);
    }

    public WebElement getMobilePhone() {
        return driver.findElement(By.id("phone_mobile"));
    }

    public void enterMobilePhone(String phone) {
        getMobilePhone().sendKeys(phone);
    }

    public WebElement getRegisterButton() {
        return driver.findElement(By.id("submitAccount"));
    }

    public void clickRegisterButton() {
        getRegisterButton().click();
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("info-account"));
    }

    public WebElement getLoginEmail() {
        return driver.findElement(By.id("email"));
    }

    public void enterLoginEmail(String email) {
        getLoginEmail().sendKeys(email);
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.id("SubmitLogin"));
    }

    public void clickOnSignInButton() {
        getSignInButton().click();
    }
}
