package Base;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public SignIn signIn;
    public ProductPage productPage;
    public CartPage cartPage;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        homePage= new HomePage(driver, wdwait);
        signIn=new SignIn(driver,wdwait);
        productPage=new ProductPage(driver,wdwait);
        cartPage=new CartPage(driver,wdwait);
    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @AfterMethod
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.quit();
    }
}