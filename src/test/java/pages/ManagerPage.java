package pages;

import helpers.ReadProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerPage extends BasePage {

    @FindBy(xpath = "//button[@ng-click = 'addCust()']")
    private static WebElement addCustomerTab;

    @FindBy(xpath = "//button[@ng-click = 'showCust()']")
    private static WebElement customersTab;

    public ManagerPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Click Add Customer tab")
    public AddCustomerPage clickAddCustomerTab() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(addCustomerTab));
        addCustomerTab.click();
        return new AddCustomerPage();
    }

    @Step("Click Customers tab")
    public CustomersPage clickCustomersTab() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(customersTab));
        customersTab.click();
        return new CustomersPage();
    }

    @Step("Open Manager page")
    public ManagerPage openManagerPage() {
        driver.get(ReadProperties.readProperty("url"));
        return new ManagerPage();
    }
}
