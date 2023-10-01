package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    public static AddCustomerPage clickAddCustomerTab() {

        addCustomerTab.click();
        return new AddCustomerPage();
    }
    @Step("Click Customers tab")
    public static CustomersPage clickCustomersTab() {
        customersTab.click();
        return new CustomersPage();
    }
    @Step("Open Manager page")
    public static ManagerPage openManagerPage() {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
        return new ManagerPage();
    }
}
