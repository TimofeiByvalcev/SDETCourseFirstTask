package tests;

import helpers.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

/**
 * The base class for initialization and configuration web driver.
 */
abstract public class BaseTest {

    /**
     * The driver variable declaration.
     */
    protected static WebDriver driver;

    /**
     * Set base configuration and execute methods before tests.
     */
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
        ReadProperties.readProperties();
    }

    /**
     * Execute methods after tests.
     */
    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
