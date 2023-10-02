package tests;

import helpers.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

abstract public class BaseTest {

    protected static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
        ReadProperties.readProperties();
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
