package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * The Waiters class provides a methods to wait for the visibility of a web element.
 */
public class Waiters {

    /**
     * The waitVisibilityOfElement method receives a web element as a parameter.
     */
    public static void waitVisibilityOfElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * The waitVisibilityOfElements method receives a xpath string as a parameter.
     */
    public static void waitVisibilityOfElements(WebDriver driver, String xpathString) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathString)));
    }
}
