package Test;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {


    @BeforeMethod
    public void pageSetUp() {

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
public void enterUserData(){
    wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
    signIn.clickOnMrTitle();
    signIn.enterName("Nikolina");
    signIn.enterLastName("Radulovic");
    signIn.enterPassword("123456789");
    signIn.selectDayOfBirth("15");
    signIn.selectMonthOfBirth("5");
    signIn.selectYearOfBirth("1993");
    // scrollIntoView(signIn.getAddress());
    signIn.enterAddress("Sarajevska");
    signIn.enterCity("Sarajevo");
    signIn.clickOnStates();
    signIn.selectState("Alaska");
    signIn.enterZipCode("55555");
    signIn.enterMobilePhone("069178456");
    signIn.clickRegisterButton();

}
    @Test
    public void verifyThatUserCanRegister(){
        homePage.clickOnSignIn();
        signIn.enterEmail("nikolinaa12347@gmail.com");
        signIn.clickOnCreateAnAccountButton();
        enterUserData();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=my-account");
        Assert.assertEquals(signIn.getMessage().getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");

    }
    @Test
    public void verifyThatUserCanLogIn(){
        homePage.clickOnSignIn();
        signIn.enterLoginEmail("nikolina12347@gmail.com");
        signIn.enterPassword("123456789");
        signIn.clickOnSignInButton();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=my-account");
        Assert.assertEquals(signIn.getMessage().getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");

    }
    @Test
    public void verifyThatUserCanBuyProduct() throws InterruptedException {
        homePage.clickOnSignIn();
        signIn.enterLoginEmail("nikolina12347@gmail.com");
        signIn.enterPassword("123456789");
        signIn.clickOnSignInButton();
        homePage.clickOnHomeLogo();
        homePage.clickOnProduct();
        productPage.enterQuantity("3");
        productPage.clickOnSize();
        productPage.selectSize("m");
        productPage.clickOnAddToCartButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(productPage.getProceedToCheckout()));
        productPage.clickOnProceedToCheckoutButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(cartPage.getProceedToCheckoutSummary()));
        cartPage.clickOnProceedToCheckOut();
        wdwait.until(ExpectedConditions.elementToBeClickable(cartPage.getProceedToCheckOutAddress()));
        cartPage.clickOnProceedToCheckOutinAddress();
        Thread.sleep(1000);
        cartPage.selectTermsOfService();
        cartPage.clickOnProceedToCheckOutinShipping();
        cartPage.clickPayByBankWire();
        wdwait.until(ExpectedConditions.elementToBeClickable(cartPage.getiConfirmMyOrderButton()));
        cartPage.clickOnIConfirmMyOrderButton();
        Assert.assertTrue(cartPage.getConfirmationPayment().isDisplayed());

    }

}
