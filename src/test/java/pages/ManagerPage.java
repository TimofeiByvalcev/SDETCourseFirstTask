package pages;

import helpers.ReadProperties;
import helpers.Waiters;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The ManagerPage class provides methods for work with the Manager page.
 */
public class ManagerPage extends BasePage {

    /**
     * Find an Add Customer tab web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//button[@ng-click = 'addCust()']")
    private static WebElement addCustomerTab;

    /**
     * Find a Customers tab web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//button[@ng-click = 'showCust()']")
    private static WebElement customersTab;

    /**
     * Constructor for getting the driver instance from the BasePage class.
     * And also to initialize WebElements(Page Objects) declared in this class using PageFactory.
     */
    public ManagerPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Click Add Customer tab")
    public AddCustomerPage clickAddCustomerTab() {
        Waiters.waitVisibilityOfElement(driver, addCustomerTab);
        addCustomerTab.click();
        return new AddCustomerPage();
    }

    @Step("Click Customers tab")
    public CustomersPage clickCustomersTab() {
        Waiters.waitVisibilityOfElement(driver, customersTab);
        customersTab.click();
        return new CustomersPage();
    }

    @Step("Open Manager page")
    public ManagerPage openManagerPage() {
        driver.get(ReadProperties.readProperty("url"));
        return new ManagerPage();
    }
}
